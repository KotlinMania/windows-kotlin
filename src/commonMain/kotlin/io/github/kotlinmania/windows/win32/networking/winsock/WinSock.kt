// port-lint: source Windows/Win32/Networking/WinSock/mod.rs
package io.github.kotlinmania.windows.win32.networking.winsock

/**
 * Socket address family.
 */
public class ADDRESS_FAMILY(
    public val value: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean = other is ADDRESS_FAMILY && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "ADDRESS_FAMILY($value)"

    public companion object {
        public val AF_UNSPEC: ADDRESS_FAMILY = ADDRESS_FAMILY(0u)
        public val AF_UNIX: ADDRESS_FAMILY = ADDRESS_FAMILY(1u)
        public val AF_INET: ADDRESS_FAMILY = ADDRESS_FAMILY(2u)
        public val AF_IMPLINK: ADDRESS_FAMILY = ADDRESS_FAMILY(3u)
        public val AF_PUP: ADDRESS_FAMILY = ADDRESS_FAMILY(4u)
        public val AF_IPX: ADDRESS_FAMILY = ADDRESS_FAMILY(6u)
        public val AF_ISO: ADDRESS_FAMILY = ADDRESS_FAMILY(7u)
        public val AF_ECMA: ADDRESS_FAMILY = ADDRESS_FAMILY(8u)
        public val AF_SNA: ADDRESS_FAMILY = ADDRESS_FAMILY(11u)
        public val AF_NETBIOS: ADDRESS_FAMILY = ADDRESS_FAMILY(17u)
        public val AF_INET6: ADDRESS_FAMILY = ADDRESS_FAMILY(23u)
        public val AF_IRDA: ADDRESS_FAMILY = ADDRESS_FAMILY(26u)
    }
}

/**
 * An IPv4 Internet address.
 */
public data class IN_ADDR(
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
        public fun fromOctets(b1: UByte, b2: UByte, b3: UByte, b4: UByte): IN_ADDR {
            val addr =
                (b1.toUInt()) or
                    (b2.toUInt() shl 8) or
                    (b3.toUInt() shl 16) or
                    (b4.toUInt() shl 24)
            return IN_ADDR(addr)
        }

        public fun fromIpString(ip: String): IN_ADDR {
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
public data class IN6_ADDR(
    public val bytes: List<UByte> = List(16) { 0u },
) {
    init {
        require(bytes.size == 16) { "IN6_ADDR requires exactly 16 bytes" }
    }

    public companion object {
        public fun fromBytes(byteArray: ByteArray): IN6_ADDR {
            require(byteArray.size == 16) { "IN6_ADDR requires exactly 16 bytes" }
            return IN6_ADDR(byteArray.map { it.toUByte() })
        }
    }
}

/**
 * A socket address for IPv4.
 */
public data class SOCKADDR_IN(
    public val sinFamily: ADDRESS_FAMILY = ADDRESS_FAMILY.AF_INET,
    public val sinPort: UShort = 0u,
    public val sinAddr: IN_ADDR = IN_ADDR(),
)

/**
 * A socket address for IPv6.
 */
public data class SOCKADDR_IN6(
    public val sin6Family: ADDRESS_FAMILY = ADDRESS_FAMILY.AF_INET6,
    public val sin6Port: UShort = 0u,
    public val sin6Flowinfo: UInt = 0u,
    public val sin6Addr: IN6_ADDR = IN6_ADDR(),
    public val sin6ScopeId: UInt = 0u,
)

/**
 * A union / polymorphic socket address representing either IPv4 or IPv6.
 */
public data class SOCKADDR_INET(
    public val family: ADDRESS_FAMILY = ADDRESS_FAMILY.AF_UNSPEC,
    public val ipv4: SOCKADDR_IN? = null,
    public val ipv6: SOCKADDR_IN6? = null,
) {
    public companion object {
        public fun fromIpv4(addr: SOCKADDR_IN): SOCKADDR_INET =
            SOCKADDR_INET(family = ADDRESS_FAMILY.AF_INET, ipv4 = addr, ipv6 = null)

        public fun fromIpv6(addr: SOCKADDR_IN6): SOCKADDR_INET =
            SOCKADDR_INET(family = ADDRESS_FAMILY.AF_INET6, ipv4 = null, ipv6 = addr)
    }
}
