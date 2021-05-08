package com.example.simpledungeonadventure

class EnemyGoblin {
    private var health : Int = 12
    var dropList: List<String> = listOf("Rusty Sword", "Cracked Wand")

    private fun attack():Int {
        return 4
    }

}