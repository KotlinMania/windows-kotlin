// port-lint: source extensions/Win32/Foundation/VARIANT_BOOL.rs
package io.github.kotlinmania.windows.win32.foundation

/**
 * Returns true if this [VariantBool] is non-zero (VARIANT_TRUE).
 */
public fun VariantBool.asBool(): Boolean = value != 0.toShort()

/**
 * Converts this [VariantBool] into a Kotlin [Result].
 */
public fun VariantBool.ok(): Result<Unit> =
    if (asBool()) {
        Result.success(Unit)
    } else {
        Result.failure(IllegalStateException("Operation failed (VARIANT_FALSE)"))
    }

/**
 * Logical NOT operator for [VariantBool].
 */
public operator fun VariantBool.not(): VariantBool =
    if (asBool()) VariantBool.VARIANT_FALSE else VariantBool.VARIANT_TRUE
