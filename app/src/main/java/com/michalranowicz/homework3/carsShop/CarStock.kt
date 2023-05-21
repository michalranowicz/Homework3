package com.michalranowicz.homework3.carsShop

class CarStock {
    private val cars = mutableListOf<Car>()

    fun addCar(car: Car) {
        cars.add(car)
    }

    fun displayStock() {
        for (car in cars) {
            car.displayInfo()
            println("----------------------------")
        }
    }

    fun getAllCars(): List<Car> {
        return cars
    }
}