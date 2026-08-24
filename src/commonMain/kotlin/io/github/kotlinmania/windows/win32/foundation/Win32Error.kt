// port-lint: source extensions/Win32/Foundation/WIN32_ERROR.rs
package io.github.kotlinmania.windows.win32.foundation

/**
 * Returns true if this error code represents success.
 */
public fun WIN32_ERROR.isOk(): Boolean = value == 0u

/**
 * Returns true if this error code represents a failure.
 */
public fun WIN32_ERROR.isErr(): Boolean = !isOk()

/**
 * Converts this Win32 error code into a standard HRESULT value.
 */
public fun WIN32_ERROR.toHresult(): Int {
    if (value == 0u) return 0
    val facilityWin32 = 7
    val severityError = 1
    return (value.toInt() and 0xFFFF) or (facilityWin32 shl 16) or (severityError shl 31)
}

/**
 * Extracts a WIN32_ERROR from an HRESULT if it has FACILITY_WIN32.
 */
public fun WIN32_ERROR.Companion.fromHresult(hresult: Int): WIN32_ERROR? {
    val facility = (hresult ushr 16) and 0x7FF
    return if (facility == 7) {
        WIN32_ERROR((hresult and 0xFFFF).toUInt())
    } else {
        null
    }
}

/**
 * Converts this error code into a Kotlin [Result].
 */
public fun WIN32_ERROR.ok(): Result<Unit> =
    if (isOk()) {
        Result.success(Unit)
    } else {
        Result.failure(IllegalStateException("Win32 error: $value (HRESULT: 0x${toHresult().toUInt().toString(16).uppercase()})"))
    }
