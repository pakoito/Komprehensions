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