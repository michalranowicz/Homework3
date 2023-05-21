package com.michalranowicz.homework3.carsShop

open class Car(
    val brand: String,
    val model: String,
    val year: Int,
    val isnew: Boolean
) {
    //Polimorfizm dynamiczny medoda displayInfo jest również pod tą samą nazwą w klasach NewCar i UsedCar
 open fun displayInfo(){
     println("$brand $model ($year)")
 }
}