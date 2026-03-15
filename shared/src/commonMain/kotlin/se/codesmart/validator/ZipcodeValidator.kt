package se.codesmart.validator

import se.codesmart.models.CountryCode
import se.codesmart.models.ZipCodeFormat
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@OptIn(ExperimentalJsExport::class)
@JsExport
object ZipValidator {

    fun isValid(zipCode: String?, countryCode: String): Boolean {

        val countryCode = CountryCode.fromString(countryCode)
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