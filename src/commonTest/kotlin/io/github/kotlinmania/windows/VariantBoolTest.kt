// port-lint: tests extensions/Win32/Foundation/VARIANT_BOOL.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.foundation.VARIANT_BOOL
import io.github.kotlinmania.windows.win32.foundation.asBool
import io.github.kotlinmania.windows.win32.foundation.not
import io.github.kotlinmania.windows.win32.foundation.ok
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class VariantBoolTest {
    @Test
    fun testVariantBoolExtensions() {
        val vTrue = VARIANT_BOOL.VARIANT_TRUE
        val vFalse = VARIANT_BOOL.VARIANT_FALSE

        assertTrue(vTrue.asBool())
        assertFalse(vFalse.asBool())

        assertTrue(vTrue.ok().isSuccess)
        assertTrue(vFalse.ok().isFailure)

        assertEquals(VARIANT_BOOL.VARIANT_FALSE, !vTrue)
        assertEquals(VARIANT_BOOL.VARIANT_TRUE, !vFalse)

        assertEquals(vTrue, VARIANT_BOOL.fromBoolean(true))
        assertEquals(vFalse, VARIANT_BOOL.fromBoolean(false))
    }
}
