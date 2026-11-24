// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windows.win32.foundation

/**
 * A Win32 error code.
 */
public class Win32Error(
    public val value: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean = other is Win32Error && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "Win32Error($value)"

    public companion object {
        public val ERROR_SUCCESS: Win32Error = Win32Error(0u)
        public val ERROR_INVALID_FUNCTION: Win32Error = Win32Error(1u)
        public val ERROR_FILE_NOT_FOUND: Win32Error = Win32Error(2u)
        public val ERROR_PATH_NOT_FOUND: Win32Error = Win32Error(3u)
        public val ERROR_TOO_MANY_OPEN_FILES: Win32Error = Win32Error(4u)
        public val ERROR_ACCESS_DENIED: Win32Error = Win32Error(5u)
        public val ERROR_INVALID_HANDLE: Win32Error = Win32Error(6u)
        public val ERROR_ARENA_TRASHED: Win32Error = Win32Error(7u)
        public val ERROR_NOT_ENOUGH_MEMORY: Win32Error = Win32Error(8u)
        public val ERROR_INVALID_BLOCK: Win32Error = Win32Error(9u)
        public val ERROR_BAD_ENVIRONMENT: Win32Error = Win32Error(10u)
        public val ERROR_BAD_FORMAT: Win32Error = Win32Error(11u)
        public val ERROR_INVALID_ACCESS: Win32Error = Win32Error(12u)
        public val ERROR_INVALID_DATA: Win32Error = Win32Error(13u)
        public val ERROR_OUTOFMEMORY: Win32Error = Win32Error(14u)
        public val ERROR_INVALID_DRIVE: Win32Error = Win32Error(15u)
        public val ERROR_CURRENT_DIRECTORY: Win32Error = Win32Error(16u)
        public val ERROR_NOT_SAME_DEVICE: Win32Error = Win32Error(17u)
        public val ERROR_NO_MORE_FILES: Win32Error = Win32Error(18u)
        public val ERROR_WRITE_PROTECT: Win32Error = Win32Error(19u)
        public val ERROR_BAD_UNIT: Win32Error = Win32Error(20u)
        public val ERROR_NOT_READY: Win32Error = Win32Error(21u)
        public val ERROR_BAD_COMMAND: Win32Error = Win32Error(22u)
        public val ERROR_CRC: Win32Error = Win32Error(23u)
        public val ERROR_BAD_LENGTH: Win32Error = Win32Error(24u)
        public val ERROR_SEEK: Win32Error = Win32Error(25u)
        public val ERROR_NOT_DOS_DISK: Win32Error = Win32Error(26u)
        public val ERROR_SECTOR_NOT_FOUND: Win32Error = Win32Error(27u)
        public val ERROR_OUT_OF_PAPER: Win32Error = Win32Error(28u)
        public val ERROR_WRITE_FAULT: Win32Error = Win32Error(29u)
        public val ERROR_READ_FAULT: Win32Error = Win32Error(30u)
        public val ERROR_GEN_FAILURE: Win32Error = Win32Error(31u)
        public val ERROR_SHARING_VIOLATION: Win32Error = Win32Error(32u)
        public val ERROR_LOCK_VIOLATION: Win32Error = Win32Error(33u)
        public val ERROR_HANDLE_DISK_FULL: Win32Error = Win32Error(39u)
        public val ERROR_NOT_SUPPORTED: Win32Error = Win32Error(50u)
        public val ERROR_REM_NOT_LIST: Win32Error = Win32Error(51u)
        public val ERROR_DUP_NAME: Win32Error = Win32Error(52u)
        public val ERROR_BAD_NETPATH: Win32Error = Win32Error(53u)
        public val ERROR_NETWORK_BUSY: Win32Error = Win32Error(54u)
        public val ERROR_DEV_NOT_EXIST: Win32Error = Win32Error(55u)
        public val ERROR_TOO_MANY_CMDS: Win32Error = Win32Error(56u)
        public val ERROR_ADAP_HDW_ERR: Win32Error = Win32Error(57u)
        public val ERROR_BAD_NET_RESP: Win32Error = Win32Error(58u)
        public val ERROR_UNEXP_NET_ERR: Win32Error = Win32Error(59u)
        public val ERROR_BAD_REM_ADAP: Win32Error = Win32Error(60u)
        public val ERROR_PRINTQ_FULL: Win32Error = Win32Error(61u)
        public val ERROR_NO_SPOOL_SPACE: Win32Error = Win32Error(62u)
        public val ERROR_PRINT_CANCELLED: Win32Error = Win32Error(63u)
        public val ERROR_NETNAME_DELETED: Win32Error = Win32Error(64u)
        public val ERROR_NETWORK_ACCESS_DENIED: Win32Error = Win32Error(65u)
        public val ERROR_BAD_DEV_TYPE: Win32Error = Win32Error(66u)
        public val ERROR_BAD_NET_NAME: Win32Error = Win32Error(67u)
        public val ERROR_TOO_MANY_NAMES: Win32Error = Win32Error(68u)
        public val ERROR_TOO_MANY_SESS: Win32Error = Win32Error(69u)
        public val ERROR_SHARING_PAUSED: Win32Error = Win32Error(70u)
        public val ERROR_REQ_NOT_ACCEP: Win32Error = Win32Error(71u)
        public val ERROR_REDIR_PAUSED: Win32Error = Win32Error(72u)
        public val ERROR_FILE_EXISTS: Win32Error = Win32Error(80u)
        public val ERROR_CANNOT_MAKE: Win32Error = Win32Error(82u)
        public val ERROR_FAIL_I24: Win32Error = Win32Error(83u)
        public val ERROR_OUT_OF_STRUCTURES: Win32Error = Win32Error(84u)
        public val ERROR_ALREADY_ASSIGNED: Win32Error = Win32Error(85u)
        public val ERROR_INVALID_PASSWORD: Win32Error = Win32Error(86u)
        public val ERROR_INVALID_PARAMETER: Win32Error = Win32Error(87u)
        public val ERROR_NET_WRITE_FAULT: Win32Error = Win32Error(88u)
        public val ERROR_NO_PROC_SLOTS: Win32Error = Win32Error(89u)
        public val ERROR_TOO_MANY_SEMAPHORES: Win32Error = Win32Error(100u)
        public val ERROR_EXCL_SEM_ALREADY_OWNED: Win32Error = Win32Error(101u)
        public val ERROR_SEM_IS_SET: Win32Error = Win32Error(102u)
        public val ERROR_TOO_MANY_SEM_REQUESTS: Win32Error = Win32Error(103u)
        public val ERROR_INVALID_AT_INTERRUPT_TIME: Win32Error = Win32Error(104u)
        public val ERROR_SEM_OWNER_DIED: Win32Error = Win32Error(105u)
        public val ERROR_SEM_USER_LIMIT: Win32Error = Win32Error(106u)
        public val ERROR_DISK_CHANGE: Win32Error = Win32Error(107u)
        public val ERROR_DRIVE_LOCKED: Win32Error = Win32Error(108u)
        public val ERROR_BROKEN_PIPE: Win32Error = Win32Error(109u)
        public val ERROR_OPEN_FAILED: Win32Error = Win32Error(110u)
        public val ERROR_BUFFER_OVERFLOW: Win32Error = Win32Error(111u)
        public val ERROR_DISK_FULL: Win32Error = Win32Error(112u)
        public val ERROR_NO_MORE_SEARCH_HANDLES: Win32Error = Win32Error(113u)
        public val ERROR_INVALID_TARGET_HANDLE: Win32Error = Win32Error(114u)
        public val ERROR_INVALID_CATEGORY: Win32Error = Win32Error(117u)
        public val ERROR_INVALID_VERIFY_SWITCH: Win32Error = Win32Error(118u)
        public val ERROR_BAD_DRIVER_LEVEL: Win32Error = Win32Error(119u)
        public val ERROR_CALL_NOT_IMPLEMENTED: Win32Error = Win32Error(120u)
        public val ERROR_SEM_TIMEOUT: Win32Error = Win32Error(121u)
        public val ERROR_INSUFFICIENT_BUFFER: Win32Error = Win32Error(122u)
        public val ERROR_INVALID_NAME: Win32Error = Win32Error(123u)
        public val ERROR_INVALID_LEVEL: Win32Error = Win32Error(124u)
        public val ERROR_NO_VOLUME_LABEL: Win32Error = Win32Error(125u)
        public val ERROR_MOD_NOT_FOUND: Win32Error = Win32Error(126u)
        public val ERROR_PROC_NOT_FOUND: Win32Error = Win32Error(127u)
        public val ERROR_WAIT_NO_CHILDREN: Win32Error = Win32Error(128u)
        public val ERROR_CHILD_NOT_COMPLETE: Win32Error = Win32Error(129u)
        public val ERROR_DIRECT_ACCESS_HANDLE: Win32Error = Win32Error(130u)
        public val ERROR_NEGATIVE_SEEK: Win32Error = Win32Error(131u)
        public val ERROR_SEEK_ON_DEVICE: Win32Error = Win32Error(132u)
        public val ERROR_DIR_NOT_ROOT: Win32Error = Win32Error(143u)
        public val ERROR_DIR_NOT_EMPTY: Win32Error = Win32Error(145u)
        public val ERROR_PATH_BUSY: Win32Error = Win32Error(148u)
        public val ERROR_DISCARDED: Win32Error = Win32Error(157u)
        public val ERROR_BAD_ARGUMENTS: Win32Error = Win32Error(160u)
        public val ERROR_BAD_PATHNAME: Win32Error = Win32Error(161u)
        public val ERROR_SIGNAL_REFUSED: Win32Error = Win32Error(162u)
        public val ERROR_BUSY: Win32Error = Win32Error(170u)
        public val ERROR_ALREADY_EXISTS: Win32Error = Win32Error(183u)
        public val ERROR_NOT_FOUND: Win32Error = Win32Error(1168u)
        public val ERROR_CANCELLED: Win32Error = Win32Error(1223u)
        public val ERROR_TIMEOUT: Win32Error = Win32Error(1460u)
    }
}

