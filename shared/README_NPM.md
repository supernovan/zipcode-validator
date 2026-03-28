# Zipcode Validator 🌍

A robust zipcode validator for JavaScript and TypeScript.

## Installation

```bash
npm install @supernovan/zipcode-validator
```

# Usage
You can validate zip codes using either a simple string for the country code

```ts
import validator from '@supernovan/zipcode-validator';
const { ZipValidator } = validator.se.kodasmart.validator;
const { CountryCode, getCountryCodeFromString } = validator.se.kodasmart.models

// Using a simple string (case-insensitive)
const isSwedenValid = ZipValidator.isValid("123 45", "se");
console.log(isSwedenValid); // true

// Using a string for a country without zip codes (e.g., UAE)
const isUaeValid = ZipValidator.isValid(null, "AE");
console.log(isUaeValid); // true

// Trying to validate an invalid country code throws an exception
try {
    const isValid = ZipValidator.isValid("123 45", "XXX");
} catch (error) {
    console.error("Unknown country: XXX");
}

// If you prefer to convert the string yourself to a country code
try {
    const country = getCountryCodeFromString("SE");

    const isValid = ZipValidator.isValid("12345", country);

    console.log("Is valid: ", isValid); // true

} catch (error) {
    console.error("Unknown country", error.message);
}
```



