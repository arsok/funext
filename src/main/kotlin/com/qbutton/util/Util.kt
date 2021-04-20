package com.qbutton.util

infix fun Any?.eq(obj: Any?): Boolean {
    return this == obj
}

infix fun Any?.neq(obj: Any?): Boolean {
    return this != obj
}