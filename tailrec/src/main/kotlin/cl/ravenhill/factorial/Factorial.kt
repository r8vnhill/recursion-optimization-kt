package cl.ravenhill.factorial

/**
 * Calculates the factorial of a given number using a tail-recursive approach.
 *
 * ## Usage:
 * This function calculates the factorial of a given non-negative integer using tail recursion. It provides an optional
 * accumulator parameter to hold the intermediate result.
 *
 * ### Example 1: Calculating Factorial of 5
 * ```
 * val result = factorial(5)
 * println(result) // Output: 120
 * ```
 *
 * ### Example 2: Calculating Factorial of 0
 * ```
 * val result = factorial(0)
 * println(result) // Output: 1
 * ```
 *
 * @param n The non-negative integer whose factorial is to be calculated.
 * @param acc The accumulator holding the intermediate result. Default is 1.
 * @return The factorial of the given number.
 */
tailrec fun factorial(n: Int, acc: Int = 1): Int =
    if (n == 0) acc else factorial(n - 1, acc * n)

fun main() {
    val number = 5
    val result = factorial(number)
    println("Factorial of $number = $result")
}