package com.qbutton.collections

fun Iterable<*>.toOccurrenceMap(): Map<*, Int> = this.groupingBy { it }.eachCount()

fun Array<*>.toOccurrenceMap(): Map<*, Int> = this.groupingBy { it }.eachCount()

fun BooleanArray.toOccurrenceMap(): Map<Boolean, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()
fun ByteArray.toOccurrenceMap(): Map<Byte, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()
fun CharArray.toOccurrenceMap(): Map<Char, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()
fun DoubleArray.toOccurrenceMap(): Map<Double, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()
fun FloatArray.toOccurrenceMap(): Map<Float, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()
fun IntArray.toOccurrenceMap(): Map<Int, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()
fun LongArray.toOccurrenceMap(): Map<Long, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()
fun ShortArray.toOccurrenceMap(): Map<Short, Int> = this.groupBy { it }.mapValues { it.value.size }.toMap()

fun String.toOccurrenceMap(): Map<Char, Int> = this.groupingBy { it }.eachCount()