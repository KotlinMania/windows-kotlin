// port-lint: tests Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windows.win32.foundation.DuplicateHandleOptions
import io.github.kotlinmania.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windows.win32.foundation.HLOCAL
import io.github.kotlinmania.windows.win32.foundation.HRSRC
import io.github.kotlinmania.windows.win32.foundation.HandleFlags
import io.github.kotlinmania.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windows.win32.foundation.MAX_PATH
import io.github.kotlinmania.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windows.win32.foundation.POINT
import io.github.kotlinmania.windows.win32.foundation.POINTL
import io.github.kotlinmania.windows.win32.foundation.POINTS
import io.github.kotlinmania.windows.win32.foundation.RECT
import io.github.kotlinmania.windows.win32.foundation.RECTL
import io.github.kotlinmania.windows.win32.foundation.SIZE
import io.github.kotlinmania.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windows.win32.foundation.Win32Error
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
        val ok = Win32Error.ERROR_SUCCESS
        assertTrue(ok.isOk())
        assertFalse(ok.isErr())
        assertTrue(ok.ok().isSuccess)
        assertEquals(0, ok.toHresult())

        val accessDenied = Win32Error.ERROR_ACCESS_DENIED
        assertFalse(accessDenied.isOk())
        assertTrue(accessDenied.isErr())
        assertTrue(accessDenied.ok().isFailure)
        val hr = accessDenied.toHresult()
        val extracted = Win32Error.fromHresult(hr)
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
        val t = VariantBool.VARIANT_TRUE
        val f = VariantBool.VARIANT_FALSE
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

    @Test
    fun testPointLAndPoints() {
        val ptl = POINTL(100, 200)
        assertEquals(100, ptl.x)
        assertEquals(200, ptl.y)

        val pts = POINTS(10.toShort(), 20.toShort())
        assertEquals(10.toShort(), pts.x)
        assertEquals(20.toShort(), pts.y)
    }

    @Test
    fun testRectL() {
        val rect = RECTL(0, 0, 50, 100)
        assertEquals(50, rect.width())
        assertEquals(100, rect.height())
        assertFalse(rect.isEmpty())

        val empty = RECTL(50, 50, 50, 50)
        assertTrue(empty.isEmpty())
    }

    @Test
    fun testParamsAndResult() {
        val lparam = LPARAM(0x12345678L)
        assertEquals(0x12345678L, lparam.value)

        val lresult = LRESULT(-1L)
        assertEquals(-1L, lresult.value)

        val wparam = WPARAM(0xABCDEFUL)
        assertEquals(0xABCDEFUL, wparam.value)
    }

    @Test
    fun testMemoryAndResourceHandles() {
        val hglobal = HGLOBAL(42L)
        assertFalse(hglobal.isInvalid())
        assertFalse(hglobal.isNull())

        val hlocal = HLOCAL(0L)
        assertTrue(hlocal.isInvalid())
        assertTrue(hlocal.isNull())

        val hrsrc = HRSRC(-1L)
        assertTrue(hrsrc.isInvalid())
        assertFalse(hrsrc.isNull())
    }

    @Test
    fun testDuplicateHandleOptions() {
        val closeSource = DuplicateHandleOptions.DUPLICATE_CLOSE_SOURCE
        val sameAccess = DuplicateHandleOptions.DUPLICATE_SAME_ACCESS
        val combined = closeSource or sameAccess
        assertTrue(combined.contains(closeSource))
        assertTrue(combined.contains(sameAccess))
        assertEquals(3u, combined.value)
        assertEquals(closeSource, combined and closeSource)
    }

    @Test
    fun testHandleFlags() {
        val inherit = HandleFlags.HANDLE_FLAG_INHERIT
        val protect = HandleFlags.HANDLE_FLAG_PROTECT_FROM_CLOSE
        val combined = inherit or protect
        assertTrue(combined.contains(inherit))
        assertTrue(combined.contains(protect))
        assertEquals(3u, combined.value)
        assertEquals(inherit, combined and inherit)
    }

    @Test
    fun testMaxPath() {
        assertEquals(260u, MAX_PATH)
    }
}
