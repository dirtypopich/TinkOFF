package ru.tinkoff.fintech.homework.lession1

fun main(){
 val car1 = Lada("priora","gasд",125, age = 2)
 val car2 = Ford("Mustang","бензин",350,3000)
 car1.setThePrice()
 car1.callThePrice()
 car1.startEngine()
 car1.isDamaged()
 println()
 car2.callThePrice()
 car2.startEngine()
 car2.fuelConsumption()
 println()
 Seller(car2,car1).offer()
}


