// port-lint: source Windows/Win32/System/Rpc/mod.rs
package io.github.kotlinmania.windows.win32.system.rpc

/**
 * A Win32 RPC status code.
 */
public class RPC_STATUS(
    public val value: Int = 0,
) {
    override fun equals(other: Any?): Boolean = other is RPC_STATUS && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "RPC_STATUS($value)"

    public companion object {
        public val RPC_S_OK: RPC_STATUS = RPC_STATUS(0)
        public val RPC_S_RUNTIME_UNINITIALIZED: RPC_STATUS = RPC_STATUS(1)
        public val RPC_S_ACCESS_DENIED: RPC_STATUS = RPC_STATUS(5)
        public val RPC_S_OUT_OF_MEMORY: RPC_STATUS = RPC_STATUS(14)
        public val RPC_S_INVALID_LEVEL: RPC_STATUS = RPC_STATUS(87)
        public val RPC_S_INVALID_ARG: RPC_STATUS = RPC_STATUS(87)
        public val RPC_S_BUFFER_TOO_SMALL: RPC_STATUS = RPC_STATUS(122)
        public val RPC_S_OUT_OF_THREADS: RPC_STATUS = RPC_STATUS(164)
        public val RPC_S_ASYNC_CALL_PENDING: RPC_STATUS = RPC_STATUS(997)
        public val RPC_S_INVALID_SECURITY_DESC: RPC_STATUS = RPC_STATUS(1338)
        public val RPC_S_INVALID_STRING_BINDING: RPC_STATUS = RPC_STATUS(1700)
        public val RPC_S_INVALID_BINDING: RPC_STATUS = RPC_STATUS(1702)
        public val RPC_S_PROTSEQ_NOT_SUPPORTED: RPC_STATUS = RPC_STATUS(1703)
        public val RPC_S_INVALID_RPC_PROTSEQ: RPC_STATUS = RPC_STATUS(1704)
        public val RPC_S_INVALID_STRING_UUID: RPC_STATUS = RPC_STATUS(1705)
        public val RPC_S_INVALID_ENDPOINT_FORMAT: RPC_STATUS = RPC_STATUS(1706)
        public val RPC_S_INVALID_NET_ADDR: RPC_STATUS = RPC_STATUS(1707)
        public val RPC_S_NO_ENDPOINT_FOUND: RPC_STATUS = RPC_STATUS(1708)
        public val RPC_S_INVALID_TIMEOUT: RPC_STATUS = RPC_STATUS(1709)
        public val RPC_S_OBJECT_NOT_FOUND: RPC_STATUS = RPC_STATUS(1710)
        public val RPC_S_ALREADY_REGISTERED: RPC_STATUS = RPC_STATUS(1711)
        public val RPC_S_ALREADY_LISTENING: RPC_STATUS = RPC_STATUS(1713)
        public val RPC_S_NO_PROTSEQS_REGISTERED: RPC_STATUS = RPC_STATUS(1714)
        public val RPC_S_NOT_LISTENING: RPC_STATUS = RPC_STATUS(1715)
        public val RPC_S_NO_BINDINGS: RPC_STATUS = RPC_STATUS(1718)
        public val RPC_S_NO_PROTSEQS: RPC_STATUS = RPC_STATUS(1719)
        public val RPC_S_CANT_CREATE_ENDPOINT: RPC_STATUS = RPC_STATUS(1720)
        public val RPC_S_OUT_OF_RESOURCES: RPC_STATUS = RPC_STATUS(1721)
        public val RPC_S_INVALID_NETWORK_OPTIONS: RPC_STATUS = RPC_STATUS(1724)
        public val RPC_S_NO_CALL_ACTIVE: RPC_STATUS = RPC_STATUS(1725)
        public val RPC_S_CALL_FAILED: RPC_STATUS = RPC_STATUS(1726)
        public val RPC_S_CALL_FAILED_DNE: RPC_STATUS = RPC_STATUS(1727)
        public val RPC_S_PROTOCOL_ERROR: RPC_STATUS = RPC_STATUS(1728)
        public val RPC_S_PROXY_ACCESS_DENIED: RPC_STATUS = RPC_STATUS(1729)
        public val RPC_S_INVALID_TAG: RPC_STATUS = RPC_STATUS(1733)
        public val RPC_S_INVALID_BOUND: RPC_STATUS = RPC_STATUS(1734)
        public val RPC_S_NO_ENTRY_NAME: RPC_STATUS = RPC_STATUS(1735)
        public val RPC_S_INVALID_NAME_SYNTAX: RPC_STATUS = RPC_STATUS(1736)
        public val RPC_S_DUPLICATE_ENDPOINT: RPC_STATUS = RPC_STATUS(1740)
        public val RPC_S_MAX_CALLS_TOO_SMALL: RPC_STATUS = RPC_STATUS(1742)
        public val RPC_S_PROTSEQ_NOT_FOUND: RPC_STATUS = RPC_STATUS(1744)
        public val RPC_S_PROCNUM_OUT_OF_RANGE: RPC_STATUS = RPC_STATUS(1745)
        public val RPC_S_BINDING_HAS_NO_AUTH: RPC_STATUS = RPC_STATUS(1746)
        public val RPC_S_INVALID_AUTH_IDENTITY: RPC_STATUS = RPC_STATUS(1749)
        public val RPC_S_NOTHING_TO_EXPORT: RPC_STATUS = RPC_STATUS(1754)
        public val RPC_S_INCOMPLETE_NAME: RPC_STATUS = RPC_STATUS(1755)
        public val RPC_S_INVALID_VERS_OPTION: RPC_STATUS = RPC_STATUS(1756)
        public val RPC_S_NO_MORE_MEMBERS: RPC_STATUS = RPC_STATUS(1757)
        public val RPC_S_NOT_ALL_OBJS_UNEXPORTED: RPC_STATUS = RPC_STATUS(1758)
        public val RPC_S_INTERFACE_NOT_FOUND: RPC_STATUS = RPC_STATUS(1759)
        public val RPC_S_ENTRY_ALREADY_EXISTS: RPC_STATUS = RPC_STATUS(1760)
        public val RPC_S_ENTRY_NOT_FOUND: RPC_STATUS = RPC_STATUS(1761)
        public val RPC_S_NAME_SERVICE_UNAVAILABLE: RPC_STATUS = RPC_STATUS(1762)
        public val RPC_S_INVALID_NAF_ID: RPC_STATUS = RPC_STATUS(1763)
        public val RPC_S_CANNOT_SUPPORT: RPC_STATUS = RPC_STATUS(1764)
        public val RPC_S_NO_CONTEXT_AVAILABLE: RPC_STATUS = RPC_STATUS(1765)
        public val RPC_S_INTERNAL_ERROR: RPC_STATUS = RPC_STATUS(1766)
        public val RPC_S_ADDRESS_ERROR: RPC_STATUS = RPC_STATUS(1768)
        public val RPC_S_FP_DIV_ZERO: RPC_STATUS = RPC_STATUS(1769)
        public val RPC_S_FP_UNDERFLOW: RPC_STATUS = RPC_STATUS(1770)
        public val RPC_S_FP_OVERFLOW: RPC_STATUS = RPC_STATUS(1771)
        public val RPC_S_CALL_IN_PROGRESS: RPC_STATUS = RPC_STATUS(1791)
        public val RPC_S_NO_MORE_BINDINGS: RPC_STATUS = RPC_STATUS(1806)
        public val RPC_S_NOT_ENOUGH_QUOTA: RPC_STATUS = RPC_STATUS(1816)
        public val RPC_S_NO_INTERFACES: RPC_STATUS = RPC_STATUS(1817)
        public val RPC_S_CALL_CANCELLED: RPC_STATUS = RPC_STATUS(1818)
        public val RPC_S_BINDING_INCOMPLETE: RPC_STATUS = RPC_STATUS(1819)
        public val RPC_S_COMM_FAILURE: RPC_STATUS = RPC_STATUS(1820)
        public val RPC_S_NO_PRINC_NAME: RPC_STATUS = RPC_STATUS(1822)
        public val RPC_S_NOT_RPC_ERROR: RPC_STATUS = RPC_STATUS(1823)
        public val RPC_S_SEC_PKG_ERROR: RPC_STATUS = RPC_STATUS(1825)
        public val RPC_S_NOT_CANCELLED: RPC_STATUS = RPC_STATUS(1826)
        public val RPC_S_COOKIE_AUTH_FAILED: RPC_STATUS = RPC_STATUS(1833)
        public val RPC_S_DO_NOT_DISTURB: RPC_STATUS = RPC_STATUS(1834)
        public val RPC_S_GROUP_MEMBER_NOT_FOUND: RPC_STATUS = RPC_STATUS(1898)
        public val RPC_S_INVALID_OBJECT: RPC_STATUS = RPC_STATUS(1900)
        public val RPC_S_SEND_INCOMPLETE: RPC_STATUS = RPC_STATUS(1913)
        public val RPC_S_INVALID_ASYNC_HANDLE: RPC_STATUS = RPC_STATUS(1914)
        public val RPC_S_INVALID_ASYNC_CALL: RPC_STATUS = RPC_STATUS(1915)
        public val RPC_S_ENTRY_TYPE_MISMATCH: RPC_STATUS = RPC_STATUS(1922)
        public val RPC_S_NOT_ALL_OBJS_EXPORTED: RPC_STATUS = RPC_STATUS(1923)
        public val RPC_S_INTERFACE_NOT_EXPORTED: RPC_STATUS = RPC_STATUS(1924)
        public val RPC_S_PROFILE_NOT_ADDED: RPC_STATUS = RPC_STATUS(1925)
        public val RPC_S_PRF_ELT_NOT_ADDED: RPC_STATUS = RPC_STATUS(1926)
        public val RPC_S_PRF_ELT_NOT_REMOVED: RPC_STATUS = RPC_STATUS(1927)
        public val RPC_S_GRP_ELT_NOT_ADDED: RPC_STATUS = RPC_STATUS(1928)
        public val RPC_S_GRP_ELT_NOT_REMOVED: RPC_STATUS = RPC_STATUS(1929)
    }
}

/**
 * Returns true if this RPC status code represents success (RPC_S_OK).
 */
public fun RPC_STATUS.isOk(): Boolean = value == 0

/**
 * Returns true if this RPC status code represents an error.
 */
public fun RPC_STATUS.isErr(): Boolean = !isOk()

/**
 * Converts this RPC status code into a standard HRESULT value.
 */
public fun RPC_STATUS.toHresult(): Int {
    if (value == 0) return 0
    val facilityWin32 = 7
    val severityError = 1
    return (value and 0xFFFF) or (facilityWin32 shl 16) or (severityError shl 31)
}

/**
 * Converts this RPC status code into a Kotlin [Result].
 */
public fun RPC_STATUS.ok(): Result<Unit> =
    if (isOk()) {
        Result.success(Unit)
    } else {
        Result.failure(IllegalStateException("RPC error: $value (HRESULT: 0x${toHresult().toUInt().toString(16).uppercase()})"))
    }
