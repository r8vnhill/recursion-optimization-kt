package cl.ravenhill.trampoline

/**
 * Represents the continuation of a tail-recursive computation.
 *
 * ## Usage:
 * This class is used to represent a continuation of a tail-recursive computation that needs to be invoked to proceed
 * with the computation.
 *
 * ### Example 1: Creating a More instance
 * ```
 * val continuation = More { Done(42) }
 * println(continuation) // Output: More(continuation=...)
 * ```
 * @property continuation The continuation function to be invoked for the next step of the computation.
 */
data class More(val continuation: () -> Trampoline) : Trampoline
