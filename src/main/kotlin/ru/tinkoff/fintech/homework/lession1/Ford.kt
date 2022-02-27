package ru.tinkoff.fintech.homework.lession1

class Ford(override val model: String, override val fuel: String, override val horsePowers: Short,
           override var price: Short): Car() {

    override fun callThePrice() {
        println("Текущая цена автомобиля Ford $model: $price$")
    }

    override fun startEngine() {
        println("Нажать на кнопку")
        println("Wr-wr-wr-wr")
        println("Engine is started")
    }

    fun fuelConsumption(){
        println ("Расход топлива составляет:" + (horsePowers / 10.0 - 5))
    }
}