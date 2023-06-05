package com.michalranowicz.homework3.carsShop

class UsedCar(
    brand: String,
    model: String,
    year: Int,
    isnew: Boolean,
    val basePrice: Double,
    val mileage: Int,
    val fuelType: FuelType,
) : CarFuelType(brand, model, year, isnew = true){
    override fun displayInfo() {
        super.displayInfo()
        println("Base Price: $basePrice")
        println("Mileage: $mileage")
    }

    //    polimorfizm ad hoc
    fun displayInfo(discount: Int) {
        val doubleDiscount = discount*2
        if(mileage  in 0..100000){
            println("Weekend price reduction minus - $discount % from the base price")
            displayInfo()
//            super.displayInfo()
//            println("Base Price: $basePrice")
//            println("Mileage: $mileage")
        }else{
            println("huge price reduction minus - $doubleDiscount % from the base price")
            displayInfo()
//            super.displayInfo()
//            println("Base Price: $basePrice")
//            println("Mileage: $mileage")
        }

    }
}