package com.turastory.annotationprocessing

@Factory(
    id = "Margherita",
    type = MargheritaPizza::class
)
class MargheritaPizza : Meal {
    override val price: Float
        get() = 6f
}