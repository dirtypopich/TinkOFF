package ru.tinkoff.fintech.homework.lession1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LadaTest {
    private val car1 = Lada("Приора", "Бензин", 125, age = 2)
    private val car2 = Lada("Гранта", "Газ", 125, age = 8)

    @Test
    fun isDamaged() {
        val result = "Машина не гнилая"
        assertEquals(result, car1.isDamaged())
    }

    @Test
    fun isDamagedDamaged() {
        val result = "Машина имеет ржавчину"
        assertEquals(result, car2.isDamaged())
    }
}