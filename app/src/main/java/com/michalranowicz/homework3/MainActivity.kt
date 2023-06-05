package com.michalranowicz.homework3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.michalranowicz.homework3.carsShop.*
import com.michalranowicz.homework3.ui.theme.Homework3Theme
import java.time.LocalDate
import kotlin.reflect.typeOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen()

        }
    }
}

@Composable
fun Screen() {
    Column {
        displayCarInformation()
    }
}

fun displayCarInformation() {
    val car1 = NewCar("Toyota", "CorollaIV", 2022,  25000.0,FuelType.ELECTRIC)
    car1.addExtraOption(ExtraOption.GPS)
    car1.addExtraOption(ExtraOption.LeatherSeats)

    val car2 = NewCar("Honda", "CivicV", 2022,  27000.0,FuelType.HYBRID)
    car2.addExtraOption(ExtraOption.Sunroof)

    val car3 = NewCar("Ford", "MustangE", 2022,  50000.0,FuelType.COMBUSTION)
    val usedCar1 = UsedCar("Toyota", "Corolla", 2018, false, 15000.0, 50000,FuelType.HYBRID)
    val usedCar2 = UsedCar("Honda", "Civic", 2017, false, 14000.0, 60000,FuelType.COMBUSTION)
    val usedCar3 = UsedCar("Ford", "Mustang", 2015, false, 30000.0, 1800000,FuelType.COMBUSTION)

    val carStock = CarStock()
    carStock.addCar(car1)
    carStock.addCar(car2)
    carStock.addCar(car3)
    carStock.addCar(usedCar1)
    carStock.addCar(usedCar2)
    carStock.addCar(usedCar3)

    println("KOMIS u JANUSZA")

    println("// All available cars")
    carStock.displayStock()

    println("// Available used Cars:")
    carStock.displayUsedCars()

    println("//Available new Cars:")
    carStock.displayNewCars()

    val localDate = LocalDate.now()
    val dayOfWeek = localDate.dayOfWeek.value
    println(dayOfWeek)
    val allCars = carStock.getAllCars()
    for (car in allCars) {
        if (car is UsedCar && dayOfWeek in 0..3) {
            car.displayInfo(5)
        } else if (car is UsedCar) {
            car.displayInfo()
        }
    }
    println("// All Extras:")
    val allExtras = ExtraOption.values()
    for (extra in allExtras) {
        println("- ${extra.name}: ${extra.price}")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Homework3Theme {
        Greeting("Android")
    }
}