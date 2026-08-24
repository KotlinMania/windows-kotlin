package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.networking.winsock.ADDRESS_FAMILY
import io.github.kotlinmania.windows.win32.networking.winsock.IN6_ADDR
import io.github.kotlinmania.windows.win32.networking.winsock.IN_ADDR
import io.github.kotlinmania.windows.win32.networking.winsock.SOCKADDR_IN
import io.github.kotlinmania.windows.win32.networking.winsock.SOCKADDR_IN6
import io.github.kotlinmania.windows.win32.networking.winsock.SOCKADDR_INET
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class WinSockTest {
    @Test
    fun testAddressFamilyConstants() {
        assertEquals(0u.toUShort(), ADDRESS_FAMILY.AF_UNSPEC.value)
        assertEquals(2u.toUShort(), ADDRESS_FAMILY.AF_INET.value)
        assertEquals(23u.toUShort(), ADDRESS_FAMILY.AF_INET6.value)
    }

    @Test
    fun testInAddrConversion() {
        val addr = IN_ADDR.fromOctets(127u, 0u, 0u, 1u)
        val octets = addr.toOctets()
        assertEquals(listOf(127u.toUByte(), 0u.toUByte(), 0u.toUByte(), 1u.toUByte()), octets)
        assertEquals("127.0.0.1", addr.toIpString())

        val parsed = IN_ADDR.fromIpString("192.168.1.1")
        assertEquals("192.168.1.1", parsed.toIpString())
    }

    @Test
    fun testIn6Addr() {
        val bytes = ByteArray(16) { it.toByte() }
        val in6 = IN6_ADDR.fromBytes(bytes)
        assertEquals(16, in6.bytes.size)
        assertEquals(0u.toUByte(), in6.bytes[0])
        assertEquals(15u.toUByte(), in6.bytes[15])
    }

    @Test
    fun testSockAddrInet() {
        val v4 =
            SOCKADDR_IN(
                sinFamily = ADDRESS_FAMILY.AF_INET,
                sinPort = 8080u,
                sinAddr = IN_ADDR.fromIpString("127.0.0.1"),
            )
        val inet4 = SOCKADDR_INET.fromIpv4(v4)
        assertEquals(ADDRESS_FAMILY.AF_INET, inet4.family)
        assertEquals(v4, inet4.ipv4)
        assertNull(inet4.ipv6)

        val v6 =
            SOCKADDR_IN6(
                sin6Family = ADDRESS_FAMILY.AF_INET6,
                sin6Port = 443u,
                sin6Addr = IN6_ADDR(),
            )
        val inet6 = SOCKADDR_INET.fromIpv6(v6)
        assertEquals(ADDRESS_FAMILY.AF_INET6, inet6.family)
        assertEquals(v6, inet6.ipv6)
        assertNull(inet6.ipv4)
    }
}
