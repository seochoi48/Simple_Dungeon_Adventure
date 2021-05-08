package com.example.simpledungeonadventure

class EnemyOrc {
    private var health: Int = 24
    var dropList: List<String> = listOf("Sword", "Wand")

    private fun attack(): Int {
        return 7
    }
}