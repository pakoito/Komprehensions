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

@file:JvmName("KomprehensionsRx")

package com.pacoworks.komprehensions.rx2

import io.reactivex.Observable
import io.reactivex.ObservableTransformer

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doFM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doCM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<R>): Observable<R> =
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
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doSM(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Observable<R>): Observable<R> =
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

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, R>): Observable<R> =
        zero()
                .compose(one)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, G>,
        seven: ObservableTransformer<G, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, G>,
        seven: ObservableTransformer<G, H>,
        eight: ObservableTransformer<H, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)
                .compose(eight)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doCo(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, G>,
        seven: ObservableTransformer<G, H>,
        eight: ObservableTransformer<H, I>,
        nine: ObservableTransformer<I, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)
                .compose(eight)
                .compose(nine)