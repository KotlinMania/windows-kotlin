// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windows.win32.foundation

import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME as SysFILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.FLOAT128 as SysFLOAT128
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT as SysPOINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINTL as SysPOINTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINTS as SysPOINTS
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT as SysRECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECTL as SysRECTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE as SysSIZE
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME as SysSYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR as SysWIN32_ERROR

/**
 * Converts a windows-kotlin RECT to a windows-sys RECT.
 */
public fun RECT.toSys(): SysRECT = SysRECT(left, top, right, bottom)

/**
 * Converts a windows-sys RECT to a windows-kotlin RECT.
 */
public fun SysRECT.toWindows(): RECT = RECT(left, top, right, bottom)

/**
 * Converts a windows-kotlin RECTL to a windows-sys RECTL.
 */
public fun RECTL.toSys(): SysRECTL = SysRECTL(left, top, right, bottom)

/**
 * Converts a windows-sys RECTL to a windows-kotlin RECTL.
 */
public fun SysRECTL.toWindows(): RECTL = RECTL(left, top, right, bottom)

/**
 * Converts a windows-kotlin POINT to a windows-sys POINT.
 */
public fun POINT.toSys(): SysPOINT = SysPOINT(x, y)

/**
 * Converts a windows-sys POINT to a windows-kotlin POINT.
 */
public fun SysPOINT.toWindows(): POINT = POINT(x, y)

/**
 * Converts a windows-kotlin POINTL to a windows-sys POINTL.
 */
public fun POINTL.toSys(): SysPOINTL = SysPOINTL(x, y)

/**
 * Converts a windows-sys POINTL to a windows-kotlin POINTL.
 */
public fun SysPOINTL.toWindows(): POINTL = POINTL(x, y)

/**
 * Converts a windows-kotlin POINTS to a windows-sys POINTS.
 */
public fun POINTS.toSys(): SysPOINTS = SysPOINTS(x, y)

/**
 * Converts a windows-sys POINTS to a windows-kotlin POINTS.
 */
public fun SysPOINTS.toWindows(): POINTS = POINTS(x, y)

/**
 * Converts a windows-kotlin SIZE to a windows-sys SIZE.
 */
public fun SIZE.toSys(): SysSIZE = SysSIZE(cx, cy)

/**
 * Converts a windows-sys SIZE to a windows-kotlin SIZE.
 */
public fun SysSIZE.toWindows(): SIZE = SIZE(cx, cy)

/**
 * Converts a windows-kotlin FILETIME to a windows-sys FILETIME.
 */
public fun FILETIME.toSys(): SysFILETIME = SysFILETIME(dwLowDateTime, dwHighDateTime)

/**
 * Converts a windows-sys FILETIME to a windows-kotlin FILETIME.
 */
public fun SysFILETIME.toWindows(): FILETIME = FILETIME(dwLowDateTime, dwHighDateTime)

/**
 * Converts a windows-kotlin SYSTEMTIME to a windows-sys SYSTEMTIME.
 */
public fun SYSTEMTIME.toSys(): SysSYSTEMTIME =
    SysSYSTEMTIME(wYear, wMonth, wDayOfWeek, wDay, wHour, wMinute, wSecond, wMilliseconds)

/**
 * Converts a windows-sys SYSTEMTIME to a windows-kotlin SYSTEMTIME.
 */
public fun SysSYSTEMTIME.toWindows(): SYSTEMTIME =
    SYSTEMTIME(wYear, wMonth, wDayOfWeek, wDay, wHour, wMinute, wSecond, wMilliseconds)

/**
 * Converts a windows-kotlin FLOAT128 to a windows-sys FLOAT128.
 */
public fun FLOAT128.toSys(): SysFLOAT128 = SysFLOAT128(lowPart, highPart)

/**
 * Converts a windows-sys FLOAT128 to a windows-kotlin FLOAT128.
 */
public fun SysFLOAT128.toWindows(): FLOAT128 = FLOAT128(lowPart, highPart)

/**
 * Converts a windows-kotlin Win32Error to a windows-sys WIN32_ERROR.
 */
public fun Win32Error.toSys(): SysWIN32_ERROR = value

/**
 * Converts a windows-sys WIN32_ERROR to a windows-kotlin Win32Error.
 */
public fun SysWIN32_ERROR.toWindows(): Win32Error = Win32Error(this)
