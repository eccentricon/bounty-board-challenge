/*
 * Bounty Board Challenges
 */
const val HERO_NAME = "Madrigal"

fun main() {
    println("The hero announces her presence to the world.")

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    // Challenge: hasSteed
    val hasSteed = false
    println("hasSteed: $hasSteed")

    // Challenge: The Unicorn's Horn
    val pubName = "The Unicorn's Horn"
    val publicanOnDuty = "(unnamed)"
    val playerGold = 50.0
    val pubDrinkMenu = setOf("mead", "wine", "LaCroix")

    println("pubName: $pubName, \npublicanOnDuty: $publicanOnDuty, " +
            "\nplayerGold: $playerGold," +
            "\npubDrinkMenu: $pubDrinkMenu")

    // Challenge: Magic Mirror
    println("The magic mirror shows \"${HERO_NAME.reversed()}\"")

    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
    println(playerLevel)
}