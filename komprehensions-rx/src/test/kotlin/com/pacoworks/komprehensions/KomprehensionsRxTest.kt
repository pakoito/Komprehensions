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


package com.pacoworks.komprehensions

import org.junit.Assert
import org.junit.Test
import rx.Observable
import rx.observers.TestSubscriber

class KomprehensionsRxTest {

    @Test
    fun oneFM() {
        Assert.assertEquals(doFM(zero(1), one(true)).toBlocking().first(), true)
    }

    @Test
    fun twoFM() {
        Assert.assertEquals(doFM(zero(2), one(true), two("result")).toBlocking().first(), "result")
    }

    @Test
    fun threeFM() {
        Assert.assertEquals(doFM(zero(3), one(true), two("result"), three("other")).toBlocking().first(), "other")
    }

    @Test
    fun fourFM() {
        Assert.assertEquals(doFM(zero(4), one(true), two("result"), three("other"), four("other".length.toLong())).toBlocking().first(), "other".length)
    }

    @Test
    fun fiveFM() {
        Assert.assertEquals(doFM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5)).toBlocking().first(), false)
    }

    @Test
    fun sixFM() {
        Assert.assertEquals(doFM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false))).toBlocking().first(), "false")
    }

    @Test
    fun sevenFM() {
        Assert.assertEquals(doFM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true")).toBlocking().first(), false)
    }

    @Test
    fun eightFM() {
        Assert.assertEquals(doFM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java)).toBlocking().first(), Long::class.java)
    }

    @Test
    fun nineFM() {
        val observer: TestSubscriber<Any> = TestSubscriber.create()
        doFM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java), nine()).subscribe(observer)
        observer.awaitTerminalEvent()
        observer.assertCompleted()
        observer.assertNoErrors()
        observer.assertValues(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
    }

    @Test
    fun oneCM() {
        Assert.assertEquals(doCM(zero(1), one(true)).toBlocking().first(), true)
    }

    @Test
    fun twoCM() {
        Assert.assertEquals(doCM(zero(2), one(true), two("result")).toBlocking().first(), "result")
    }

    @Test
    fun threeCM() {
        Assert.assertEquals(doCM(zero(3), one(true), two("result"), three("other")).toBlocking().first(), "other")
    }

    @Test
    fun fourCM() {
        Assert.assertEquals(doCM(zero(4), one(true), two("result"), three("other"), four("other".length.toLong())).toBlocking().first(), "other".length)
    }

    @Test
    fun fiveCM() {
        Assert.assertEquals(doCM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5)).toBlocking().first(), false)
    }

    @Test
    fun sixCM() {
        Assert.assertEquals(doCM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false))).toBlocking().first(), "false")
    }

    @Test
    fun sevenCM() {
        Assert.assertEquals(doCM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true")).toBlocking().first(), false)
    }

    @Test
    fun eightCM() {
        Assert.assertEquals(doCM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java)).toBlocking().first(), Long::class.java)
    }

    @Test
    fun nineCM() {
        val observer: TestSubscriber<Any> = TestSubscriber.create()
        doCM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java), nine()).subscribe(observer)
        observer.awaitTerminalEvent()
        observer.assertCompleted()
        observer.assertNoErrors()
        observer.assertValues(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
    }

    @Test
    fun oneSM() {
        Assert.assertEquals(doSM(zero(1), one(true)).toBlocking().first(), true)
    }

    @Test
    fun twoSM() {
        Assert.assertEquals(doSM(zero(2), one(true), two("result")).toBlocking().first(), "result")
    }

    @Test
    fun threeSM() {
        Assert.assertEquals(doSM(zero(3), one(true), two("result"), three("other")).toBlocking().first(), "other")
    }

    @Test
    fun fourSM() {
        Assert.assertEquals(doSM(zero(4), one(true), two("result"), three("other"), four("other".length.toLong())).toBlocking().first(), "other".length)
    }

    @Test
    fun fiveSM() {
        Assert.assertEquals(doSM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5)).toBlocking().first(), false)
    }

    @Test
    fun sixSM() {
        Assert.assertEquals(doSM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false))).toBlocking().first(), "false")
    }

    @Test
    fun sevenSM() {
        Assert.assertEquals(doSM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true")).toBlocking().first(), false)
    }

    @Test
    fun eightSM() {
        Assert.assertEquals(doSM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java)).toBlocking().first(), Long::class.java)
    }

    @Test
    fun nineSM() {
        val observer: TestSubscriber<Any> = TestSubscriber.create()
        doSM(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java), nine()).subscribe(observer)
        observer.awaitTerminalEvent()
        observer.assertCompleted()
        observer.assertNoErrors()
        observer.assertValues(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
    }
}


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