/**
 * An NTSTATUS code.
 */
public class NTSTATUS(
    public val value: Int = 0,
) {
    override fun equals(other: Any?): Boolean = other is NTSTATUS && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "NTSTATUS(0x${value.toUInt().toString(16).uppercase()})"

    public companion object {
        public val STATUS_SUCCESS: NTSTATUS = NTSTATUS(0)
        public val STATUS_UNSUCCESSFUL: NTSTATUS = NTSTATUS(-1073741823) // 0xC0000001
        public val STATUS_NOT_IMPLEMENTED: NTSTATUS = NTSTATUS(-1073741822) // 0xC0000002
        public val STATUS_INVALID_INFO_CLASS: NTSTATUS = NTSTATUS(-1073741821) // 0xC0000003
        public val STATUS_INFO_LENGTH_MISMATCH: NTSTATUS = NTSTATUS(-1073741820) // 0xC0000004
        public val STATUS_ACCESS_VIOLATION: NTSTATUS = NTSTATUS(-1073741819) // 0xC0000005
        public val STATUS_IN_PAGE_ERROR: NTSTATUS = NTSTATUS(-1073741818) // 0xC0000006
        public val STATUS_INVALID_HANDLE: NTSTATUS = NTSTATUS(-1073741816) // 0xC0000008
        public val STATUS_BAD_INITIAL_STACK: NTSTATUS = NTSTATUS(-1073741815) // 0xC0000009
        public val STATUS_BAD_INITIAL_PC: NTSTATUS = NTSTATUS(-1073741814) // 0xC000000A
        public val STATUS_INVALID_CID: NTSTATUS = NTSTATUS(-1073741813) // 0xC000000B
        public val STATUS_TIMER_NOT_CANCELED: NTSTATUS = NTSTATUS(-1073741812) // 0xC000000C
        public val STATUS_BUFFER_TOO_SMALL: NTSTATUS = NTSTATUS(-1073741789) // 0xC0000023
        public val STATUS_OBJECT_NAME_NOT_FOUND: NTSTATUS = NTSTATUS(-1073741772) // 0xC0000034
        public val STATUS_OBJECT_NAME_COLLISION: NTSTATUS = NTSTATUS(-1073741771) // 0xC0000035
        public val STATUS_PORT_DISCONNECTED: NTSTATUS = NTSTATUS(-1073741769) // 0xC0000037
        public val STATUS_OBJECT_PATH_INVALID: NTSTATUS = NTSTATUS(-1073741767) // 0xC0000039
        public val STATUS_OBJECT_PATH_NOT_FOUND: NTSTATUS = NTSTATUS(-1073741766) // 0xC000003A
        public val STATUS_DATA_ERROR: NTSTATUS = NTSTATUS(-1073741762) // 0xC000003E
        public val STATUS_CRC_ERROR: NTSTATUS = NTSTATUS(-1073741761) // 0xC000003F
        public val STATUS_SHARING_VIOLATION: NTSTATUS = NTSTATUS(-1073741757) // 0xC0000043
        public val STATUS_QUOTA_EXCEEDED: NTSTATUS = NTSTATUS(-1073741756) // 0xC0000044
        public val STATUS_PIPE_NOT_AVAILABLE: NTSTATUS = NTSTATUS(-1073741652) // 0xC00000AC
        public val STATUS_PIPE_BUSY: NTSTATUS = NTSTATUS(-1073741650) // 0xC00000AE
        public val STATUS_PIPE_DISCONNECTED: NTSTATUS = NTSTATUS(-1073741648) // 0xC00000B0
        public val STATUS_PIPE_CLOSING: NTSTATUS = NTSTATUS(-1073741647) // 0xC00000B1
        public val STATUS_PIPE_CONNECTED: NTSTATUS = NTSTATUS(-1073741646) // 0xC00000B2
        public val STATUS_PIPE_LISTENING: NTSTATUS = NTSTATUS(-1073741645) // 0xC00000B3
        public val STATUS_TIMEOUT: NTSTATUS = NTSTATUS(258) // 0x00000102
        public val STATUS_PENDING: NTSTATUS = NTSTATUS(259) // 0x00000103
    }
}

