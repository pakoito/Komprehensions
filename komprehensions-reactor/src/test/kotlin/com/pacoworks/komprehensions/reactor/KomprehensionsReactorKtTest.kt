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

package com.pacoworks.komprehensions.reactor

import org.junit.Assert
import org.junit.Test
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.test.StepVerifier
import reactor.test.test

class KomprehensionsReactorKtTest {

    @Test
    fun oneFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(1), oneFlux(true)).blockFirst(), true)
    }

    @Test
    fun twoFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(2), oneFlux(true), twoFlux("result")).blockFirst(), "result")
    }

    @Test
    fun threeFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(3), oneFlux(true), twoFlux("result"), threeFlux("other")).blockFirst(), "other")
    }

    @Test
    fun fourFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(4), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong())).blockFirst(), "other".length.toLong())
    }

    @Test
    fun fiveFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5)).blockFirst(), false)
    }

    @Test
    fun sixFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false))).blockFirst(), "false")
    }

    @Test
    fun sevenFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true")).blockFirst(), false)
    }

    @Test
    fun eightFM() {
        Assert.assertEquals(doFlatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true"), eightFlux(Long::class.java)).blockFirst(), Long::class.java)
    }

    @Test
    fun nineFM() {
        val firstStep: StepVerifier.FirstStep<Any> = doFlatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true"), eightFlux(Long::class.java), nineFlux()).test()
        firstStep.expectNext(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
        firstStep.verifyComplete()
    }

    @Test
    fun oneCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(1), oneFlux(true)).blockFirst(), true)
    }

    @Test
    fun twoCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(2), oneFlux(true), twoFlux("result")).blockFirst(), "result")
    }

    @Test
    fun threeCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(3), oneFlux(true), twoFlux("result"), threeFlux("other")).blockFirst(), "other")
    }

    @Test
    fun fourCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(4), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong())).blockFirst(), "other".length.toLong())
    }

    @Test
    fun fiveCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5)).blockFirst(), false)
    }

    @Test
    fun sixCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false))).blockFirst(), "false")
    }

    @Test
    fun sevenCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true")).blockFirst(), false)
    }

    @Test
    fun eightCM() {
        Assert.assertEquals(doConcatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true"), eightFlux(Long::class.java)).blockFirst(), Long::class.java)
    }

    @Test
    fun nineCM() {
        val firstStep: StepVerifier.FirstStep<Any> = doConcatMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true"), eightFlux(Long::class.java), nineFlux()).test()
        firstStep.expectNext(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
        firstStep.verifyComplete()
    }

    @Test
    fun oneSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(1), oneFlux(true)).blockFirst(), true)
    }

    @Test
    fun twoSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(2), oneFlux(true), twoFlux("result")).blockFirst(), "result")
    }

    @Test
    fun threeSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(3), oneFlux(true), twoFlux("result"), threeFlux("other")).blockFirst(), "other")
    }

    @Test
    fun fourSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(4), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong())).blockFirst(), "other".length.toLong())
    }

    @Test
    fun fiveSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5)).blockFirst(), false)
    }

    @Test
    fun sixSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false))).blockFirst(), "false")
    }

    @Test
    fun sevenSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true")).blockFirst(), false)
    }

    @Test
    fun eightSM() {
        Assert.assertEquals(doSwitchMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true"), eightFlux(Long::class.java)).blockFirst(), Long::class.java)
    }

    @Test
    fun nineSM() {
        val firstStep: StepVerifier.FirstStep<Any> = doSwitchMap(zeroFlux(1), oneFlux(true), twoFlux("result"), threeFlux("other"), fourFlux("other".length.toLong()), fiveFlux("other".length < 5), sixFlux(java.lang.Boolean.toString(false)), sevenFlux("true"), eightFlux(Long::class.java), nineFlux()).test()
        firstStep.expectNext(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java)
        firstStep.verifyComplete()
    }

    @Test
    fun oneMonoFM() {
        doFlatMap(zeroMono(1), oneMono(true)).test()
                .expectNext(true)
                .verifyComplete()
    }

    @Test
    fun twoMonoFM() {
        doFlatMap(zeroMono(2), oneMono(true), twoMono("result")).test()
                .expectNext("result")
                .verifyComplete()
    }

    @Test
    fun threeMonoFM() {
        doFlatMap(zeroMono(3), oneMono(true), twoMono("result"), threeMono("other")).test()
                .expectNext("other")
                .verifyComplete()
    }

    @Test
    fun fourMonoFM() {
        doFlatMap(zeroMono(4), oneMono(true), twoMono("result"), threeMono("other"), fourMono("other".length.toLong())).test()
                .expectNext("other".length.toLong())
                .verifyComplete()
    }

    @Test
    fun fiveMonoFM() {
        doFlatMap(zeroMono(1), oneMono(true), twoMono("result"), threeMono("other"), fourMono("other".length.toLong()), fiveMono("other".length < 5)).test()
                .expectNext(false)
                .verifyComplete()
    }

    @Test
    fun sixMonoFM() {
        doFlatMap(zeroMono(1), oneMono(true), twoMono("result"), threeMono("other"), fourMono("other".length.toLong()), fiveMono("other".length < 5), sixMono(java.lang.Boolean.toString(false))).test()
                .expectNext("false")
                .verifyComplete()
    }

    @Test
    fun sevenMonoFM() {
        doFlatMap(zeroMono(1), oneMono(true), twoMono("result"), threeMono("other"), fourMono("other".length.toLong()), fiveMono("other".length < 5), sixMono(java.lang.Boolean.toString(false)), sevenMono("true")).test()
                .expectNext(false)
                .verifyComplete()
    }

    @Test
    fun eightMonoFM() {
        doFlatMap(zeroMono(1), oneMono(true), twoMono("result"), threeMono("other"), fourMono("other".length.toLong()), fiveMono("other".length < 5), sixMono(java.lang.Boolean.toString(false)), sevenMono("true"), eightMono(Long::class.java)).test()
                .expectNext(Long::class.java)
                .verifyComplete()
    }
}

