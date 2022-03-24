package ru.tinkoff.fintech.homework.lession1

import io.mockk.spyk
import io.mockk.verify
import org.junit.jupiter.api.Test

class MockTest {
    @Test
    fun `Расход топлива у автомобиля марки Ford, но без запуска двигателя`(){
        val ford = spyk(Ford("Focus","Бензин",150,800))
        ford.fuelConsumption()
        verify (exactly = 1){ ford.fuelConsumption() }
        verify (exactly = 0){ford.startEngine()}
    }

    @Test
    fun `При вызове метода,должна выйти информация о передоваемом автомобиле`(){
        val ford = spyk(Ford("Mustang","Бензин",315,1500))
        val lada = spyk(Lada("Granta","Бензин",125,800,5))
        val seller = spyk(Seller(ford, lada))
        seller.carToOffer()
        verify (exactly = 1){seller.carToOffer()}
        verify (exactly = 0){seller.offer()}
    }

}