/**
 * A boolean type used in COM/OLE Automation.
 */
public class VariantBool(
    public val value: Short = 0,
) {
    override fun equals(other: Any?): Boolean = other is VariantBool && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = if (value != 0.toShort()) "VARIANT_TRUE" else "VARIANT_FALSE"

    public companion object {
        public val VARIANT_TRUE: VariantBool = VariantBool((-1).toShort())
        public val VARIANT_FALSE: VariantBool = VariantBool(0.toShort())

        public fun fromBoolean(value: Boolean): VariantBool =
            if (value) VARIANT_TRUE else VARIANT_FALSE
    }
}

/**
 * Represents a generic Windows handle.
 */
public data class HANDLE(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L || value == -1L

    public fun isNull(): Boolean = value == 0L
}

/**
 * Represents a handle to a window.
 */
public data class HWND(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L || value == -1L

    public fun isNull(): Boolean = value == 0L
}

/**
 * Represents a handle to a module.
 */
public data class HMODULE(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L || value == -1L

    public fun isNull(): Boolean = value == 0L
}

/**
 * Represents a handle to an instance.
 */
public data class HINSTANCE(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L || value == -1L

    public fun isNull(): Boolean = value == 0L
}

/**
 * Represents an RGB color value.
 */
public data class COLORREF(
    public val value: UInt = 0u,
) {
    public fun r(): UByte = (value and 0xFFu).toUByte()

    public fun g(): UByte = ((value shr 8) and 0xFFu).toUByte()

    public fun b(): UByte = ((value shr 16) and 0xFFu).toUByte()

    public companion object {
        public fun fromRgb(r: UByte, g: UByte, b: UByte): COLORREF =
            COLORREF(r.toUInt() or (g.toUInt() shl 8) or (b.toUInt() shl 16))
    }
}

