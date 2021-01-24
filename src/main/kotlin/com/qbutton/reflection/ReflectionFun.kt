package com.qbutton.reflection

import java.lang.reflect.Field

/**
 * Updates specified field of the object with new value via reflection
 *
 * @param fieldName name of field to be set
 * @param value value of field to be set
 *
 * @throws NoSuchFieldException if field was not found
 * @throws IllegalArgumentException if value type does not suit field type
 */
fun Any.setFieldValue(fieldName: String, value: Any?) {
    var clazz: Class<*> = this.javaClass
    var field: Field? = null

    while (field == null && clazz.superclass != null) {
        field = clazz.declaredFields.find { it.name == fieldName }
        clazz = clazz.superclass
    }

    if (field == null) throw NoSuchFieldException(fieldName)

    field.isAccessible = true
    field.set(this, value)
}