package cl.ravenhill.sum

import cl.ravenhill.trampoline.Done
import cl.ravenhill.trampoline.More
import cl.ravenhill.trampoline.Trampoline
import cl.ravenhill.trampoline.runTrampoline

/**
 * Calculates the sum of integers from 1 to `n` using a trampoline for tail-recursive computations.
 *
 * ## Usage:
 * This function calculates the sum of integers from 1 to `n` using a trampoline to avoid stack overflow in deeply
 * recursive calls. It returns a `Trampoline` that represents the computation.
 *
 * ### Example 1: Calculating the Sum of Integers from 1 to 10
 * ```
 * val trampoline = sumFirstNaturals(10)
 * val result = runTrampoline(trampoline)
 * println(result) // Output: 55
 * ```
 *
 * @param n The integer up to which the sum is to be calculated.
 * @param acc The accumulator holding the intermediate result. Default is 0.
 * @return A `Trampoline` representing the computation.
 */
fun sumFirstNaturals(n: Int, acc: Int = 0): Trampoline = when {
    n == 0 -> Done(acc)
    else -> More { sumFirstNaturals(n - 1, acc + n) }
}

fun main() {
    val number = 10
    val trampoline = sumFirstNaturals(number)
    val result = runTrampoline(trampoline)
    println("Sum of first $number naturals = $result")
}
