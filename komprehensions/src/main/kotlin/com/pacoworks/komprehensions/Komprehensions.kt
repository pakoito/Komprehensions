/*
 * Copyright (c) pakoito 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:JvmName("Komprehensions")

package com.pacoworks.komprehensions

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, R> doLet(
        zero: () -> A,
        one: (A) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, C, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                                        .let { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, C, D, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                                        .let { c ->
                                            three.invoke(a, b, c)
                                                    .let { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, C, D, E, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                                        .let { c ->
                                            three.invoke(a, b, c)
                                                    .let { d ->
                                                        four.invoke(a, b, c, d)
                                                                .let { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, C, D, E, F, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                                        .let { c ->
                                            three.invoke(a, b, c)
                                                    .let { d ->
                                                        four.invoke(a, b, c, d)
                                                                .let { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .let { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, C, D, E, F, G, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> G,
        seven: (A, B, C, D, E, F, G) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                                        .let { c ->
                                            three.invoke(a, b, c)
                                                    .let { d ->
                                                        four.invoke(a, b, c, d)
                                                                .let { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .let { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .let { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, C, D, E, F, G, H, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> G,
        seven: (A, B, C, D, E, F, G) -> H,
        eight: (A, B, C, D, E, F, G, H) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                                        .let { c ->
                                            three.invoke(a, b, c)
                                                    .let { d ->
                                                        four.invoke(a, b, c, d)
                                                                .let { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .let { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .let { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .let { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes a sequence from multiple creation functions chained by let.
 *
 * @return chain
 */
