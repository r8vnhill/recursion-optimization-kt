package cl.ravenhill.trampoline

/**
 * Sealed interface representing a trampoline for managing tail-recursive computations.
 *
 * ## Usage:
 * The `Trampoline` interface is used to represent the result of a tail-recursive computation. It has two
 * implementations: `Done` and `More`.
 *
 * @see Done
 * @see More
 */
sealed interface Trampoline
