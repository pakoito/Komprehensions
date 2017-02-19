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

import com.pacoworks.komprehensions.Chain.*
import org.junit.Assert
import org.junit.Test

class KomprehensionsTest {

    @Test
    fun oneL() {
        Assert.assertEquals(doL(zero(1), one(true)), true)
    }

    @Test
    fun twoL() {
        Assert.assertEquals(doL(zero(2), one(true), two("result")), "result")
    }

    @Test
    fun threeL() {
        Assert.assertEquals(doL(zero(3), one(true), two("result"), three("other")), "other")
    }

    @Test
    fun fourL() {
        Assert.assertEquals(doL(zero(4), one(true), two("result"), three("other"), four("other".length.toLong())), "other".length)
    }

    @Test
    fun fiveL() {
        Assert.assertEquals(doL(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5)), false)
    }

    @Test
    fun sixL() {
        Assert.assertEquals(doL(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false))), "false")
    }

    @Test
    fun sevenL() {
        Assert.assertEquals(doL(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true")), false)
    }

    @Test
    fun eightL() {
        Assert.assertEquals(doL(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java)), Long::class.java)
    }

    @Test
    fun nineL() {
        val value = doL(zero(1), one(true), two("result"), three("other"), four("other".length.toLong()), five("other".length < 5), six(java.lang.Boolean.toString(false)), seven("true"), eight(Long::class.java), nine())
        Assert.assertEquals(value, listOf(1, true, "result", "other", "other".length.toLong(), "other".length < 5, java.lang.Boolean.toString(false), false, Long::class.java))
    }

    @Test
    fun twoCh() {
        val value = doCh({ One }, { Two })
        Assert.assertEquals(Two, value)
    }

    @Test
    fun threeCh() {
        val value = doCh({ One }, { Two }, { one, two -> Three })
        Assert.assertEquals(Three, value)
    }

    @Test
    fun fourCh() {
        val value = doCh({ One }, { Two }, { one, two -> Three }, { one, two, three -> Four })
        Assert.assertEquals(Four, value)
    }

    @Test
    fun fiveCh() {
        val value = doCh({ One }, { Two }, { one, two -> Three }, { one, two, three -> Four }, { one, two, three, four -> Five })
        Assert.assertEquals(Five, value)
    }

    @Test
    fun sixCh() {
        val value = doCh({ One }, { Two }, { one, two -> Three }, { one, two, three -> Four }, { one, two, three, four -> Five }, { one, two, three, four, five -> Six })
        Assert.assertEquals(Six, value)
    }

    @Test
    fun sevenCh() {
        val value = doCh({ One }, { Two }, { one, two -> Three }, { one, two, three -> Four }, { one, two, three, four -> Five }, { one, two, three, four, five -> Six }, { one, two, three, four, five, six -> Seven })
        Assert.assertEquals(Seven, value)
    }

    @Test
    fun eightCh() {
        val value = doCh({ One }, { Two }, { one, two -> Three }, { one, two, three -> Four }, { one, two, three, four -> Five }, { one, two, three, four, five -> Six }, { one, two, three, four, five, six -> Seven }, { one, two, three, four, five, six, seven -> Eight })
        Assert.assertEquals(Eight, value)
    }

    @Test
    fun nineCh() {
        val value = doCh({ One }, { Two }, { one, two -> Three }, { one, two, three -> Four }, { one, two, three, four -> Five }, { one, two, three, four, five -> Six }, { one, two, three, four, five, six -> Seven }, { one, two, three, four, five, six, seven -> Eight }, { one, two, three, four, five, six, seven, eight -> Nine })
        Assert.assertEquals(Nine, value)
    }
}

private fun zero(i: Int): () -> Int = { i }

private fun one(value: Boolean): (Int) -> Boolean = { integer: Int -> value }

private fun two(value: String): (Int, Boolean) -> String = {
    integer: Int, aBoolean: Boolean ->
    value
}

private fun three(other: String): (Int, Boolean, String) -> String = {
    integer: Int, aBoolean: Boolean, s: String ->
    other
}

private fun four(length: Long): (Int, Boolean, String, String) -> Long = {
    integer: Int, aBoolean: Boolean, s: String, s2: String ->
    length
}

private fun five(b: Boolean): (Int, Boolean, String, String, Long) -> Boolean = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long ->
    b
}

private fun six(string: String): (Int, Boolean, String, String, Long, Boolean) -> String = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean ->
    string
}

private fun seven(parameter: String): (Int, Boolean, String, String, Long, Boolean, String) -> Boolean = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String ->
    !java.lang.Boolean.valueOf(parameter)
}

private fun <T> eight(item: Class<T>): (Int, Boolean, String, String, Long, Boolean, String, Boolean) -> Any = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String, aBoolean3: Boolean ->
    item
}

private fun nine(): (Int, Boolean, String, String, Long, Boolean, String, Boolean, Any) -> Any = {
    integer: Int, aBoolean: Boolean, s: String, s2: String, aLong: Long, aBoolean2: Boolean, s3: String, aBoolean3: Boolean, o: Any ->
    listOf(integer, aBoolean, s, s2, aLong, aBoolean2, s3, aBoolean3, o)
}

sealed class Chain: Chainable {
    object One : Chain()
    object Two : Chain()
    object Three : Chain()
    object Four : Chain()
    object Five : Chain()
    object Six : Chain()
    object Seven : Chain()
    object Eight : Chain()
    object Nine : Chain()
}