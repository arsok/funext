package com.qbutton.util

import org.junit.jupiter.api.Test

const val TEST_VALUE = "test"

class UtilTest {

    @Test
    fun eqReference() {
        val firstObject = Any()
        val secondObject = firstObject

        assert(firstObject eq secondObject)
    }

    @Test
    fun eqContent() {
        val firstList = listOf(TEST_VALUE)
        val secondList = MutableList(1) { TEST_VALUE }

        assert(firstList eq secondList)
    }

    @Test
    fun eqNulls() {
        val first: String? = null
        val second: StringBuilder? = null

        assert(first eq second)
    }

    @Test
    fun neqNullAndObject() {
        val first: String? = null
        val second = TEST_VALUE

        assert(first neq second)
    }
}