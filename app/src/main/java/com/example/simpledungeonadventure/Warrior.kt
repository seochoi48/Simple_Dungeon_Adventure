package com.example.simpledungeonadventure

import kotlin.properties.Delegates

class Warrior {
    lateinit var name: String
    private var strength: Int = 5
    private var defense: Int = 10
    private var health: Int = 40
    private var mana: Int = 20
    lateinit var weapon: String
    private var weaponStrength :Int = 0
    lateinit var itemlist: Map<String, Int>
    private var deathCount: Int = 0

    private fun Warrior(myName: String) {
        this.name = myName
    }

    private fun equip(weaponName: String) {
        this.weapon = weaponName
        //Need to create list of weapons and strength value
    }

    private fun unequip() {
        this.weapon = ""
        this.weaponStrength = 0
    }

    private fun swordSwing(): Int {
        //Deal and calculate damage based on strength and weapon Strength
        var damage: Int
        var tempMana = this.mana - 1
        damage = when {
            this.mana == 0 -> 0
            tempMana <= 0 -> 0
            else -> this.strength + this.weaponStrength
        }
        this.mana = when {
            damage == 0 -> this.mana
            else -> tempMana
        }
        return damage
    }

    private fun defenseUP() {
        this.defense += 5
    }

    private fun charisma(myString: String) {

    }

    private fun usePotion() {

    }

    private fun addDeathCount() {
        deathCount += 1
    }
}