package se.codesmart.validator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ZipValidatorTest {

    @Test
    fun `should validate correct Swedish zip codes`() {
        assertTrue(ZipValidator.isValid("123 45","SE"))
        assertTrue(ZipValidator.isValid("12345", "SE"))
    }

    @Test
    fun `should reject invalid Swedish zip codes`() {
        assertFalse(ZipValidator.isValid("123", "SE"), "Should reject too short zip codes")
        assertFalse(ZipValidator.isValid("123 456", "SE"), "Should reject too long zip codes")
        assertFalse(ZipValidator.isValid("ABC DE", "SE"), "Should reject zip codes containing letters")
    }

    @Test
    fun `should handle UK zip codes and ignore case`() {
        assertTrue(ZipValidator.isValid("SW1A 1AA", "GB"))
        assertTrue(ZipValidator.isValid("sw1a 1aa", "GB"), "Should handle lowercase letters due to uppercase() conversion")
        assertTrue(ZipValidator.isValid(" SW1A 1AA ", "GB"), "Should trim leading and trailing whitespace")
    }

    @Test
    fun `should handle countries without zip codes`() {
        assertTrue(ZipValidator.isValid(null, "AE"), "Null should be accepted for countries without zip codes")
        assertTrue(ZipValidator.isValid("", "AE"), "Empty string should be accepted for countries without zip codes")
        assertTrue(ZipValidator.isValid("00000", "AE"), "Legacy padding (00000) should be accepted for countries without zip codes")
    }

    @Test
    fun `should throw exception for unknown country string`() {
        val exception = assertFailsWith<Exception>("Should throw Exception for unknown country code") {
            ZipValidator.isValid("123 45", "XX")
        }
        assertEquals("Unknown country: XX", exception.message)
    }
}