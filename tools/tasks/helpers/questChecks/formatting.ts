import { logWarn } from "#utils/log.js";

const isAvailableForFormatting = /[0-9a-ek-or]/;

export default function stripOrThrowExcessSpacesOrFormatting(
	shouldCheck: boolean,
	value: string,
	id: number,
	name: string,
	key: string,
): string {
	let formattingResult = stripOrThrowExcessFormatting(
		shouldCheck,
		value,
		id,
		name,
		key,
	);

	const trimmedResult = formattingResult.trim();

	if (trimmedResult !== formattingResult) {
		if (shouldCheck)
			throw new Error(
				`${name} with ID ${id} at ${key} has Extra Spaces or New Lines at Beginning or End!`,
			);
		logWarn(
			`Removing Extra Spaces or New Lines in ${name} with ID ${id} at ${key}...`,
		);
		formattingResult = trimmedResult;
	}

	if (!value.includes("\n")) return formattingResult;

	const builder: string[] = [];
	for (const bit of formattingResult.split("\n")) {
		const trimmedBit = bit.trim();

		if (trimmedBit !== bit) {
			if (shouldCheck)
				throw new Error(
					`${name} with ID ${id} at ${key} has Extra Spaces at Beginning or End of a Line!`,
				);
			logWarn(
				`Removing Extra Spaces in a Line of ${name} with ID ${id} at ${key}...`,
			);
		}

		builder.push(trimmedBit);
	}
	return builder.join("\n");
}

function stripOrThrowExcessFormatting(
	shouldCheck: boolean,
	value: string,
	id: number,
	name: string,
	key: string,
): string {
	if (!value.includes("§")) return value;

	let builder: string[] = [];
	let emptyAmt: number = 0;
	// Start off as 'r', so we can remove initial redundant 'r'
	let prevFormat: string = "r";

	for (let i = 0; i < value.length; i++) {
		const char = value.charAt(i);

		// If Space, ignore, add one to Empty Amt
		if (char === " ") {
			// Check for double space
			if (emptyAmt > 0) {
				if (shouldCheck)
					throw new Error(
						`${name} with ID ${id} at ${key} has a Double Space!`,
					);
				logWarn(`Removing Double Space in ${name} with ID ${id} at ${key}...`);
				continue;
			}

			// This only applies for non 'r' formatting, which should be after spaces
			if (builder.at(-2) === "§" && builder.at(-1) !== "r") {
				if (shouldCheck)
					throw new Error(
						`${name} with ID ${id} at ${key} has Non-Resetting Formatting Before Spaces!`,
					);
				logWarn(
					`Moving Non-Resetting Formatting After Spaces in ${name} with ID ${id} at ${key}...`,
				);
				const code = builder.at(-1);
				if (!code) continue;

				// Remove last formatting
				builder = builder.slice(0, -2);

				// Push space, then code
				builder.push(char);
				builder.push("§");
				builder.push(code);

				// Reset empty amount, its no longer empty
				emptyAmt = 0;
				continue;
			}

			emptyAmt++;
			builder.push(char);
			continue;
		}

		// Else, reset Empty Amt
		const oldEmptyAmt = emptyAmt;
		emptyAmt = 0;

		if (builder.at(-1) === "§") {
			if (char === "f") {
				if (shouldCheck)
					throw new Error(
						`${name} with ID ${id} at ${key} has Formatting Code 'f'!`,
					);
				logWarn(
					`Replacing Formatting Code 'f' with 'r' in ${name} with ID ${id} at ${key}...`,
				);
				builder.push("r");
				prevFormat = "r";
				continue;
			}

			if (!isAvailableForFormatting.test(char)) {
				if (shouldCheck)
					throw new Error(
						`${name} with ID ${id} at ${key} has Lone Formatting Signal!`,
					);

				logWarn(
					`Removing Lone Formatting Signal in ${name} with ID ${id} at ${key}...`,
				);

				// Remove Last Element
				builder = builder.slice(0, -1);
				continue;
			}

			// Check for 'r' formatting, which should be BEFORE spaces
			if (char === "r" && builder.at(-2) === " ") {
				if (shouldCheck)
					throw new Error(
						`${name} with ID ${id} at ${key} has Resetting Formatting After Space!`,
					);

				logWarn(
					`Moving Resetting Formatting Before Space in ${name} with ID ${id} at ${key}...`,
				);

				// Remove previous space, add in code, 'r' then space
				builder = builder.slice(0, -2);
				builder.push("§r ");
				prevFormat = "r";
				continue;
			}

			// Check Prev Format
			if (prevFormat === char) {
				if (shouldCheck)
					throw new Error(
						`${name} with ID ${id} at ${key} has Redundant Formatting!`,
					);

				logWarn(
					`Removing Redundant Formatting from ${name} with ID ${id} at ${key}...`,
				);

				// Remove Previous
				builder = builder.slice(0, -1);
				continue;
			}

			prevFormat = char;
			builder.push(char);
			continue;
		}

		if (char === "§") {
			// If two characters before was not § (if builder length < 2, `.at` returns undefined)
			// (Ignoring Spaces)
			if (builder.at(-2 - oldEmptyAmt) !== "§") {
				builder.push(char);
				continue;
			}

			if (shouldCheck)
				throw new Error(
					`${name} with ID ${id} at ${key} has Redundant Formatting!`,
				);

			logWarn(
				`Removing Redundant Formatting from ${name} with ID ${id} at ${key}...`,
			);

			// Remove Previous
			builder = builder.slice(0, -2 - oldEmptyAmt);

			// Add Empty Amount Spaces
			for (let i = 0; i < oldEmptyAmt; i++) {
				builder.push(" ");
			}
		}

		builder.push(char);
	}

	// Check for redundant formatting at end
	if (builder.at(-2) === "§") {
		if (shouldCheck)
			throw new Error(
				`${name} with ID ${id} at ${key} has Redundant Formatting!`,
			);

		logWarn(
			`Removing Redundant Formatting from ${name} with ID ${id} at ${key}...`,
		);

		builder = builder.slice(0, -2);
	}

	return builder.join("");
}
