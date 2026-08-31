// port-lint: source windows/src/Windows/Win32/Networking/WinSock/mod.rs
package io.github.kotlinmania.windows.win32.networking.winsock

/**
 * Socket address family.
 */
public class AddressFamily(
    public val value: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean = other is AddressFamily && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "AddressFamily($value)"

    public companion object {
        public val AF_UNSPEC: AddressFamily = AddressFamily(0u)
        public val AF_UNIX: AddressFamily = AddressFamily(1u)
        public val AF_INET: AddressFamily = AddressFamily(2u)
        public val AF_IMPLINK: AddressFamily = AddressFamily(3u)
        public val AF_PUP: AddressFamily = AddressFamily(4u)
        public val AF_IPX: AddressFamily = AddressFamily(6u)
        public val AF_ISO: AddressFamily = AddressFamily(7u)
        public val AF_ECMA: AddressFamily = AddressFamily(8u)
        public val AF_SNA: AddressFamily = AddressFamily(11u)
        public val AF_NETBIOS: AddressFamily = AddressFamily(17u)
        public val AF_INET6: AddressFamily = AddressFamily(23u)
        public val AF_IRDA: AddressFamily = AddressFamily(26u)
    }
}

/**
 * An IPv4 Internet address.
 */
public data class InAddr(
    public val sAddr: UInt = 0u,
) {
    public fun toOctets(): List<UByte> {
        val b1 = (sAddr and 0xFFu).toUByte()
        val b2 = ((sAddr shr 8) and 0xFFu).toUByte()
        val b3 = ((sAddr shr 16) and 0xFFu).toUByte()
        val b4 = ((sAddr shr 24) and 0xFFu).toUByte()
        return listOf(b1, b2, b3, b4)
    }

    public fun toIpString(): String {
        val octets = toOctets()
        return "${octets[0]}.${octets[1]}.${octets[2]}.${octets[3]}"
    }

    public companion object {
        public fun fromOctets(b1: UByte, b2: UByte, b3: UByte, b4: UByte): InAddr {
            val addr =
                (b1.toUInt()) or
                    (b2.toUInt() shl 8) or
                    (b3.toUInt() shl 16) or
                    (b4.toUInt() shl 24)
            return InAddr(addr)
        }

        public fun fromIpString(ip: String): InAddr {
            val parts = ip.split(".")
            require(parts.size == 4) { "Invalid IPv4 address: $ip" }
            val b1 = parts[0].toUByte()
            val b2 = parts[1].toUByte()
            val b3 = parts[2].toUByte()
            val b4 = parts[3].toUByte()
            return fromOctets(b1, b2, b3, b4)
        }
    }
}

/**
 * An IPv6 Internet address (16 octets).
 */
public data class In6Addr(
    public val bytes: List<UByte> = List(16) { 0u },
) {
    init {
        require(bytes.size == 16) { "In6Addr requires exactly 16 bytes" }
    }

    public companion object {
        public fun fromBytes(byteArray: ByteArray): In6Addr {
            require(byteArray.size == 16) { "In6Addr requires exactly 16 bytes" }
            return In6Addr(byteArray.map { it.toUByte() })
        }
    }
}

/**
 * A socket address for IPv4.
 */
public data class SockaddrIn(
    public val sinFamily: AddressFamily = AddressFamily.AF_INET,
    public val sinPort: UShort = 0u,
    public val sinAddr: InAddr = InAddr(),
)

/**
 * A socket address for IPv6.
 */
public data class SockaddrIn6(
    public val sin6Family: AddressFamily = AddressFamily.AF_INET6,
    public val sin6Port: UShort = 0u,
    public val sin6Flowinfo: UInt = 0u,
    public val sin6Addr: In6Addr = In6Addr(),
    public val sin6ScopeId: UInt = 0u,
)

/**
 * A union / polymorphic socket address representing either IPv4 or IPv6.
 */
public data class SockaddrInet(
    public val family: AddressFamily = AddressFamily.AF_UNSPEC,
    public val ipv4: SockaddrIn? = null,
    public val ipv6: SockaddrIn6? = null,
) {
    public companion object {
        public fun fromIpv4(addr: SockaddrIn): SockaddrInet =
            SockaddrInet(family = AddressFamily.AF_INET, ipv4 = addr, ipv6 = null)

        public fun fromIpv6(addr: SockaddrIn6): SockaddrInet =
            SockaddrInet(family = AddressFamily.AF_INET6, ipv4 = null, ipv6 = addr)
    }
}
