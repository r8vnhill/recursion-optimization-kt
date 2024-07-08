package cl.ravenhill.trampoline

/**
 * Represents the completion of a tail-recursive computation with a result.
 *
 * ## Usage:
 * This class is used to represent the final result of a tail-recursive computation.
 *
 * ### Example 1: Creating a Done instance
 * ```
 * val result = Done(420)
 * println(result) // Output: Done(result=420)
 * ```
 * @property result The final result of the computation.
 */
data class Done(val result: Int) : Trampoline
