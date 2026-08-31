// port-lint: source windows/src/extensions/Foundation/TimeSpan.rs
package io.github.kotlinmania.windows.foundation

import kotlin.time.Duration
import kotlin.time.Duration.Companion.nanoseconds

/**
 * Converts a [TimeSpan] into a Kotlin standard library [Duration].
 */
public fun TimeSpan.toDuration(): Duration = (duration * 100).nanoseconds

/**
 * Converts a Kotlin standard library [Duration] into a [TimeSpan].
 */
public fun Duration.toTimeSpan(): TimeSpan = TimeSpan(inWholeNanoseconds / 100)
