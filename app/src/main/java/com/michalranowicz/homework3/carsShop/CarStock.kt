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

//    fun displayFilteredCarsByFuelType(fuelType: CarFuelType) {
//        for (car in cars) {
//            if (car is NewCar && car.fuelType == fuelType.fuelType) {
//                car.displayInfo()
//                println("----------------------------")
//            } else if (car is UsedCar && car.fuelType == fuelType.fuelType) {
//                car.displayInfo()
//                println("----------------------------")
//            }
//        }
//    }

    fun displayNewCars() {
        for (car in cars) {
            if (car is NewCar) {
                car.displayInfo()
                println("----------------------------")
            }
        }
    }

    fun displayUsedCars() {
        for (car in cars) {
            if (car is UsedCar) {
                car.displayInfo()
                println("----------------------------")
            }
        }
    }

    fun getAllCars(): List<Car> {
        return cars
    }
}
