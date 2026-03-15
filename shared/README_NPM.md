# Zipcode Validator 🌍

A robust, zero-dependency global zipcode validator for JavaScript and TypeScript.

## Installation

```bash
npm install @supernovan/zipcode-validator
```

# Usage
You can validate zip codes using either a simple string for the country code

```js
import validator from '@supernovan/zipcode-validator';
const { ZipValidator } = validator.se.kodasmart.validator;

// Using a simple string (case-insensitive)
const isSwedenValid = ZipValidator.isValid("123 45", "se");
console.log(isSwedenValid); // true

// Using a string for a country without zip codes (e.g., UAE)
const isUaeValid = ZipValidator.isValid(null, "AE");
console.log(isUaeValid); // true
```

