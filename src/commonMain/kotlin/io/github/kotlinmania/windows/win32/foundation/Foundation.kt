// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windows.win32.foundation

/**
 * A Win32 error code.
 */
public class WIN32_ERROR(
    public val value: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean = other is WIN32_ERROR && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "WIN32_ERROR($value)"

    public companion object {
        public val ERROR_SUCCESS: WIN32_ERROR = WIN32_ERROR(0u)
        public val ERROR_INVALID_FUNCTION: WIN32_ERROR = WIN32_ERROR(1u)
        public val ERROR_FILE_NOT_FOUND: WIN32_ERROR = WIN32_ERROR(2u)
        public val ERROR_PATH_NOT_FOUND: WIN32_ERROR = WIN32_ERROR(3u)
        public val ERROR_TOO_MANY_OPEN_FILES: WIN32_ERROR = WIN32_ERROR(4u)
        public val ERROR_ACCESS_DENIED: WIN32_ERROR = WIN32_ERROR(5u)
        public val ERROR_INVALID_HANDLE: WIN32_ERROR = WIN32_ERROR(6u)
        public val ERROR_ARENA_TRASHED: WIN32_ERROR = WIN32_ERROR(7u)
        public val ERROR_NOT_ENOUGH_MEMORY: WIN32_ERROR = WIN32_ERROR(8u)
        public val ERROR_INVALID_BLOCK: WIN32_ERROR = WIN32_ERROR(9u)
        public val ERROR_BAD_ENVIRONMENT: WIN32_ERROR = WIN32_ERROR(10u)
        public val ERROR_BAD_FORMAT: WIN32_ERROR = WIN32_ERROR(11u)
        public val ERROR_INVALID_ACCESS: WIN32_ERROR = WIN32_ERROR(12u)
        public val ERROR_INVALID_DATA: WIN32_ERROR = WIN32_ERROR(13u)
        public val ERROR_OUTOFMEMORY: WIN32_ERROR = WIN32_ERROR(14u)
        public val ERROR_INVALID_DRIVE: WIN32_ERROR = WIN32_ERROR(15u)
        public val ERROR_CURRENT_DIRECTORY: WIN32_ERROR = WIN32_ERROR(16u)
        public val ERROR_NOT_SAME_DEVICE: WIN32_ERROR = WIN32_ERROR(17u)
        public val ERROR_NO_MORE_FILES: WIN32_ERROR = WIN32_ERROR(18u)
        public val ERROR_WRITE_PROTECT: WIN32_ERROR = WIN32_ERROR(19u)
        public val ERROR_BAD_UNIT: WIN32_ERROR = WIN32_ERROR(20u)
        public val ERROR_NOT_READY: WIN32_ERROR = WIN32_ERROR(21u)
        public val ERROR_BAD_COMMAND: WIN32_ERROR = WIN32_ERROR(22u)
        public val ERROR_CRC: WIN32_ERROR = WIN32_ERROR(23u)
        public val ERROR_BAD_LENGTH: WIN32_ERROR = WIN32_ERROR(24u)
        public val ERROR_SEEK: WIN32_ERROR = WIN32_ERROR(25u)
        public val ERROR_NOT_DOS_DISK: WIN32_ERROR = WIN32_ERROR(26u)
        public val ERROR_SECTOR_NOT_FOUND: WIN32_ERROR = WIN32_ERROR(27u)
        public val ERROR_OUT_OF_PAPER: WIN32_ERROR = WIN32_ERROR(28u)
        public val ERROR_WRITE_FAULT: WIN32_ERROR = WIN32_ERROR(29u)
        public val ERROR_READ_FAULT: WIN32_ERROR = WIN32_ERROR(30u)
        public val ERROR_GEN_FAILURE: WIN32_ERROR = WIN32_ERROR(31u)
        public val ERROR_SHARING_VIOLATION: WIN32_ERROR = WIN32_ERROR(32u)
        public val ERROR_LOCK_VIOLATION: WIN32_ERROR = WIN32_ERROR(33u)
        public val ERROR_HANDLE_DISK_FULL: WIN32_ERROR = WIN32_ERROR(39u)
        public val ERROR_NOT_SUPPORTED: WIN32_ERROR = WIN32_ERROR(50u)
        public val ERROR_REM_NOT_LIST: WIN32_ERROR = WIN32_ERROR(51u)
        public val ERROR_DUP_NAME: WIN32_ERROR = WIN32_ERROR(52u)
        public val ERROR_BAD_NETPATH: WIN32_ERROR = WIN32_ERROR(53u)
        public val ERROR_NETWORK_BUSY: WIN32_ERROR = WIN32_ERROR(54u)
        public val ERROR_DEV_NOT_EXIST: WIN32_ERROR = WIN32_ERROR(55u)
        public val ERROR_TOO_MANY_CMDS: WIN32_ERROR = WIN32_ERROR(56u)
        public val ERROR_ADAP_HDW_ERR: WIN32_ERROR = WIN32_ERROR(57u)
        public val ERROR_BAD_NET_RESP: WIN32_ERROR = WIN32_ERROR(58u)
        public val ERROR_UNEXP_NET_ERR: WIN32_ERROR = WIN32_ERROR(59u)
        public val ERROR_BAD_REM_ADAP: WIN32_ERROR = WIN32_ERROR(60u)
        public val ERROR_PRINTQ_FULL: WIN32_ERROR = WIN32_ERROR(61u)
        public val ERROR_NO_SPOOL_SPACE: WIN32_ERROR = WIN32_ERROR(62u)
        public val ERROR_PRINT_CANCELLED: WIN32_ERROR = WIN32_ERROR(63u)
        public val ERROR_NETNAME_DELETED: WIN32_ERROR = WIN32_ERROR(64u)
        public val ERROR_NETWORK_ACCESS_DENIED: WIN32_ERROR = WIN32_ERROR(65u)
        public val ERROR_BAD_DEV_TYPE: WIN32_ERROR = WIN32_ERROR(66u)
        public val ERROR_BAD_NET_NAME: WIN32_ERROR = WIN32_ERROR(67u)
        public val ERROR_TOO_MANY_NAMES: WIN32_ERROR = WIN32_ERROR(68u)
        public val ERROR_TOO_MANY_SESS: WIN32_ERROR = WIN32_ERROR(69u)
        public val ERROR_SHARING_PAUSED: WIN32_ERROR = WIN32_ERROR(70u)
        public val ERROR_REQ_NOT_ACCEP: WIN32_ERROR = WIN32_ERROR(71u)
        public val ERROR_REDIR_PAUSED: WIN32_ERROR = WIN32_ERROR(72u)
        public val ERROR_FILE_EXISTS: WIN32_ERROR = WIN32_ERROR(80u)
        public val ERROR_CANNOT_MAKE: WIN32_ERROR = WIN32_ERROR(82u)
        public val ERROR_FAIL_I24: WIN32_ERROR = WIN32_ERROR(83u)
        public val ERROR_OUT_OF_STRUCTURES: WIN32_ERROR = WIN32_ERROR(84u)
        public val ERROR_ALREADY_ASSIGNED: WIN32_ERROR = WIN32_ERROR(85u)
        public val ERROR_INVALID_PASSWORD: WIN32_ERROR = WIN32_ERROR(86u)
        public val ERROR_INVALID_PARAMETER: WIN32_ERROR = WIN32_ERROR(87u)
        public val ERROR_NET_WRITE_FAULT: WIN32_ERROR = WIN32_ERROR(88u)
        public val ERROR_NO_PROC_SLOTS: WIN32_ERROR = WIN32_ERROR(89u)
        public val ERROR_TOO_MANY_SEMAPHORES: WIN32_ERROR = WIN32_ERROR(100u)
        public val ERROR_EXCL_SEM_ALREADY_OWNED: WIN32_ERROR = WIN32_ERROR(101u)
        public val ERROR_SEM_IS_SET: WIN32_ERROR = WIN32_ERROR(102u)
        public val ERROR_TOO_MANY_SEM_REQUESTS: WIN32_ERROR = WIN32_ERROR(103u)
        public val ERROR_INVALID_AT_INTERRUPT_TIME: WIN32_ERROR = WIN32_ERROR(104u)
        public val ERROR_SEM_OWNER_DIED: WIN32_ERROR = WIN32_ERROR(105u)
        public val ERROR_SEM_USER_LIMIT: WIN32_ERROR = WIN32_ERROR(106u)
        public val ERROR_DISK_CHANGE: WIN32_ERROR = WIN32_ERROR(107u)
        public val ERROR_DRIVE_LOCKED: WIN32_ERROR = WIN32_ERROR(108u)
        public val ERROR_BROKEN_PIPE: WIN32_ERROR = WIN32_ERROR(109u)
        public val ERROR_OPEN_FAILED: WIN32_ERROR = WIN32_ERROR(110u)
        public val ERROR_BUFFER_OVERFLOW: WIN32_ERROR = WIN32_ERROR(111u)
        public val ERROR_DISK_FULL: WIN32_ERROR = WIN32_ERROR(112u)
        public val ERROR_NO_MORE_SEARCH_HANDLES: WIN32_ERROR = WIN32_ERROR(113u)
        public val ERROR_INVALID_TARGET_HANDLE: WIN32_ERROR = WIN32_ERROR(114u)
        public val ERROR_INVALID_CATEGORY: WIN32_ERROR = WIN32_ERROR(117u)
        public val ERROR_INVALID_VERIFY_SWITCH: WIN32_ERROR = WIN32_ERROR(118u)
        public val ERROR_BAD_DRIVER_LEVEL: WIN32_ERROR = WIN32_ERROR(119u)
        public val ERROR_CALL_NOT_IMPLEMENTED: WIN32_ERROR = WIN32_ERROR(120u)
        public val ERROR_SEM_TIMEOUT: WIN32_ERROR = WIN32_ERROR(121u)
        public val ERROR_INSUFFICIENT_BUFFER: WIN32_ERROR = WIN32_ERROR(122u)
        public val ERROR_INVALID_NAME: WIN32_ERROR = WIN32_ERROR(123u)
        public val ERROR_INVALID_LEVEL: WIN32_ERROR = WIN32_ERROR(124u)
        public val ERROR_NO_VOLUME_LABEL: WIN32_ERROR = WIN32_ERROR(125u)
        public val ERROR_MOD_NOT_FOUND: WIN32_ERROR = WIN32_ERROR(126u)
        public val ERROR_PROC_NOT_FOUND: WIN32_ERROR = WIN32_ERROR(127u)
        public val ERROR_WAIT_NO_CHILDREN: WIN32_ERROR = WIN32_ERROR(128u)
        public val ERROR_CHILD_NOT_COMPLETE: WIN32_ERROR = WIN32_ERROR(129u)
        public val ERROR_DIRECT_ACCESS_HANDLE: WIN32_ERROR = WIN32_ERROR(130u)
        public val ERROR_NEGATIVE_SEEK: WIN32_ERROR = WIN32_ERROR(131u)
        public val ERROR_SEEK_ON_DEVICE: WIN32_ERROR = WIN32_ERROR(132u)
        public val ERROR_DIR_NOT_ROOT: WIN32_ERROR = WIN32_ERROR(143u)
        public val ERROR_DIR_NOT_EMPTY: WIN32_ERROR = WIN32_ERROR(145u)
        public val ERROR_PATH_BUSY: WIN32_ERROR = WIN32_ERROR(148u)
        public val ERROR_DISCARDED: WIN32_ERROR = WIN32_ERROR(157u)
        public val ERROR_BAD_ARGUMENTS: WIN32_ERROR = WIN32_ERROR(160u)
        public val ERROR_BAD_PATHNAME: WIN32_ERROR = WIN32_ERROR(161u)
        public val ERROR_SIGNAL_REFUSED: WIN32_ERROR = WIN32_ERROR(162u)
        public val ERROR_BUSY: WIN32_ERROR = WIN32_ERROR(170u)
        public val ERROR_ALREADY_EXISTS: WIN32_ERROR = WIN32_ERROR(183u)
        public val ERROR_NOT_FOUND: WIN32_ERROR = WIN32_ERROR(1168u)
        public val ERROR_CANCELLED: WIN32_ERROR = WIN32_ERROR(1223u)
        public val ERROR_TIMEOUT: WIN32_ERROR = WIN32_ERROR(1460u)
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
public class VARIANT_BOOL(
    public val value: Short = 0,
) {
    override fun equals(other: Any?): Boolean = other is VARIANT_BOOL && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = if (value != 0.toShort()) "VARIANT_TRUE" else "VARIANT_FALSE"

    public companion object {
        public val VARIANT_TRUE: VARIANT_BOOL = VARIANT_BOOL((-1).toShort())
        public val VARIANT_FALSE: VARIANT_BOOL = VARIANT_BOOL(0.toShort())

        public fun fromBoolean(value: Boolean): VARIANT_BOOL =
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