fun <A, B, C, D, E, F, G, H, I, R> doLet(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> G,
        seven: (A, B, C, D, E, F, G) -> H,
        eight: (A, B, C, D, E, F, G, H) -> I,
        nine: (A, B, C, D, E, F, G, H, I) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                            .let { b ->
                                two.invoke(a, b)
                                        .let { c ->
                                            three.invoke(a, b, c)
                                                    .let { d ->
                                                        four.invoke(a, b, c, d)
                                                                .let { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .let { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .let { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .let { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .let { i ->
                                                                                                                    nine.invoke(a, b, c, d, e, f, g, h, i)
                                                                                                                }
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, C: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                                        .andThen { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                                        .andThen { c ->
                                            three.invoke(a, b, c)
                                                    .andThen { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                                        .andThen { c ->
                                            three.invoke(a, b, c)
                                                    .andThen { d ->
                                                        four.invoke(a, b, c, d)
                                                                .andThen { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                                        .andThen { c ->
                                            three.invoke(a, b, c)
                                                    .andThen { d ->
                                                        four.invoke(a, b, c, d)
                                                                .andThen { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .andThen { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, G: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> G,
        seven: (A, B, C, D, E, F, G) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                                        .andThen { c ->
                                            three.invoke(a, b, c)
                                                    .andThen { d ->
                                                        four.invoke(a, b, c, d)
                                                                .andThen { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .andThen { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .andThen { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, G: Chainable, H: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> G,
        seven: (A, B, C, D, E, F, G) -> H,
        eight: (A, B, C, D, E, F, G, H) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                                        .andThen { c ->
                                            three.invoke(a, b, c)
                                                    .andThen { d ->
                                                        four.invoke(a, b, c, d)
                                                                .andThen { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .andThen { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .andThen { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .andThen { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an sequence from multiple creation functions chained by andThen.
 *
 * @return chain
 */
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, G: Chainable, H: Chainable, I: Chainable, R: Chainable> doChainable(
        zero: () -> A,
        one: (A) -> B,
        two: (A, B) -> C,
        three: (A, B, C) -> D,
        four: (A, B, C, D) -> E,
        five: (A, B, C, D, E) -> F,
        six: (A, B, C, D, E, F) -> G,
        seven: (A, B, C, D, E, F, G) -> H,
        eight: (A, B, C, D, E, F, G, H) -> I,
        nine: (A, B, C, D, E, F, G, H, I) -> R): R =
        zero.invoke()
                .andThen { a ->
                    one.invoke(a)
                            .andThen { b ->
                                two.invoke(a, b)
                                        .andThen { c ->
                                            three.invoke(a, b, c)
                                                    .andThen { d ->
                                                        four.invoke(a, b, c, d)
                                                                .andThen { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .andThen { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .andThen { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .andThen { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .andThen { i ->
                                                                                                                    nine.invoke(a, b, c, d, e, f, g, h, i)
                                                                                                                }
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, C, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<C>,
        three: (A, B, C) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, C, D, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<C>,
        three: (A, B, C) -> Iterable<D>,
        four: (A, B, C, D) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, C, D, E, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<C>,
        three: (A, B, C) -> Iterable<D>,
        four: (A, B, C, D) -> Iterable<E>,
        five: (A, B, C, D, E) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, C, D, E, F, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<C>,
        three: (A, B, C) -> Iterable<D>,
        four: (A, B, C, D) -> Iterable<E>,
        five: (A, B, C, D, E) -> Iterable<F>,
        six: (A, B, C, D, E, F) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, C, D, E, F, G, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<C>,
        three: (A, B, C) -> Iterable<D>,
        four: (A, B, C, D) -> Iterable<E>,
        five: (A, B, C, D, E) -> Iterable<F>,
        six: (A, B, C, D, E, F) -> Iterable<G>,
        seven: (A, B, C, D, E, F, G) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, C, D, E, F, G, H, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<C>,
        three: (A, B, C) -> Iterable<D>,
        four: (A, B, C, D) -> Iterable<E>,
        five: (A, B, C, D, E) -> Iterable<F>,
        six: (A, B, C, D, E, F) -> Iterable<G>,
        seven: (A, B, C, D, E, F, G) -> Iterable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .flatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple creation functions chained by flatMap.
 *
 * @return iterable
 */
fun <A, B, C, D, E, F, G, H, I, R> doFlatMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> Iterable<B>,
        two: (A, B) -> Iterable<C>,
        three: (A, B, C) -> Iterable<D>,
        four: (A, B, C, D) -> Iterable<E>,
        five: (A, B, C, D, E) -> Iterable<F>,
        six: (A, B, C, D, E, F) -> Iterable<G>,
        seven: (A, B, C, D, E, F, G) -> Iterable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Iterable<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Iterable<R>): Iterable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .flatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .flatMap { i ->
                                                                                                                    nine.invoke(a, b, c, d, e, f, g, h, i)
                                                                                                                }
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> R): Iterable<R> =
        zero()
                .map(one)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, C, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> C,
        three: (C) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)
                .map(three)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> C,
        three: (C) -> D,
        four: (D) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)
                .map(three)
                .map(four)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> C,
        three: (C) -> D,
        four: (D) -> E,
        five: (E) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)
                .map(three)
                .map(four)
                .map(five)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> C,
        three: (C) -> D,
        four: (D) -> E,
        five: (E) -> F,
        six: (F) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)
                .map(three)
                .map(four)
                .map(five)
                .map(six)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> C,
        three: (C) -> D,
        four: (D) -> E,
        five: (E) -> F,
        six: (F) -> G,
        seven: (G) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)
                .map(three)
                .map(four)
                .map(five)
                .map(six)
                .map(seven)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> C,
        three: (C) -> D,
        four: (D) -> E,
        five: (E) -> F,
        six: (F) -> G,
        seven: (G) -> H,
        eight: (H) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)
                .map(three)
                .map(four)
                .map(five)
                .map(six)
                .map(seven)
                .map(eight)

/**
 * Composes an [Iterable] from multiple functions chained by [Iterable.map]
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doMapIterator(
        zero: () -> Iterable<A>,
        one: (A) -> B,
        two: (B) -> C,
        three: (C) -> D,
        four: (D) -> E,
        five: (E) -> F,
        six: (F) -> G,
        seven: (G) -> H,
        eight: (H) -> I,
        nine: (I) -> R): Iterable<R> =
        zero()
                .map(one)
                .map(two)
                .map(three)
                .map(four)
                .map(five)
                .map(six)
                .map(seven)
                .map(eight)
                .map(nine)