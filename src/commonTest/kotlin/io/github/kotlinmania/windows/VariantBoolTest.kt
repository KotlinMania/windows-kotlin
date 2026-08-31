// port-lint: tests windows/src/extensions/Win32/Foundation/VARIANT_BOOL.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.foundation.VariantBool
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
        val vTrue = VariantBool.VARIANT_TRUE
        val vFalse = VariantBool.VARIANT_FALSE

        assertTrue(vTrue.asBool())
        assertFalse(vFalse.asBool())

        assertTrue(vTrue.ok().isSuccess)
        assertTrue(vFalse.ok().isFailure)

        assertEquals(VariantBool.VARIANT_FALSE, !vTrue)
        assertEquals(VariantBool.VARIANT_TRUE, !vFalse)

        assertEquals(vTrue, VariantBool.fromBoolean(true))
        assertEquals(vFalse, VariantBool.fromBoolean(false))
    }
}
