// port-lint: tests Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windows.win32.foundation.POINT
import io.github.kotlinmania.windows.win32.foundation.RECT
import io.github.kotlinmania.windows.win32.foundation.SIZE
import io.github.kotlinmania.windows.win32.foundation.VARIANT_BOOL
import io.github.kotlinmania.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windows.win32.foundation.asBool
import io.github.kotlinmania.windows.win32.foundation.fromHresult
import io.github.kotlinmania.windows.win32.foundation.isErr
import io.github.kotlinmania.windows.win32.foundation.isOk
import io.github.kotlinmania.windows.win32.foundation.not
import io.github.kotlinmania.windows.win32.foundation.ok
import io.github.kotlinmania.windows.win32.foundation.toHresult
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class Win32FoundationTest {
    @Test
    fun testWin32Error() {
        val ok = WIN32_ERROR.ERROR_SUCCESS
        assertTrue(ok.isOk())
        assertFalse(ok.isErr())
        assertTrue(ok.ok().isSuccess)
        assertEquals(0, ok.toHresult())

        val accessDenied = WIN32_ERROR.ERROR_ACCESS_DENIED
        assertFalse(accessDenied.isOk())
        assertTrue(accessDenied.isErr())
        assertTrue(accessDenied.ok().isFailure)
        val hr = accessDenied.toHresult()
        val extracted = WIN32_ERROR.fromHresult(hr)
        assertNotNull(extracted)
        assertEquals(accessDenied.value, extracted.value)
    }

    @Test
    fun testNtStatus() {
        val success = NTSTATUS.STATUS_SUCCESS
        assertTrue(success.isOk())
        assertFalse(success.isErr())
        assertTrue(success.ok().isSuccess)

        val accessViolation = NTSTATUS.STATUS_ACCESS_VIOLATION
        assertFalse(accessViolation.isOk())
        assertTrue(accessViolation.isErr())
        assertTrue(accessViolation.ok().isFailure)
    }

    @Test
    fun testVariantBool() {
        val t = VARIANT_BOOL.VARIANT_TRUE
        val f = VARIANT_BOOL.VARIANT_FALSE
        assertTrue(t.asBool())
        assertFalse(f.asBool())
        assertTrue(t.ok().isSuccess)
        assertTrue(f.ok().isFailure)
        assertEquals(f, !t)
        assertEquals(t, !f)
    }

    @Test
    fun testColorRef() {
        val color = COLORREF.fromRgb(0x12u, 0x34u, 0x56u)
        assertEquals(0x12u.toUByte(), color.r())
        assertEquals(0x34u.toUByte(), color.g())
        assertEquals(0x56u.toUByte(), color.b())
    }

    @Test
    fun testRectAndPoint() {
        val rect = RECT(10, 20, 110, 120)
        assertEquals(100, rect.width())
        assertEquals(100, rect.height())
        assertFalse(rect.isEmpty())

        val pt = POINT(15, 25)
        assertEquals(15, pt.x)
        assertEquals(25, pt.y)

        val size = SIZE(800, 600)
        assertEquals(800, size.cx)
        assertEquals(600, size.cy)
    }

    @Test
    fun testFileTime() {
        val now = 1_700_000_000_000L
        val ft = FILETIME.fromEpochMillis(now)
        val roundTrip = ft.toEpochMillis()
        assertEquals(now, roundTrip)
    }

    @Test
    fun testHandle() {
        val valid = HANDLE(1234L)
        assertFalse(valid.isInvalid())
        assertFalse(valid.isNull())

        val nullHandle = HANDLE(0L)
        assertTrue(nullHandle.isInvalid())
        assertTrue(nullHandle.isNull())

        val invalidHandle = HANDLE(-1L)
        assertTrue(invalidHandle.isInvalid())
        assertFalse(invalidHandle.isNull())
    }
}
