package ru.tinkoff.fintech.homework.lession1

class Seller(ford: Ford, lada: Lada) {

    val car = ford
    val carLada = lada

    fun offer() {
        println(
            "Добрый день! Добро пожаловать в наш автосалон," +
                    " у нас есть автомобили марки Ford и Lada "
        )
        println("Автомобиль какого бренда вам было бы итересно посмотреть ?")
        println("1.Ford")
        println("2.Lada")
        println("Выберете номер марки автомобиля:")
        val choose: String? = readLine()


        if (choose == "1") {
            carToOffer()
            car.callThePrice()
            println("Давайте заведём машину и послушаем звук")
            car.startEngine()
        } else if (choose == "2") {
            carLada.setThePrice()
            carLada.callThePrice()
            carLada.startEngine()
        } else
            println("К сожалению других автомобилей у нас нет.")

    }

    fun carToOffer() {
        println("Могу вам предложить Ford ${car.model}")
        println("В качестве топлива он использует ${car.fuel} ")
        println("Двигатель мощностью ${car.horsePowers} лошадинных сил")

    }
}