/**
 * Represents the coordinates of the upper-left and lower-right corners of a rectangle.
 */
public data class RECT(
    public val left: Int = 0,
    public val top: Int = 0,
    public val right: Int = 0,
    public val bottom: Int = 0,
) {
    public fun width(): Int = right - left

    public fun height(): Int = bottom - top

    public fun isEmpty(): Boolean = left >= right || top >= bottom
}

/**
 * Represents an x- and y-coordinate pair of integers.
 */
public data class POINT(
    public val x: Int = 0,
    public val y: Int = 0,
)

/**
 * Represents the width and height of a rectangle in integer pixels.
 */
public data class SIZE(
    public val cx: Int = 0,
    public val cy: Int = 0,
)

/**
 * Contains a 64-bit value representing the number of 100-nanosecond intervals since January 1, 1601 (UTC).
 */
public data class FILETIME(
    public val dwLowDateTime: UInt = 0u,
    public val dwHighDateTime: UInt = 0u,
) {
    public fun toEpochMillis(): Long {
        val totalTicks = (dwHighDateTime.toLong() shl 32) or (dwLowDateTime.toLong() and 0xFFFFFFFFL)
        return (totalTicks / 10_000L) - 11_644_473_600_000L
    }

    public companion object {
        public fun fromEpochMillis(epochMillis: Long): FILETIME {
            val totalTicks = (epochMillis + 11_644_473_600_000L) * 10_000L
            val low = (totalTicks and 0xFFFFFFFFL).toUInt()
            val high = (totalTicks ushr 32).toUInt()
            return FILETIME(low, high)
        }
    }
}