// region Helpers

private fun zeroFlux(i: Int): () -> Flux<Int> = {
    Flux.just(i)
}

private fun oneFlux(value: Boolean): (Int) -> Flux<Boolean> = {
    integer: Int ->
    Flux.just(value)
}

private fun twoFlux(value: String): (Int, Boolean) -> Flux<String> = {
    integer: Int, aBoolean: Boolean ->
    Flux.just(value)
}

private fun threeFlux(other: String): (Int, Boolean, String) -> Flux<String> = {
    integer: Int, aBoolean: Boolean, s: String ->
    Flux.just(other)
}

private fun fourFlux(length: Long): (Int, Boolean, String, String) -> Flux<Long> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String ->
    Flux.just(length)
}

private fun fiveFlux(b: Boolean): (Int, Boolean, String, String, Long) -> Flux<Boolean> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long ->
    Flux.just(b)
}

private fun sixFlux(string: String): (Int, Boolean, String, String, Long, Boolean) -> Flux<String> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean ->
    Flux.just(string)
}

private fun sevenFlux(parameter: String): (Int, Boolean, String, String, Long, Boolean, String) -> Flux<Boolean> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String ->
    Flux.just(!java.lang.Boolean.valueOf(parameter))
}

private fun <T> eightFlux(item: Class<T>): (Int, Boolean, String, String, Long, Boolean, String, Boolean) -> Flux<Any> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String, aBoolean3: Boolean ->
    Flux.just(item)
}

private fun nineFlux(): (Int, Boolean, String, String, Long, Boolean, String, Boolean, Any) -> Flux<Any> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String, aBoolean3: Boolean, o: Any ->
    Flux.just(integer, aBoolean, s, s2, aLong, aBoolean2, s3, aBoolean3, o)
}

private fun zeroMono(i: Int): () -> Mono<Int> = {
    Mono.just(i)
}

private fun oneMono(value: Boolean): (Int) -> Mono<Boolean> = {
    integer: Int ->
    Mono.just(value)
}

private fun twoMono(value: String): (Int, Boolean) -> Mono<String> = {
    integer: Int, aBoolean: Boolean ->
    Mono.just(value)
}

private fun threeMono(other: String): (Int, Boolean, String) -> Mono<String> = {
    integer: Int, aBoolean: Boolean, s: String ->
    Mono.just(other)
}

private fun fourMono(length: Long): (Int, Boolean, String, String) -> Mono<Long> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String ->
    Mono.just(length)
}

private fun fiveMono(b: Boolean): (Int, Boolean, String, String, Long) -> Mono<Boolean> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long ->
    Mono.just(b)
}

private fun sixMono(string: String): (Int, Boolean, String, String, Long, Boolean) -> Mono<String> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean ->
    Mono.just(string)
}

private fun sevenMono(parameter: String): (Int, Boolean, String, String, Long, Boolean, String) -> Mono<Boolean> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String ->
    Mono.just(!java.lang.Boolean.valueOf(parameter))
}

private fun <T> eightMono(item: Class<T>): (Int, Boolean, String, String, Long, Boolean, String, Boolean) -> Mono<Any> = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String, aBoolean3: Boolean ->
    Mono.just(item)
}

// endregion