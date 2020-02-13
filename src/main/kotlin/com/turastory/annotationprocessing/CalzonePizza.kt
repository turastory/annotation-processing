package com.turastory.annotationprocessing

@Factory(
    id = "Calzone",
    type = CalzonePizza::class
)
class CalzonePizza : Meal {
    override val price: Float
        get() = 8.5f
}