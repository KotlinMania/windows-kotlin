// port-lint: source Windows/Foundation/Collections/mod.rs
package io.github.kotlinmania.windows.foundation.collections

/**
 * Describes the action that caused a change to a collection.
 */
public class CollectionChange(
    public val value: Int,
) {
    override fun equals(other: Any?): Boolean = other is CollectionChange && value == other.value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "CollectionChange($value)"

    public companion object {
        public val Reset: CollectionChange = CollectionChange(0)
        public val ItemInserted: CollectionChange = CollectionChange(1)
        public val ItemRemoved: CollectionChange = CollectionChange(2)
        public val ItemChanged: CollectionChange = CollectionChange(3)
    }
}

/**
 * Represents an associative collection of string keys and string values.
 */
public class StringMap {
    private val entries = mutableMapOf<String, String>()

    public val size: Int
        get() = entries.size

    public fun lookup(key: String): String? = entries[key]

    public fun hasKey(key: String): Boolean = entries.containsKey(key)

    public fun insert(key: String, value: String): Boolean {
        val replaced = entries.containsKey(key)
        entries[key] = value
        return replaced
    }

    public fun remove(key: String) {
        entries.remove(key)
    }

    public fun clear() {
        entries.clear()
    }

    public fun toMap(): Map<String, String> = entries.toMap()
}

/**
 * Represents a property set, which is an associative collection of string keys and object values.
 */
public class PropertySet {
    private val entries = mutableMapOf<String, Any?>()

    public val size: Int
        get() = entries.size

    public fun lookup(key: String): Any? = entries[key]

    public fun hasKey(key: String): Boolean = entries.containsKey(key)

    public fun insert(key: String, value: Any?): Boolean {
        val replaced = entries.containsKey(key)
        entries[key] = value
        return replaced
    }

    public fun remove(key: String) {
        entries.remove(key)
    }

    public fun clear() {
        entries.clear()
    }

    public fun toMap(): Map<String, Any?> = entries.toMap()
}

/**
 * Represents a collection of key-value pairs, correlating several other Windows Runtime objects.
 */
public class ValueSet {
    private val entries = mutableMapOf<String, Any?>()

    public val size: Int
        get() = entries.size

    public fun lookup(key: String): Any? = entries[key]

    public fun hasKey(key: String): Boolean = entries.containsKey(key)

    public fun insert(key: String, value: Any?): Boolean {
        val replaced = entries.containsKey(key)
        entries[key] = value
        return replaced
    }

    public fun remove(key: String) {
        entries.remove(key)
    }

    public fun clear() {
        entries.clear()
    }

    public fun toMap(): Map<String, Any?> = entries.toMap()
}
