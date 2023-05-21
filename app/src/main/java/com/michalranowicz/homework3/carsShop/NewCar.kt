package com.michalranowicz.homework3.carsShop



class NewCar(
    brand: String,
    model: String,
    year: Int,
    isnew: Boolean,
    val basePrice: Double,
) : Car(brand, model, year, isnew) {

    private val extras = mutableListOf<ExtraOption>()

    fun addExtraOption(extra: ExtraOption) {
        extras.add(extra)
    }

    private fun calculateTotalPrice(): Double {
        val extrasPrice = extras.sumOf { it.price }
        return basePrice + extrasPrice
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Base Price: $basePrice")
        println("Total Price: ${calculateTotalPrice()}")
        println("Extras: print w new car")
        for (extra in extras) {
            println("- ${extra.optionName}: ${extra.price}")
        }
    }


}