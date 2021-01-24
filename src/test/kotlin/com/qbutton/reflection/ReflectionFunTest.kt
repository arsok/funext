package com.qbutton.reflection

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class ReflectionFunTest {

    @Test
    fun setFieldValue() {
        val list = createListOfStrings()

        list.setFieldValue("size", -1)

        assertEquals(-1, list.size)
    }

    @Test
    fun setFieldValueNoSuchFiled() {
        val list = listOf("One")

        assertThrows<NoSuchFieldException> { list.setFieldValue("size", -1) }
    }

    @Test
    fun setFieldValueWrongValueType() {
        val list = createListOfStrings()

        assertThrows<IllegalArgumentException> { list.setFieldValue("size", "string") }
    }

    private fun createListOfStrings() = mutableListOf("one", "two", "three")
}
