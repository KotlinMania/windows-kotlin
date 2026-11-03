// port-lint: source Windows/Foundation/Numerics/mod.rs
package io.github.kotlinmania.windows.foundation

/**
 * A 2-dimensional vector.
 */
public data class Vector2(
    public val x: Float = 0f,
    public val y: Float = 0f,
)

/**
 * A 3-dimensional vector.
 */
public data class Vector3(
    public val x: Float = 0f,
    public val y: Float = 0f,
    public val z: Float = 0f,
)

/**
 * A 4-dimensional vector.
 */
public data class Vector4(
    public val x: Float = 0f,
    public val y: Float = 0f,
    public val z: Float = 0f,
    public val w: Float = 0f,
)

/**
 * Represents a plane in three-dimensional space.
 */
public data class Plane(
    public val normal: Vector3 = Vector3(),
    public val d: Float = 0f,
)

/**
 * Represents a vector that is used to encode three-dimensional physical rotations.
 */
public data class Quaternion(
    public val x: Float = 0f,
    public val y: Float = 0f,
    public val z: Float = 0f,
    public val w: Float = 0f,
)

/**
 * Represents a rational number (fraction) with an unsigned numerator and denominator.
 */
public data class Rational(
    public val numerator: UInt = 0u,
    public val denominator: UInt = 1u,
)

/**
 * Represents a 3x2 matrix.
 */
public data class Matrix3x2(
    public val m11: Float = 1f,
    public val m12: Float = 0f,
    public val m21: Float = 0f,
    public val m22: Float = 1f,
    public val m31: Float = 0f,
    public val m32: Float = 0f,
) {
    public companion object {
        public val Identity: Matrix3x2 = Matrix3x2()
    }
}

/**
 * Represents a 4x4 matrix.
 */
public data class Matrix4x4(
    public val m11: Float = 1f,
    public val m12: Float = 0f,
    public val m13: Float = 0f,
    public val m14: Float = 0f,
    public val m21: Float = 0f,
    public val m22: Float = 1f,
    public val m23: Float = 0f,
    public val m24: Float = 0f,
    public val m31: Float = 0f,
    public val m32: Float = 0f,
    public val m33: Float = 1f,
    public val m34: Float = 0f,
    public val m41: Float = 0f,
    public val m42: Float = 0f,
    public val m43: Float = 0f,
    public val m44: Float = 1f,
) {
    public companion object {
        public val Identity: Matrix4x4 = Matrix4x4()
    }
}
