// port-lint: source extensions/Win32/Foundation/VARIANT_BOOL.rs
package io.github.kotlinmania.windows.win32.foundation

/**
 * Returns true if this [VARIANT_BOOL] is non-zero (VARIANT_TRUE).
 */
public fun VARIANT_BOOL.asBool(): Boolean = value != 0.toShort()

/**
 * Converts this [VARIANT_BOOL] into a Kotlin [Result].
 */
public fun VARIANT_BOOL.ok(): Result<Unit> =
    if (asBool()) {
        Result.success(Unit)
    } else {
        Result.failure(IllegalStateException("Operation failed (VARIANT_FALSE)"))
    }

/**
 * Logical NOT operator for [VARIANT_BOOL].
 */
public operator fun VARIANT_BOOL.not(): VARIANT_BOOL =
    if (asBool()) VARIANT_BOOL.VARIANT_FALSE else VARIANT_BOOL.VARIANT_TRUE
