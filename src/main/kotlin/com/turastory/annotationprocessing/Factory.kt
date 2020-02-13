package com.turastory.annotationprocessing

import kotlin.reflect.KClass

@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS)
annotation class Factory(
    val id: String,
    val type: KClass<*>
)