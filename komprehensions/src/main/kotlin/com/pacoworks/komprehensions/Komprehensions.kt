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
fun <A, R> doL(
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
fun <A, B, R> doL(
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
fun <A, B, C, R> doL(
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
fun <A, B, C, D, R> doL(
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
fun <A, B, C, D, E, R> doL(
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
fun <A, B, C, D, E, F, R> doL(
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
fun <A, B, C, D, E, F, G, R> doL(
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
fun <A, B, C, D, E, F, G, H, R> doL(
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
fun <A, B, C, D, E, F, G, H, I, R> doL(
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
fun <A: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, C: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, G: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, G: Chainable, H: Chainable, R: Chainable> doCh(
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
fun <A: Chainable, B: Chainable, C: Chainable, D: Chainable, E: Chainable, F: Chainable, G: Chainable, H: Chainable, I: Chainable, R: Chainable> doCh(
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
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<R>): List<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<R>): List<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, C, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<C>,
        three: (A, B, C) -> List<R>): List<R> =
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
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, C, D, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<C>,
        three: (A, B, C) -> List<D>,
        four: (A, B, C, D) -> List<R>): List<R> =
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
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, C, D, E, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<C>,
        three: (A, B, C) -> List<D>,
        four: (A, B, C, D) -> List<E>,
        five: (A, B, C, D, E) -> List<R>): List<R> =
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
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, C, D, E, F, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<C>,
        three: (A, B, C) -> List<D>,
        four: (A, B, C, D) -> List<E>,
        five: (A, B, C, D, E) -> List<F>,
        six: (A, B, C, D, E, F) -> List<R>): List<R> =
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
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, C, D, E, F, G, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<C>,
        three: (A, B, C) -> List<D>,
        four: (A, B, C, D) -> List<E>,
        five: (A, B, C, D, E) -> List<F>,
        six: (A, B, C, D, E, F) -> List<G>,
        seven: (A, B, C, D, E, F, G) -> List<R>): List<R> =
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
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, C, D, E, F, G, H, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<C>,
        three: (A, B, C) -> List<D>,
        four: (A, B, C, D) -> List<E>,
        five: (A, B, C, D, E) -> List<F>,
        six: (A, B, C, D, E, F) -> List<G>,
        seven: (A, B, C, D, E, F, G) -> List<H>,
        eight: (A, B, C, D, E, F, G, H) -> List<R>): List<R> =
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
 * Composes an [List] from multiple creation functions chained by flatMap.
 *
 * @return list
 */
fun <A, B, C, D, E, F, G, H, I, R> doM(
        zero: () -> Iterable<A>,
        one: (A) -> List<B>,
        two: (A, B) -> List<C>,
        three: (A, B, C) -> List<D>,
        four: (A, B, C, D) -> List<E>,
        five: (A, B, C, D, E) -> List<F>,
        six: (A, B, C, D, E, F) -> List<G>,
        seven: (A, B, C, D, E, F, G) -> List<H>,
        eight: (A, B, C, D, E, F, G, H) -> List<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> List<R>): List<R> =
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