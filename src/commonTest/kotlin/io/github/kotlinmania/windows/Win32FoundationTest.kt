// port-lint: tests Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.foundation.APP_LOCAL_DEVICE_ID
import io.github.kotlinmania.windows.win32.foundation.APP_LOCAL_DEVICE_ID_SIZE
import io.github.kotlinmania.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windows.win32.foundation.DuplicateHandleOptions
import io.github.kotlinmania.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windows.win32.foundation.FLOAT128
import io.github.kotlinmania.windows.win32.foundation.GenericAccessRights
import io.github.kotlinmania.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windows.win32.foundation.HANDLE_PTR
import io.github.kotlinmania.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windows.win32.foundation.HLOCAL
import io.github.kotlinmania.windows.win32.foundation.HLSURF
import io.github.kotlinmania.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windows.win32.foundation.HRSRC
import io.github.kotlinmania.windows.win32.foundation.HSPRITE
import io.github.kotlinmania.windows.win32.foundation.HSTR
import io.github.kotlinmania.windows.win32.foundation.HUMPD
import io.github.kotlinmania.windows.win32.foundation.HandleFlags
import io.github.kotlinmania.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windows.win32.foundation.MAX_PATH
import io.github.kotlinmania.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windows.win32.foundation.ObjectAttributeFlags
import io.github.kotlinmania.windows.win32.foundation.POINT
import io.github.kotlinmania.windows.win32.foundation.POINTL
import io.github.kotlinmania.windows.win32.foundation.POINTS
import io.github.kotlinmania.windows.win32.foundation.RECT
import io.github.kotlinmania.windows.win32.foundation.RECTL
import io.github.kotlinmania.windows.win32.foundation.SHANDLE_PTR
import io.github.kotlinmania.windows.win32.foundation.SIZE
import io.github.kotlinmania.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windows.win32.foundation.UNICODE_STRING
import io.github.kotlinmania.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windows.win32.foundation.asBool
import io.github.kotlinmania.windows.win32.foundation.fromHresult
import io.github.kotlinmania.windows.win32.foundation.isErr
import io.github.kotlinmania.windows.win32.foundation.isOk
import io.github.kotlinmania.windows.win32.foundation.not
import io.github.kotlinmania.windows.win32.foundation.ok
import io.github.kotlinmania.windows.win32.foundation.toHresult
import io.github.kotlinmania.windows.win32.foundation.toSys
import io.github.kotlinmania.windows.win32.foundation.toWindows
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

    @Test
    fun testGenericAccessRights() {
        val read = GenericAccessRights.GENERIC_READ
        val write = GenericAccessRights.GENERIC_WRITE
        val execute = GenericAccessRights.GENERIC_EXECUTE
        val all = GenericAccessRights.GENERIC_ALL

        val readWrite = read or write
        assertTrue(readWrite.contains(read))
        assertTrue(readWrite.contains(write))
        assertFalse(readWrite.contains(execute))
        assertEquals(read, readWrite and read)
        assertEquals(0x80000000u, read.value)
        assertEquals(0x40000000u, write.value)
        assertEquals(0x20000000u, execute.value)
        assertEquals(0x10000000u, all.value)
    }

    @Test
    fun testObjectAttributeFlags() {
        val inherit = ObjectAttributeFlags.OBJ_INHERIT
        val caseInsensitive = ObjectAttributeFlags.OBJ_CASE_INSENSITIVE
        val combined = inherit or caseInsensitive
        assertTrue(combined.contains(inherit))
        assertTrue(combined.contains(caseInsensitive))
        assertEquals(66u, combined.value)
    }

    @Test
    fun testWaitEvent() {
        val ok = WaitEvent.WAIT_OBJECT_0
        val timeout = WaitEvent.WAIT_TIMEOUT
        val failed = WaitEvent.WAIT_FAILED
        assertEquals(0u, ok.value)
        assertEquals(258u, timeout.value)
        assertEquals(0xFFFFFFFFu, failed.value)
    }

    @Test
    fun testAdditionalHandles() {
        val hinstance = HINSTANCE(0L)
        assertTrue(hinstance.isInvalid())
        assertTrue(hinstance.isNull())

        val hmodule = HMODULE(100L)
        assertFalse(hmodule.isInvalid())
        assertFalse(hmodule.isNull())

        val hlsurf = HLSURF(0L)
        assertTrue(hlsurf.isNull())

        val hsprite = HSPRITE(0L)
        assertTrue(hsprite.isNull())

        val hstr = HSTR(0L)
        assertTrue(hstr.isNull())

        val humpd = HUMPD(0L)
        assertTrue(humpd.isNull())

        val handlePtr = HANDLE_PTR(1234uL)
        assertEquals(1234uL, handlePtr.value)

        val shandlePtr = SHANDLE_PTR(-1L)
        assertEquals(-1L, shandlePtr.value)
    }

    @Test
    fun testFloat128AndAppLocalDeviceId() {
        val f128 = FLOAT128(10L, 20L)
        assertEquals(10L, f128.lowPart)
        assertEquals(20L, f128.highPart)

        val devId = APP_LOCAL_DEVICE_ID()
        assertEquals(32, devId.value.size)
        assertEquals(32u, APP_LOCAL_DEVICE_ID_SIZE)

        val devId2 = APP_LOCAL_DEVICE_ID()
        assertEquals(devId, devId2)
        assertEquals(devId.hashCode(), devId2.hashCode())
    }

    @Test
    fun testUnicodeString() {
        val str = UNICODE_STRING(8u, 16u, "Test")
        assertEquals(8u.toUShort(), str.length)
        assertEquals(16u.toUShort(), str.maximumLength)
        assertEquals("Test", str.buffer)
    }

    @Test
    fun testSysBridge() {
        val rect = RECT(1, 2, 3, 4)
        val sysRect = rect.toSys()
        assertEquals(rect.left, sysRect.left)
        assertEquals(rect.top, sysRect.top)
        assertEquals(rect.right, sysRect.right)
        assertEquals(rect.bottom, sysRect.bottom)
        assertEquals(rect, sysRect.toWindows())

        val pt = POINT(10, 20)
        assertEquals(pt, pt.toSys().toWindows())

        val ptl = POINTL(100, 200)
        assertEquals(ptl, ptl.toSys().toWindows())

        val pts = POINTS(5, 6)
        assertEquals(pts, pts.toSys().toWindows())

        val rectl = RECTL(10, 20, 30, 40)
        assertEquals(rectl, rectl.toSys().toWindows())

        val size = SIZE(800, 600)
        assertEquals(size, size.toSys().toWindows())

        val ft = FILETIME(123u, 456u)
        assertEquals(ft, ft.toSys().toWindows())

        val st = SYSTEMTIME(2026u, 10u, 2u, 13u, 9u, 8u, 0u, 0u)
        assertEquals(st, st.toSys().toWindows())

        val f128 = FLOAT128(12345L, 67890L)
        assertEquals(f128, f128.toSys().toWindows())

        val err = Win32Error.ERROR_ACCESS_DENIED
        assertEquals(err, err.toSys().toWindows())
    }
}
