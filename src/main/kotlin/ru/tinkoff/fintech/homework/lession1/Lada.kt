package ru.tinkoff.fintech.homework.lession1

class Lada(override val model: String, override val fuel: String, override val horsePowers: Short,
           override var price: Short = 0, private val age: Short): Car() {
    private var damaged: Boolean = false

    fun isDamaged(): String{
        if (age > 5) {
            damaged = true
            return ("Машина имеет ржавчину")
        }
        else{
            return ("Машина не гнилая")
        }
    }

    fun setThePrice(){
        if (age < 3 ){
            price = 1300
        }
        else if (age in 3..5){
            price = 1000
        }
        else {

            price = 800
        }
    }
  override fun startEngine() {
        println("Вставить ключ")
        println("Повернуть ключ")
        println("Вр-вр-вр-вр")
        println("Двигатель запущен")
}

    override fun callThePrice() {
        println("Цена данного автомобиля Lada $model на текущий момент $price$")
    }
}