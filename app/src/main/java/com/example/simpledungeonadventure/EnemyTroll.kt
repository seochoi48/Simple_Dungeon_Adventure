package com.example.simpledungeonadventure

class EnemyTroll {
    private var health : Int = 50
    var dropList: List<String> = listOf("Bejeweled Sword", "Intricate Wand")

    private fun attack(): Int {
        return 10
    }
}