/**
 * Specifies a date and time, using individual members for the month, day, year, weekday, hour, minute, second, and millisecond.
 */
public data class SYSTEMTIME(
    public val wYear: UShort = 0u,
    public val wMonth: UShort = 0u,
    public val wDayOfWeek: UShort = 0u,
    public val wDay: UShort = 0u,
    public val wHour: UShort = 0u,
    public val wMinute: UShort = 0u,
    public val wSecond: UShort = 0u,
    public val wMilliseconds: UShort = 0u,
)

/**
 * Describes a locally unique identifier.
 */
public data class LUID(
    public val lowPart: UInt = 0u,
    public val highPart: Int = 0,
)

/**
 * Represents a device property key.
 */
public data class DEVPROPKEY(
    public val fmtid: String = "",
    public val pid: UInt = 0u,
)

/**
 * Specifies the FMTID/PID identifier that uniquely identifies a property.
 */
public data class PROPERTYKEY(
    public val fmtid: String = "",
    public val pid: UInt = 0u,
)

/**
 * Represents an x- and y-coordinate pair of integers for a point (long format).
 */
public data class POINTL(
    public val x: Int = 0,
    public val y: Int = 0,
)

/**
 * Represents an x- and y-coordinate pair of short integers.
 */
public data class POINTS(
    public val x: Short = 0,
    public val y: Short = 0,
)

/**
 * Represents a rectangle using long integer coordinates.
 */
public data class RECTL(
    public val left: Int = 0,
    public val top: Int = 0,
    public val right: Int = 0,
    public val bottom: Int = 0,
) {
    public fun width(): Int = right - left

    public fun height(): Int = bottom - top

    public fun isEmpty(): Boolean = left >= right || top >= bottom
}

/**
 * Represents an integer value passed as a message parameter.
 */
public data class LPARAM(
    public val value: Long = 0L,
)

/**
 * Represents a signed result value returned from a window procedure or callback.
 */
public data class LRESULT(
    public val value: Long = 0L,
)

