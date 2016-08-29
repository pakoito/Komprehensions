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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
 */
fun <A, R> doL(
        zero: () -> A,
        one: (A) -> R): R =
        zero.invoke()
                .let { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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
 * Composes an [rx.Observable] from multiple creation functions chained by let.
 *
 * @composed Observable
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