// port-lint: tests Windows/Win32/Networking/WinSock/mod.rs
package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windows.win32.networking.winsock.InAddr
import io.github.kotlinmania.windows.win32.networking.winsock.SockaddrIn
import io.github.kotlinmania.windows.win32.networking.winsock.SockaddrIn6
import io.github.kotlinmania.windows.win32.networking.winsock.SockaddrInet
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class WinSockTest {
    @Test
    fun testAddressFamilyConstants() {
        assertEquals(0u.toUShort(), AddressFamily.AF_UNSPEC.value)
        assertEquals(2u.toUShort(), AddressFamily.AF_INET.value)
        assertEquals(23u.toUShort(), AddressFamily.AF_INET6.value)
    }

    @Test
    fun testInAddrConversion() {
        val addr = InAddr.fromOctets(127u, 0u, 0u, 1u)
        val octets = addr.toOctets()
        assertEquals(listOf(127u.toUByte(), 0u.toUByte(), 0u.toUByte(), 1u.toUByte()), octets)
        assertEquals("127.0.0.1", addr.toIpString())

        val parsed = InAddr.fromIpString("192.168.1.1")
        assertEquals("192.168.1.1", parsed.toIpString())
    }

    @Test
    fun testIn6Addr() {
        val bytes = ByteArray(16) { it.toByte() }
        val in6 = In6Addr.fromBytes(bytes)
        assertEquals(16, in6.bytes.size)
        assertEquals(0u.toUByte(), in6.bytes[0])
        assertEquals(15u.toUByte(), in6.bytes[15])
    }

    @Test
    fun testSockAddrInet() {
        val v4 =
            SockaddrIn(
                sinFamily = AddressFamily.AF_INET,
                sinPort = 8080u,
                sinAddr = InAddr.fromIpString("127.0.0.1"),
            )
        val inet4 = SockaddrInet.fromIpv4(v4)
        assertEquals(AddressFamily.AF_INET, inet4.family)
        assertEquals(v4, inet4.ipv4)
        assertNull(inet4.ipv6)

        val v6 =
            SockaddrIn6(
                sin6Family = AddressFamily.AF_INET6,
                sin6Port = 443u,
                sin6Addr = In6Addr(),
            )
        val inet6 = SockaddrInet.fromIpv6(v6)
        assertEquals(AddressFamily.AF_INET6, inet6.family)
        assertEquals(v6, inet6.ipv6)
        assertNull(inet6.ipv4)
    }
}
