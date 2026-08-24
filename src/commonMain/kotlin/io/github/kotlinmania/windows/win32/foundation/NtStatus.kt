// port-lint: source extensions/Win32/Foundation/NTSTATUS.rs
package io.github.kotlinmania.windows.win32.foundation

/**
 * Returns true if this NTSTATUS code represents success or informational status (non-negative).
 */
public fun NTSTATUS.isOk(): Boolean = value >= 0

/**
 * Returns true if this NTSTATUS code represents a warning or error.
 */
public fun NTSTATUS.isErr(): Boolean = !isOk()

/**
 * Converts this NTSTATUS code into a standard HRESULT value by setting the NT facility bit.
 */
public fun NTSTATUS.toHresult(): Int =
    if (value >= 0) {
        value
    } else {
        value or 0x10000000
    }

/**
 * Converts this NTSTATUS into a Kotlin [Result].
 */
public fun NTSTATUS.ok(): Result<Unit> =
    if (isOk()) {
        Result.success(Unit)
    } else {
        Result.failure(IllegalStateException("NTSTATUS error: 0x${value.toUInt().toString(16).uppercase()}"))
    }
