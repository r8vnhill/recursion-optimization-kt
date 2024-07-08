package cl.ravenhill.trampoline

/**
 * Executes a trampoline to obtain the final result of a tail-recursive computation.
 *
 * ## Usage:
 * This function takes a `Trampoline` instance and repeatedly invokes continuations until the final result is obtained.
 * It supports tail-recursive computations by converting them into an iterative process.
 *
 * ### Example 1: Running a Trampoline with a Done Result
 * ```
 * val trampoline = Done(420)
 * val result = runTrampoline(trampoline)
 * println(result) // Output: 420
 * ```
 *
 * ### Example 2: Running a Trampoline with a More Continuation
 * ```
 * val trampoline = More { Done(420) }
 * val result = runTrampoline(trampoline)
 * println(result) // Output: 420
 * ```
 *
 * @param trampoline The initial `Trampoline` instance to execute.
 * @return The final result of the tail-recursive computation.
 */
fun runTrampoline(trampoline: Trampoline): Int {
    var current: Trampoline = trampoline
    while (true) {
        when (current) {
            is Done -> return current.result
            is More -> current = current.continuation()
        }
    }
}
