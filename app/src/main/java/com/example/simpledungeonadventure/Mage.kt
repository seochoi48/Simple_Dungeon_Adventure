package com.example.simpledungeonadventure

class Mage {
    lateinit var name: String
    private var intelligence: Int = 8
    private var defense: Int = 8
    private var health: Int = 27
    private var mana: Int = 40
    lateinit var weapon: String
    private var weaponStrength: Int = 0
    lateinit var itemlist: Map<String, Int>
    private var deathCount: Int = 0

    private fun Mage(myName: String) {
        this.name = myName
    }

    private fun equip(weaponName: String) {
        this.weapon = weaponName
    }

    private fun unequip() {
        this.weapon = " "
        this.weaponStrength = 0
    }

    private fun MagicShot(): Int {
        var damage: Int
        var tempMana = this.mana - 2
        damage = when {
            this.mana == 0 -> 0
            tempMana <= 0 -> 0
            else -> this.intelligence + this.weaponStrength
        }
        this.mana = when {
            damage == 0 -> this.mana
            else -> tempMana
        }
        return damage
    }

    private fun magicShield() {
        this.defense += 5
    }

    private fun mindControl() {

    }

    private fun predictFuture(){

    }
}