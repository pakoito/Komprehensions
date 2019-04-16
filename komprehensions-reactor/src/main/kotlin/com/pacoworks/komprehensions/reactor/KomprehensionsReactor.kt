/*
 * Copyright (c) pakoito 2017
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

@file:JvmName("KomprehensionsReactor")

package com.pacoworks.komprehensions.reactor

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<R>): Flux<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<R>): Flux<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<R>): Flux<R> =
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<R>): Flux<R> =
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<R>): Flux<R> =
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<R>): Flux<R> =
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<R>): Flux<R> =
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, H, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<H>,
        eight: (A, B, C, D, E, F, G, H) -> Flux<R>): Flux<R> =
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.flatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, H, I, R> doFlatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<H>,
        eight: (A, B, C, D, E, F, G, H) -> Flux<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Flux<R>): Flux<R> =
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .concatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, H, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<H>,
        eight: (A, B, C, D, E, F, G, H) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .concatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .concatMap { h ->
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.concatMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, H, I, R> doConcatMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<H>,
        eight: (A, B, C, D, E, F, G, H) -> Flux<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Flux<R>): Flux<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .concatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .concatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .concatMap { i ->
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, C, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .switchMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, H, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<H>,
        eight: (A, B, C, D, E, F, G, H) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .switchMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .switchMap { h ->
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
 * Composes an [reactor.core.publisher.Flux] from multiple creation functions chained by [reactor.core.publisher.Flux.switchMap].
 *
 * @return composed Flux
 */
fun <A, B, C, D, E, F, G, H, I, R> doSwitchMap(
        zero: () -> Flux<A>,
        one: (A) -> Flux<B>,
        two: (A, B) -> Flux<C>,
        three: (A, B, C) -> Flux<D>,
        four: (A, B, C, D) -> Flux<E>,
        five: (A, B, C, D, E) -> Flux<F>,
        six: (A, B, C, D, E, F) -> Flux<G>,
        seven: (A, B, C, D, E, F, G) -> Flux<H>,
        eight: (A, B, C, D, E, F, G, H) -> Flux<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Flux<R>): Flux<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .switchMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .switchMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .switchMap { i ->
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


/*** Mono Operators ***/

/**
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<R>): Mono<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<R>): Mono<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, C, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<C>,
        three: (A, B, C) -> Mono<R>): Mono<R> =
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
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, C, D, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<C>,
        three: (A, B, C) -> Mono<D>,
        four: (A, B, C, D) -> Mono<R>): Mono<R> =
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
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, C, D, E, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<C>,
        three: (A, B, C) -> Mono<D>,
        four: (A, B, C, D) -> Mono<E>,
        five: (A, B, C, D, E) -> Mono<R>): Mono<R> =
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
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, C, D, E, F, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<C>,
        three: (A, B, C) -> Mono<D>,
        four: (A, B, C, D) -> Mono<E>,
        five: (A, B, C, D, E) -> Mono<F>,
        six: (A, B, C, D, E, F) -> Mono<R>): Mono<R> =
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
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, C, D, E, F, G, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<C>,
        three: (A, B, C) -> Mono<D>,
        four: (A, B, C, D) -> Mono<E>,
        five: (A, B, C, D, E) -> Mono<F>,
        six: (A, B, C, D, E, F) -> Mono<G>,
        seven: (A, B, C, D, E, F, G) -> Mono<R>): Mono<R> =
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
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, C, D, E, F, G, H, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<C>,
        three: (A, B, C) -> Mono<D>,
        four: (A, B, C, D) -> Mono<E>,
        five: (A, B, C, D, E) -> Mono<F>,
        six: (A, B, C, D, E, F) -> Mono<G>,
        seven: (A, B, C, D, E, F, G) -> Mono<H>,
        eight: (A, B, C, D, E, F, G, H) -> Mono<R>): Mono<R> =
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
 * Composes an [reactor.core.publisher.Mono] from multiple creation functions chained by [reactor.core.publisher.Mono.flatMap].
 *
 * @return composed Mono
 */
fun <A, B, C, D, E, F, G, H, I, R> doFlatMapMono(
        zero: () -> Mono<A>,
        one: (A) -> Mono<B>,
        two: (A, B) -> Mono<C>,
        three: (A, B, C) -> Mono<D>,
        four: (A, B, C, D) -> Mono<E>,
        five: (A, B, C, D, E) -> Mono<F>,
        six: (A, B, C, D, E, F) -> Mono<G>,
        seven: (A, B, C, D, E, F, G) -> Mono<H>,
        eight: (A, B, C, D, E, F, G, H) -> Mono<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Mono<R>): Mono<R> =
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