package com.pacoworks.komprehensions

/**
 * Defines a type limitation for [doChainable] comprehensions
 */
interface Chainable

/**
 * Transforms one Chainable into another
 *
 * @param func transformation function
 * @return new chainable
 */
inline fun <T : Chainable, U: Chainable> T.andThen(func: (T) -> U): U = func(this)