/**
 * Represents an unsigned integer value passed as a message parameter.
 */
public data class WPARAM(
    public val value: ULong = 0uL,
)

/**
 * Represents a global memory handle.
 */
public data class HGLOBAL(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L || value == -1L

    public fun isNull(): Boolean = value == 0L
}

/**
 * Represents a local memory handle.
 */
public data class HLOCAL(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L || value == -1L

    public fun isNull(): Boolean = value == 0L
}

/**
 * Represents a resource handle.
 */
public data class HRSRC(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L || value == -1L

    public fun isNull(): Boolean = value == 0L
}

/**
 * Options for duplicating a handle.
 */
public class DuplicateHandleOptions(
    public val value: UInt = 0u,
) {
    public fun contains(other: DuplicateHandleOptions): Boolean = (value and other.value) == other.value

    public infix fun or(other: DuplicateHandleOptions): DuplicateHandleOptions =
        DuplicateHandleOptions(value or other.value)

    public infix fun and(other: DuplicateHandleOptions): DuplicateHandleOptions =
        DuplicateHandleOptions(value and other.value)

    public fun not(): DuplicateHandleOptions = DuplicateHandleOptions(value.inv())

    override fun equals(other: Any?): Boolean = other is DuplicateHandleOptions && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "DuplicateHandleOptions($value)"

    public companion object {
        public val DUPLICATE_CLOSE_SOURCE: DuplicateHandleOptions = DuplicateHandleOptions(1u)
        public val DUPLICATE_SAME_ACCESS: DuplicateHandleOptions = DuplicateHandleOptions(2u)
    }
}

/**
 * Flags associated with a handle.
 */
public class HandleFlags(
    public val value: UInt = 0u,
) {
    public fun contains(other: HandleFlags): Boolean = (value and other.value) == other.value

    public infix fun or(other: HandleFlags): HandleFlags = HandleFlags(value or other.value)

    public infix fun and(other: HandleFlags): HandleFlags = HandleFlags(value and other.value)

    public fun not(): HandleFlags = HandleFlags(value.inv())

    override fun equals(other: Any?): Boolean = other is HandleFlags && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "HandleFlags($value)"

    public companion object {
        public val HANDLE_FLAG_INHERIT: HandleFlags = HandleFlags(1u)
        public val HANDLE_FLAG_PROTECT_FROM_CLOSE: HandleFlags = HandleFlags(2u)
    }
}

/**
 * The maximum length of a full path in Windows.
 */
public const val MAX_PATH: UInt = 260u

/**
 * Size of an app-local device identifier in bytes.
 */
public const val APP_LOCAL_DEVICE_ID_SIZE: UInt = 32u

/**
 * Generic access rights.
 */
public class GenericAccessRights(
    public val value: UInt = 0u,
) {
    public fun contains(other: GenericAccessRights): Boolean = (value and other.value) == other.value

    public infix fun or(other: GenericAccessRights): GenericAccessRights =
        GenericAccessRights(value or other.value)

    public infix fun and(other: GenericAccessRights): GenericAccessRights =
        GenericAccessRights(value and other.value)

    public fun not(): GenericAccessRights = GenericAccessRights(value.inv())

    override fun equals(other: Any?): Boolean = other is GenericAccessRights && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "GenericAccessRights($value)"

    public companion object {
        public val GENERIC_ALL: GenericAccessRights = GenericAccessRights(0x10000000u)
        public val GENERIC_EXECUTE: GenericAccessRights = GenericAccessRights(0x20000000u)
        public val GENERIC_WRITE: GenericAccessRights = GenericAccessRights(0x40000000u)
        public val GENERIC_READ: GenericAccessRights = GenericAccessRights(0x80000000u)
    }
}

/**
 * Flags for object attributes.
 */
