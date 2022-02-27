package ru.tinkoff.fintech.homework.lession1

abstract class Car() {
    abstract val model: String
    abstract val fuel: String
    abstract val horsePowers: Short
    abstract var price: Short

    abstract fun startEngine()
    abstract fun callThePrice()
}
