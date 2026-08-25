package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.win32.system.rpc.RpcStatus
import io.github.kotlinmania.windows.win32.system.rpc.isErr
import io.github.kotlinmania.windows.win32.system.rpc.isOk
import io.github.kotlinmania.windows.win32.system.rpc.ok
import io.github.kotlinmania.windows.win32.system.rpc.toHresult
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RpcTest {
    @Test
    fun testRpcStatusSuccess() {
        val status = RpcStatus.RPC_S_OK
        assertTrue(status.isOk())
        assertFalse(status.isErr())
        assertEquals(0, status.toHresult())
        assertTrue(status.ok().isSuccess)
    }

    @Test
    fun testRpcStatusError() {
        val status = RpcStatus.RPC_S_ACCESS_DENIED
        assertFalse(status.isOk())
        assertTrue(status.isErr())
        assertTrue(status.ok().isFailure)
        val hresult = status.toHresult()
        assertTrue(hresult < 0)
    }

    @Test
    fun testRpcStatusEquality() {
        assertEquals(RpcStatus(0), RpcStatus.RPC_S_OK)
        assertEquals(RpcStatus(5), RpcStatus.RPC_S_ACCESS_DENIED)
        assertEquals(RpcStatus(1702), RpcStatus.RPC_S_INVALID_BINDING)
    }
}
