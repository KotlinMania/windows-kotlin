// port-lint: source Windows/Foundation/mod.rs
package io.github.kotlinmania.windows.foundation

/**
 * Represents a point in time, usually expressed as a date and time of day.
 * Expressed as the number of 100-nanosecond intervals that have elapsed since January 1, 1601 (UTC).
 */
public data class DateTime(
    public val universalTime: Long = 0L,
) {
    public companion object {
        public const val TICKS_PER_MILLISECOND: Long = 10_000L
        public const val TICKS_PER_SECOND: Long = 10_000_000L
        public const val EPOCH_OFFSET_SECONDS: Long = 11_644_473_600L

        public fun fromUnixMillis(unixMillis: Long): DateTime {
            val ticks = (unixMillis + EPOCH_OFFSET_SECONDS * 1_000L) * TICKS_PER_MILLISECOND
            return DateTime(ticks)
        }
    }

    public fun toUnixMillis(): Long = (universalTime / TICKS_PER_MILLISECOND) - (EPOCH_OFFSET_SECONDS * 1_000L)
}

/**
 * Represents a time interval in 100-nanosecond units.
 */
public data class TimeSpan(
    public val duration: Long = 0L,
) {
    public companion object {
        public const val TICKS_PER_MILLISECOND: Long = 10_000L
        public const val TICKS_PER_SECOND: Long = 10_000_000L

        public fun fromMillis(millis: Long): TimeSpan = TimeSpan(millis * TICKS_PER_MILLISECOND)

        public fun fromSeconds(seconds: Long): TimeSpan = TimeSpan(seconds * TICKS_PER_SECOND)
    }

    public fun toMillis(): Long = duration / TICKS_PER_MILLISECOND

    public fun toSeconds(): Long = duration / TICKS_PER_SECOND
}

/**
 * Represents an x- and y-coordinate pair in two-dimensional space.
 */
public data class Point(
    public val x: Float = 0f,
    public val y: Float = 0f,
)

/**
 * Represents the size of an object in two-dimensional space.
 */
public data class Size(
    public val width: Float = 0f,
    public val height: Float = 0f,
)

/**
 * Represents a set of four floating-point numbers that determine the location and size of a rectangle.
 */
public data class Rect(
    public val x: Float = 0f,
    public val y: Float = 0f,
    public val width: Float = 0f,
    public val height: Float = 0f,
) {
    public fun contains(point: Point): Boolean =
        point.x >= x &&
            point.x <= x + width &&
            point.y >= y &&
            point.y <= y + height

    public fun intersects(other: Rect): Boolean =
        x < other.x + other.width &&
            x + width > other.x &&
            y < other.y + other.height &&
            y + height > other.y
}

/**
 * Specifies the type of a value stored in an IPropertyValue.
 */
public class PropertyType(
    public val value: Int,
) {
    override fun equals(other: Any?): Boolean = other is PropertyType && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "PropertyType($value)"

    public companion object {
        public val Empty: PropertyType = PropertyType(0)
        public val UInt8: PropertyType = PropertyType(1)
        public val Int16: PropertyType = PropertyType(2)
        public val UInt16: PropertyType = PropertyType(3)
        public val Int32: PropertyType = PropertyType(4)
        public val UInt32: PropertyType = PropertyType(5)
        public val Int64: PropertyType = PropertyType(6)
        public val UInt64: PropertyType = PropertyType(7)
        public val Single: PropertyType = PropertyType(8)
        public val Double: PropertyType = PropertyType(9)
        public val Char16: PropertyType = PropertyType(10)
        public val Boolean: PropertyType = PropertyType(11)
        public val String: PropertyType = PropertyType(12)
        public val Inspectable: PropertyType = PropertyType(13)
        public val DateTime: PropertyType = PropertyType(14)
        public val TimeSpan: PropertyType = PropertyType(15)
        public val Guid: PropertyType = PropertyType(16)
        public val Point: PropertyType = PropertyType(17)
        public val Size: PropertyType = PropertyType(18)
        public val Rect: PropertyType = PropertyType(19)
        public val OtherType: PropertyType = PropertyType(20)
        public val UInt8Array: PropertyType = PropertyType(1025)
        public val Int16Array: PropertyType = PropertyType(1026)
        public val UInt16Array: PropertyType = PropertyType(1027)
        public val Int32Array: PropertyType = PropertyType(1028)
        public val UInt32Array: PropertyType = PropertyType(1029)
        public val Int64Array: PropertyType = PropertyType(1030)
        public val UInt64Array: PropertyType = PropertyType(1031)
        public val SingleArray: PropertyType = PropertyType(1032)
        public val DoubleArray: PropertyType = PropertyType(1033)
        public val Char16Array: PropertyType = PropertyType(1034)
        public val BooleanArray: PropertyType = PropertyType(1035)
        public val StringArray: PropertyType = PropertyType(1036)
        public val InspectableArray: PropertyType = PropertyType(1037)
        public val DateTimeArray: PropertyType = PropertyType(1038)
        public val TimeSpanArray: PropertyType = PropertyType(1039)
        public val GuidArray: PropertyType = PropertyType(1040)
        public val PointArray: PropertyType = PropertyType(1041)
        public val SizeArray: PropertyType = PropertyType(1042)
        public val RectArray: PropertyType = PropertyType(1043)
    }
}

/**
 * Specifies the status of an asynchronous operation.
 */
public enum class AsyncStatus(
    public val value: Int,
) {
    Started(0),
    Completed(1),
    Canceled(2),
    Error(3),
}
