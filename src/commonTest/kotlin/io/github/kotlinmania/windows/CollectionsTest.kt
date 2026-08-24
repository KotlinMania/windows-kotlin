package io.github.kotlinmania.windows

import io.github.kotlinmania.windows.foundation.collections.CollectionChange
import io.github.kotlinmania.windows.foundation.collections.PropertySet
import io.github.kotlinmania.windows.foundation.collections.StringMap
import io.github.kotlinmania.windows.foundation.collections.ValueSet
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class CollectionsTest {
    @Test
    fun testCollectionChangeConstants() {
        assertEquals(0, CollectionChange.Reset.value)
        assertEquals(1, CollectionChange.ItemInserted.value)
        assertEquals(2, CollectionChange.ItemRemoved.value)
        assertEquals(3, CollectionChange.ItemChanged.value)
    }

    @Test
    fun testStringMap() {
        val map = StringMap()
        assertEquals(0, map.size)

        assertFalse(map.insert("key1", "value1"))
        assertEquals(1, map.size)
        assertTrue(map.hasKey("key1"))
        assertEquals("value1", map.lookup("key1"))

        assertTrue(map.insert("key1", "value2"))
        assertEquals("value2", map.lookup("key1"))

        map.remove("key1")
        assertEquals(0, map.size)
        assertNull(map.lookup("key1"))
    }

    @Test
    fun testPropertySet() {
        val set = PropertySet()
        set.insert("count", 42)
        set.insert("name", "test")
        assertEquals(2, set.size)
        assertEquals(42, set.lookup("count"))
        assertEquals("test", set.lookup("name"))

        set.clear()
        assertEquals(0, set.size)
    }

    @Test
    fun testValueSet() {
        val values = ValueSet()
        values.insert("flag", true)
        assertTrue(values.hasKey("flag"))
        assertEquals(true, values.lookup("flag"))
    }
}