public class ObjectAttributeFlags(
    public val value: UInt = 0u,
) {
    public fun contains(other: ObjectAttributeFlags): Boolean = (value and other.value) == other.value

    public infix fun or(other: ObjectAttributeFlags): ObjectAttributeFlags =
        ObjectAttributeFlags(value or other.value)

    public infix fun and(other: ObjectAttributeFlags): ObjectAttributeFlags =
        ObjectAttributeFlags(value and other.value)

    public fun not(): ObjectAttributeFlags = ObjectAttributeFlags(value.inv())

    override fun equals(other: Any?): Boolean = other is ObjectAttributeFlags && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "ObjectAttributeFlags($value)"

    public companion object {
        public val OBJ_INHERIT: ObjectAttributeFlags = ObjectAttributeFlags(2u)
        public val OBJ_PERMANENT: ObjectAttributeFlags = ObjectAttributeFlags(16u)
        public val OBJ_EXCLUSIVE: ObjectAttributeFlags = ObjectAttributeFlags(32u)
        public val OBJ_CASE_INSENSITIVE: ObjectAttributeFlags = ObjectAttributeFlags(64u)
        public val OBJ_OPENIF: ObjectAttributeFlags = ObjectAttributeFlags(128u)
        public val OBJ_OPENLINK: ObjectAttributeFlags = ObjectAttributeFlags(256u)
        public val OBJ_KERNEL_HANDLE: ObjectAttributeFlags = ObjectAttributeFlags(512u)
        public val OBJ_FORCE_ACCESS_CHECK: ObjectAttributeFlags = ObjectAttributeFlags(1024u)
        public val OBJ_IGNORE_IMPERSONATED_DEVICEMAP: ObjectAttributeFlags = ObjectAttributeFlags(2048u)
        public val OBJ_DONT_REPARSE: ObjectAttributeFlags = ObjectAttributeFlags(4096u)
    }
}

/**
 * Event indicating return condition of a wait operation.
 */
public class WaitEvent(
    public val value: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean = other is WaitEvent && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "WaitEvent($value)"

    public companion object {
        public val WAIT_OBJECT_0: WaitEvent = WaitEvent(0u)
        public val WAIT_ABANDONED: WaitEvent = WaitEvent(128u)
        public val WAIT_ABANDONED_0: WaitEvent = WaitEvent(128u)
        public val WAIT_IO_COMPLETION: WaitEvent = WaitEvent(192u)
        public val WAIT_TIMEOUT: WaitEvent = WaitEvent(258u)
        public val WAIT_FAILED: WaitEvent = WaitEvent(0xFFFFFFFFu)
    }
}

/**
 * A handle to a surface.
 */
public data class HLSURF(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L

    public fun isNull(): Boolean = value == 0L
}

/**
 * A handle to a sprite.
 */
public data class HSPRITE(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L

    public fun isNull(): Boolean = value == 0L
}

/**
 * A handle to a string resource.
 */
public data class HSTR(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L

    public fun isNull(): Boolean = value == 0L
}

/**
 * A handle to a user mode printer driver.
 */
public data class HUMPD(
    public val value: Long = 0L,
) {
    public fun isInvalid(): Boolean = value == 0L

    public fun isNull(): Boolean = value == 0L
}

/**
 * A 128-bit floating point value represented by low and high 64-bit parts.
 */
public data class FLOAT128(
    public val lowPart: Long = 0L,
    public val highPart: Long = 0L,
)

/**
 * Represents an app-local device identifier.
 */
public data class APP_LOCAL_DEVICE_ID(
    public val value: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is APP_LOCAL_DEVICE_ID) return false
        return value.contentEquals(other.value)
    }

    override fun hashCode(): Int = value.contentHashCode()
}

/**
 * A counted Unicode string.
 */
public data class UNICODE_STRING(
    public val length: UShort = 0u,
    public val maximumLength: UShort = 0u,
    public val buffer: String = "",
)

/**
 * An unsigned pointer-sized handle.
 */
public data class HANDLE_PTR(
    public val value: ULong = 0uL,
)

/**
 * A signed pointer-sized handle.
 */
public data class SHANDLE_PTR(
    public val value: Long = 0L,
)
