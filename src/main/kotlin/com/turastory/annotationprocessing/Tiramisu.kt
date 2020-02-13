package com.turastory.annotationprocessing

@Factory(
    id = "Tiramisu",
    type = Tiramisu::class
)
class Tiramisu : Meal {
    override val price: Float
        get() = 4.5f
}