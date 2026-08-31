// port-lint: tests windows/src/Windows/Foundation/mod.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.foundation.AsyncStatus
import io.github.kotlinmania.windows.foundation.DateTime
import io.github.kotlinmania.windows.foundation.Point
import io.github.kotlinmania.windows.foundation.PropertyType
import io.github.kotlinmania.windows.foundation.Rect
import io.github.kotlinmania.windows.foundation.Size
import io.github.kotlinmania.windows.foundation.TimeSpan
import io.github.kotlinmania.windows.foundation.toDuration
import io.github.kotlinmania.windows.foundation.toTimeSpan
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds

class FoundationTest {
    @Test
    fun testDateTimeConversions() {
        val dt = DateTime.fromUnixMillis(1_700_000_000_000L)
        val backToMillis = dt.toUnixMillis()
        assertEquals(1_700_000_000_000L, backToMillis)
    }

    @Test
    fun testTimeSpanConversions() {
        val ts = TimeSpan.fromSeconds(5)
        assertEquals(5_000L, ts.toMillis())
        assertEquals(5L, ts.toSeconds())

        val duration = 500.milliseconds
        val fromDuration = duration.toTimeSpan()
        assertEquals(5_000_000L, fromDuration.duration)
        assertEquals(500.milliseconds, fromDuration.toDuration())
    }

    @Test
    fun testPointAndSize() {
        val pt = Point(10.5f, 20.5f)
        assertEquals(10.5f, pt.x)
        assertEquals(20.5f, pt.y)

        val size = Size(100f, 200f)
        assertEquals(100f, size.width)
        assertEquals(200f, size.height)
    }

    @Test
    fun testRectGeometry() {
        val rect = Rect(0f, 0f, 100f, 100f)
        assertTrue(rect.contains(Point(50f, 50f)))
        assertFalse(rect.contains(Point(150f, 50f)))

        val overlapping = Rect(50f, 50f, 100f, 100f)
        val disjoint = Rect(200f, 200f, 50f, 50f)
        assertTrue(rect.intersects(overlapping))
        assertFalse(rect.intersects(disjoint))
    }

    @Test
    fun testPropertyTypes() {
        assertEquals(0, PropertyType.Empty.value)
        assertEquals(1, PropertyType.UInt8.value)
        assertEquals(12, PropertyType.String.value)
        assertEquals(1025, PropertyType.UInt8Array.value)
    }

    @Test
    fun testAsyncStatus() {
        assertEquals(0, AsyncStatus.Started.value)
        assertEquals(1, AsyncStatus.Completed.value)
        assertEquals(2, AsyncStatus.Canceled.value)
        assertEquals(3, AsyncStatus.Error.value)
    }
}
