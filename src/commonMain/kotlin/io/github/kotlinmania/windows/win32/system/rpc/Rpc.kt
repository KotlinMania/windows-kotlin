// port-lint: source Windows/Win32/System/Rpc/mod.rs
package io.github.kotlinmania.windows.win32.system.rpc

/**
 * A Win32 RPC status code.
 */
public class RpcStatus(
    public val value: Int = 0,
) {
    override fun equals(other: Any?): Boolean = other is RpcStatus && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "RpcStatus($value)"

    public companion object {
        public val RPC_S_OK: RpcStatus = RpcStatus(0)
        public val RPC_S_RUNTIME_UNINITIALIZED: RpcStatus = RpcStatus(1)
        public val RPC_S_ACCESS_DENIED: RpcStatus = RpcStatus(5)
        public val RPC_S_OUT_OF_MEMORY: RpcStatus = RpcStatus(14)
        public val RPC_S_INVALID_LEVEL: RpcStatus = RpcStatus(87)
        public val RPC_S_INVALID_ARG: RpcStatus = RpcStatus(87)
        public val RPC_S_BUFFER_TOO_SMALL: RpcStatus = RpcStatus(122)
        public val RPC_S_OUT_OF_THREADS: RpcStatus = RpcStatus(164)
        public val RPC_S_ASYNC_CALL_PENDING: RpcStatus = RpcStatus(997)
        public val RPC_S_INVALID_SECURITY_DESC: RpcStatus = RpcStatus(1338)
        public val RPC_S_INVALID_STRING_BINDING: RpcStatus = RpcStatus(1700)
        public val RPC_S_INVALID_BINDING: RpcStatus = RpcStatus(1702)
        public val RPC_S_PROTSEQ_NOT_SUPPORTED: RpcStatus = RpcStatus(1703)
        public val RPC_S_INVALID_RPC_PROTSEQ: RpcStatus = RpcStatus(1704)
        public val RPC_S_INVALID_STRING_UUID: RpcStatus = RpcStatus(1705)
        public val RPC_S_INVALID_ENDPOINT_FORMAT: RpcStatus = RpcStatus(1706)
        public val RPC_S_INVALID_NET_ADDR: RpcStatus = RpcStatus(1707)
        public val RPC_S_NO_ENDPOINT_FOUND: RpcStatus = RpcStatus(1708)
        public val RPC_S_INVALID_TIMEOUT: RpcStatus = RpcStatus(1709)
        public val RPC_S_OBJECT_NOT_FOUND: RpcStatus = RpcStatus(1710)
        public val RPC_S_ALREADY_REGISTERED: RpcStatus = RpcStatus(1711)
        public val RPC_S_ALREADY_LISTENING: RpcStatus = RpcStatus(1713)
        public val RPC_S_NO_PROTSEQS_REGISTERED: RpcStatus = RpcStatus(1714)
        public val RPC_S_NOT_LISTENING: RpcStatus = RpcStatus(1715)
        public val RPC_S_NO_BINDINGS: RpcStatus = RpcStatus(1718)
        public val RPC_S_NO_PROTSEQS: RpcStatus = RpcStatus(1719)
        public val RPC_S_CANT_CREATE_ENDPOINT: RpcStatus = RpcStatus(1720)
        public val RPC_S_OUT_OF_RESOURCES: RpcStatus = RpcStatus(1721)
        public val RPC_S_INVALID_NETWORK_OPTIONS: RpcStatus = RpcStatus(1724)
        public val RPC_S_NO_CALL_ACTIVE: RpcStatus = RpcStatus(1725)
        public val RPC_S_CALL_FAILED: RpcStatus = RpcStatus(1726)
        public val RPC_S_CALL_FAILED_DNE: RpcStatus = RpcStatus(1727)
        public val RPC_S_PROTOCOL_ERROR: RpcStatus = RpcStatus(1728)
        public val RPC_S_PROXY_ACCESS_DENIED: RpcStatus = RpcStatus(1729)
        public val RPC_S_INVALID_TAG: RpcStatus = RpcStatus(1733)
        public val RPC_S_INVALID_BOUND: RpcStatus = RpcStatus(1734)
        public val RPC_S_NO_ENTRY_NAME: RpcStatus = RpcStatus(1735)
        public val RPC_S_INVALID_NAME_SYNTAX: RpcStatus = RpcStatus(1736)
        public val RPC_S_DUPLICATE_ENDPOINT: RpcStatus = RpcStatus(1740)
        public val RPC_S_MAX_CALLS_TOO_SMALL: RpcStatus = RpcStatus(1742)
        public val RPC_S_PROTSEQ_NOT_FOUND: RpcStatus = RpcStatus(1744)
        public val RPC_S_PROCNUM_OUT_OF_RANGE: RpcStatus = RpcStatus(1745)
        public val RPC_S_BINDING_HAS_NO_AUTH: RpcStatus = RpcStatus(1746)
        public val RPC_S_INVALID_AUTH_IDENTITY: RpcStatus = RpcStatus(1749)
        public val RPC_S_NOTHING_TO_EXPORT: RpcStatus = RpcStatus(1754)
        public val RPC_S_INCOMPLETE_NAME: RpcStatus = RpcStatus(1755)
        public val RPC_S_INVALID_VERS_OPTION: RpcStatus = RpcStatus(1756)
        public val RPC_S_NO_MORE_MEMBERS: RpcStatus = RpcStatus(1757)
        public val RPC_S_NOT_ALL_OBJS_UNEXPORTED: RpcStatus = RpcStatus(1758)
        public val RPC_S_INTERFACE_NOT_FOUND: RpcStatus = RpcStatus(1759)
        public val RPC_S_ENTRY_ALREADY_EXISTS: RpcStatus = RpcStatus(1760)
        public val RPC_S_ENTRY_NOT_FOUND: RpcStatus = RpcStatus(1761)
        public val RPC_S_NAME_SERVICE_UNAVAILABLE: RpcStatus = RpcStatus(1762)
        public val RPC_S_INVALID_NAF_ID: RpcStatus = RpcStatus(1763)
        public val RPC_S_CANNOT_SUPPORT: RpcStatus = RpcStatus(1764)
        public val RPC_S_NO_CONTEXT_AVAILABLE: RpcStatus = RpcStatus(1765)
        public val RPC_S_INTERNAL_ERROR: RpcStatus = RpcStatus(1766)
        public val RPC_S_ADDRESS_ERROR: RpcStatus = RpcStatus(1768)
        public val RPC_S_FP_DIV_ZERO: RpcStatus = RpcStatus(1769)
        public val RPC_S_FP_UNDERFLOW: RpcStatus = RpcStatus(1770)
        public val RPC_S_FP_OVERFLOW: RpcStatus = RpcStatus(1771)
        public val RPC_S_CALL_IN_PROGRESS: RpcStatus = RpcStatus(1791)
        public val RPC_S_NO_MORE_BINDINGS: RpcStatus = RpcStatus(1806)
        public val RPC_S_NOT_ENOUGH_QUOTA: RpcStatus = RpcStatus(1816)
        public val RPC_S_NO_INTERFACES: RpcStatus = RpcStatus(1817)
        public val RPC_S_CALL_CANCELLED: RpcStatus = RpcStatus(1818)
        public val RPC_S_BINDING_INCOMPLETE: RpcStatus = RpcStatus(1819)
        public val RPC_S_COMM_FAILURE: RpcStatus = RpcStatus(1820)
        public val RPC_S_NO_PRINC_NAME: RpcStatus = RpcStatus(1822)
        public val RPC_S_NOT_RPC_ERROR: RpcStatus = RpcStatus(1823)
        public val RPC_S_SEC_PKG_ERROR: RpcStatus = RpcStatus(1825)
        public val RPC_S_NOT_CANCELLED: RpcStatus = RpcStatus(1826)
        public val RPC_S_COOKIE_AUTH_FAILED: RpcStatus = RpcStatus(1833)
        public val RPC_S_DO_NOT_DISTURB: RpcStatus = RpcStatus(1834)
        public val RPC_S_GROUP_MEMBER_NOT_FOUND: RpcStatus = RpcStatus(1898)
        public val RPC_S_INVALID_OBJECT: RpcStatus = RpcStatus(1900)
        public val RPC_S_SEND_INCOMPLETE: RpcStatus = RpcStatus(1913)
        public val RPC_S_INVALID_ASYNC_HANDLE: RpcStatus = RpcStatus(1914)
        public val RPC_S_INVALID_ASYNC_CALL: RpcStatus = RpcStatus(1915)
        public val RPC_S_ENTRY_TYPE_MISMATCH: RpcStatus = RpcStatus(1922)
        public val RPC_S_NOT_ALL_OBJS_EXPORTED: RpcStatus = RpcStatus(1923)
        public val RPC_S_INTERFACE_NOT_EXPORTED: RpcStatus = RpcStatus(1924)
        public val RPC_S_PROFILE_NOT_ADDED: RpcStatus = RpcStatus(1925)
        public val RPC_S_PRF_ELT_NOT_ADDED: RpcStatus = RpcStatus(1926)
        public val RPC_S_PRF_ELT_NOT_REMOVED: RpcStatus = RpcStatus(1927)
        public val RPC_S_GRP_ELT_NOT_ADDED: RpcStatus = RpcStatus(1928)
        public val RPC_S_GRP_ELT_NOT_REMOVED: RpcStatus = RpcStatus(1929)
    }
}

/**
 * Returns true if this RPC status code represents success (RPC_S_OK).
 */
public fun RpcStatus.isOk(): Boolean = value == 0

/**
 * Returns true if this RPC status code represents an error.
 */
public fun RpcStatus.isErr(): Boolean = !isOk()

/**
 * Converts this RPC status code into a standard HRESULT value.
 */
public fun RpcStatus.toHresult(): Int {
    if (value == 0) return 0
    val facilityWin32 = 7
    val severityError = 1
    return (value and 0xFFFF) or (facilityWin32 shl 16) or (severityError shl 31)
}

/**
 * Converts this RPC status code into a Kotlin [Result].
 */
public fun RpcStatus.ok(): Result<Unit> =
    if (isOk()) {
        Result.success(Unit)
    } else {
        Result.failure(IllegalStateException("RPC error: $value (HRESULT: 0x${toHresult().toUInt().toString(16).uppercase()})"))
    }
