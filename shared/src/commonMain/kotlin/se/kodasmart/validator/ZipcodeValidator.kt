package se.kodasmart.validator

import se.kodasmart.models.CountryCode
import se.kodasmart.models.ZipCodeFormat
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@OptIn(ExperimentalJsExport::class)
@JsExport
object ZipValidator {

    fun isValid(zipCode: String?, countryCode: String): Boolean {
        val countryCode = CountryCode.fromString(countryCode)
        return isValid(zipCode, countryCode)
    }

    fun isValid(zipCode: String?, countryCode: CountryCode): Boolean {
        val regexPattern = ZipCodeFormat.regexFromCountryCode(countryCode)
            ?: return true

        if (zipCode.isNullOrBlank()) {
            return false
        }

        val cleanZip = zipCode.trim().uppercase()

        val regex = Regex(regexPattern)
        return regex.matches(cleanZip)
    }

    fun getRegexForCountryCode(countryCode: CountryCode): String? {
        return ZipCodeFormat.regexFromCountryCode(countryCode)
    }
}