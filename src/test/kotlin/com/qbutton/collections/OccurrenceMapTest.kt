package com.qbutton.collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OccurrenceMapTest {

    private val apple = "apple"
    private val orange = "orange"
    private val milk = "milk"

    @Test
    fun occurrenceMapFromArrayOfStrings() {
        val cart = arrayOf(apple, apple, orange, milk)

        val expected = mapOf(apple to 2, orange to 1, milk to 1)
        val result = cart.toOccurrenceMap()

        assertEquals(expected, result)
    }

    @Test
    fun occurrenceMapFromIntArray() {
        val cart = intArrayOf(5, 4, 4, 5, 3, 5)

        val expected = mapOf(5 to 3, 4 to 2, 3 to 1)
        val result = cart.toOccurrenceMap()

        assertEquals(expected, result)
    }

    @Test
    fun occurrenceMapFromList() {
        val cart = listOf(apple, apple, orange, milk)

        val expected = mapOf(apple to 2, orange to 1, milk to 1)
        val result = cart.toOccurrenceMap()

        assertEquals(expected, result)
    }

    @Test
    fun occurrenceMapFromString() {
        val cart = "aaom"

        val expected = mapOf('a' to 2, 'o' to 1, 'm' to 1)
        val result = cart.toOccurrenceMap()

        assertEquals(expected, result)
    }
}