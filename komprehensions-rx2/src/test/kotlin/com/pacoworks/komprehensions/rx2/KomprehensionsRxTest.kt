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

package com.pacoworks.komprehensions.rx2

import io.reactivex.Observable
import io.reactivex.ObservableTransformer
import io.reactivex.observers.TestObserver
import org.junit.Assert
import org.junit.Test

class KomprehensionsRxTest {

    @Test
    fun oneFM() {
        Assert.assertEquals(doFlatMap(zero(1), one(true)).blockingFirst(), true)
    }

    @Test
    fun twoFM() {
        Assert.assertEquals(doFlatMap(zero(2), one(true), two("result")).blockingFirst(), "result")
    }

    @Test
    fun threeFM() {
        Assert.assertEquals(doFlatMap(zero(3), one(true), two("result"), three("other")).blockingFirst(), "other")
    }

    @Test
    fun fourFM() {
        Assert.assertEquals(doFlatMap(zero(4), one(true), two("result"), three("other"), four("other".length.toLong())).blockingFirst(), "other".length.toLong())
    }

    @Test
    fun fiveFM() {
        Assert.assertEquals(doFlatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5)).blockingFirst(), false)
    }

    @Test
    fun sixFM() {
        Assert.assertEquals(doFlatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false))).blockingFirst(), "false")
    }

    @Test
    fun sevenFM() {
        Assert.assertEquals(doFlatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true")).blockingFirst(), false)
    }

    @Test
    fun eightFM() {
        Assert.assertEquals(doFlatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java)).blockingFirst(), Long::class.java)
    }

    @Test
    fun nineFM() {
        val observer: TestObserver<Any> = doFlatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java), nine()).test()
        observer.awaitTerminalEvent()
        observer.assertComplete()
        observer.assertNoErrors()
        observer.assertValues(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
    }

    @Test
    fun oneCM() {
        Assert.assertEquals(doConcatMap(zero(1), one(true)).blockingFirst(), true)
    }

    @Test
    fun twoCM() {
        Assert.assertEquals(doConcatMap(zero(2), one(true), two("result")).blockingFirst(), "result")
    }

    @Test
    fun threeCM() {
        Assert.assertEquals(doConcatMap(zero(3), one(true), two("result"), three("other")).blockingFirst(), "other")
    }

    @Test
    fun fourCM() {
        Assert.assertEquals(doConcatMap(zero(4), one(true), two("result"), three("other"), four("other".length.toLong())).blockingFirst(), "other".length.toLong())
    }

    @Test
    fun fiveCM() {
        Assert.assertEquals(doConcatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5)).blockingFirst(), false)
    }

    @Test
    fun sixCM() {
        Assert.assertEquals(doConcatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false))).blockingFirst(), "false")
    }

    @Test
    fun sevenCM() {
        Assert.assertEquals(doConcatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true")).blockingFirst(), false)
    }

    @Test
    fun eightCM() {
        Assert.assertEquals(doConcatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java)).blockingFirst(), Long::class.java)
    }

    @Test
    fun nineCM() {
        val observer: TestObserver<Any> = doConcatMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java), nine()).test()
        observer.awaitTerminalEvent()
        observer.assertComplete()
        observer.assertNoErrors()
        observer.assertValues(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
    }

    @Test
    fun oneSM() {
        Assert.assertEquals(doSwitchMap(zero(1), one(true)).blockingFirst(), true)
    }

    @Test
    fun twoSM() {
        Assert.assertEquals(doSwitchMap(zero(2), one(true), two("result")).blockingFirst(), "result")
    }

    @Test
    fun threeSM() {
        Assert.assertEquals(doSwitchMap(zero(3), one(true), two("result"), three("other")).blockingFirst(), "other")
    }

    @Test
    fun fourSM() {
        Assert.assertEquals(doSwitchMap(zero(4), one(true), two("result"), three("other"), four("other".length.toLong())).blockingFirst(), "other".length.toLong())
    }

    @Test
    fun fiveSM() {
        Assert.assertEquals(doSwitchMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5)).blockingFirst(), false)
    }

    @Test
    fun sixSM() {
        Assert.assertEquals(doSwitchMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false))).blockingFirst(), "false")
    }

    @Test
    fun sevenSM() {
        Assert.assertEquals(doSwitchMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true")).blockingFirst(), false)
    }

    @Test
    fun eightSM() {
        Assert.assertEquals(doSwitchMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java)).blockingFirst(), Long::class.java)
    }

    @Test
    fun nineSM() {
        val observer: TestObserver<Any> = doSwitchMap(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java), nine()).test()
        observer.awaitTerminalEvent()
        observer.assertComplete()
        observer.assertNoErrors()
        observer.assertValues(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
    }

    @Test
    fun oneCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString()).blockingFirst(), "1")
    }

    @Test
    fun twoCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt()).blockingFirst().toLong(), 1)
    }

    @Test
    fun threeCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt(), intIncrementToString()).blockingFirst(), "2")
    }

    @Test
    fun fourCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt()).blockingFirst().toLong(), 2)
    }

    @Test
    fun fiveCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString()).blockingFirst(), "3")
    }

    @Test
    fun sixCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt()).blockingFirst().toLong(), 3)
    }

    @Test
    fun sevenCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString()).blockingFirst(), "4")
    }

    @Test
    fun eightCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt()).blockingFirst().toLong(), 4)
    }

    @Test
    fun nineCo() {
        Assert.assertEquals(doCompose(zero(0), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString(), stringToInt(), intIncrementToString()).blockingFirst(), "5")
    }
}

// region Helpers

private fun zero(i: Int): () -> Observable<Int> = {
    Observable.just(i)
}

private fun one(value: Boolean): (Int) -> Observable<Boolean> = {
    integer: Int ->
    Observable.just(value)
}

private fun two(value: String): (Int, Boolean) -> Observable<String> = {
    integer: Int, aBoolean: Boolean ->
    Observable.just(value)
}

private fun three(other: String): (Int, Boolean, String) -> Observable<String> = {
    integer: Int, aBoolean: Boolean, s: String ->
    Observable.just(other)
}

private fun four(length: Long): (Int, Boolean, String, String) -> Observable<Long> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String ->
    Observable.just(length)
}

private fun five(b: Boolean): (Int, Boolean, String, String, Long) -> Observable<Boolean> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long ->
    Observable.just(b)
}

private fun six(string: String): (Int, Boolean, String, String, Long, Boolean) -> Observable<String> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean ->
    Observable.just(string)
}

private fun seven(parameter: String): (Int, Boolean, String, String, Long, Boolean, String) -> Observable<Boolean> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String ->
    Observable.just(!java.lang.Boolean.valueOf(parameter))
}

private fun <T> eight(item: Class<T>): (Int, Boolean, String, String, Long, Boolean, String, Boolean) -> Observable<Any> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String, aBoolean3: Boolean ->
    Observable.just(item)
}

private fun nine(): (Int, Boolean, String, String, Long, Boolean, String, Boolean, Any) -> Observable<Any> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String, aBoolean3: Boolean, o: Any ->
    Observable.just(integer, aBoolean, s, s2, aLong, aBoolean2, s3, aBoolean3, o)
}

private fun intIncrementToString(): ObservableTransformer<Int, String> =
        ObservableTransformer { integerObservable -> integerObservable.map { integer -> Integer.toString(integer + 1) } }

private fun stringToInt(): ObservableTransformer<String, Int> =
        ObservableTransformer { stringObservable -> stringObservable.map { s -> Integer.parseInt(s) } }

// endregion