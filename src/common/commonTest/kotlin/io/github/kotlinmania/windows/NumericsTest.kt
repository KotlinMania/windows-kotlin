// port-lint: tests Windows/Foundation/Numerics/mod.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.foundation.Matrix3x2
import io.github.kotlinmania.windows.foundation.Matrix4x4
import io.github.kotlinmania.windows.foundation.Plane
import io.github.kotlinmania.windows.foundation.Quaternion
import io.github.kotlinmania.windows.foundation.Rational
import io.github.kotlinmania.windows.foundation.Vector2
import io.github.kotlinmania.windows.foundation.Vector3
import io.github.kotlinmania.windows.foundation.Vector4
import kotlin.test.Test
import kotlin.test.assertEquals

class NumericsTest {
    @Test
    fun testVectors() {
        val v2 = Vector2(1f, 2f)
        assertEquals(1f, v2.x)
        assertEquals(2f, v2.y)

        val v3 = Vector3(1f, 2f, 3f)
        assertEquals(1f, v3.x)
        assertEquals(2f, v3.y)
        assertEquals(3f, v3.z)

        val v4 = Vector4(1f, 2f, 3f, 4f)
        assertEquals(1f, v4.x)
        assertEquals(2f, v4.y)
        assertEquals(3f, v4.z)
        assertEquals(4f, v4.w)
    }

    @Test
    fun testPlaneAndQuaternion() {
        val plane = Plane(Vector3(0f, 1f, 0f), 5f)
        assertEquals(0f, plane.normal.x)
        assertEquals(1f, plane.normal.y)
        assertEquals(5f, plane.d)

        val quat = Quaternion(0f, 0f, 0f, 1f)
        assertEquals(0f, quat.x)
        assertEquals(1f, quat.w)
    }

    @Test
    fun testRational() {
        val r = Rational(16u, 9u)
        assertEquals(16u, r.numerator)
        assertEquals(9u, r.denominator)
    }

    @Test
    fun testMatrices() {
        val m3x2 = Matrix3x2.Identity
        assertEquals(1f, m3x2.m11)
        assertEquals(0f, m3x2.m12)
        assertEquals(1f, m3x2.m22)

        val m4x4 = Matrix4x4.Identity
        assertEquals(1f, m4x4.m11)
        assertEquals(1f, m4x4.m22)
        assertEquals(1f, m4x4.m33)
        assertEquals(1f, m4x4.m44)
    }
}
