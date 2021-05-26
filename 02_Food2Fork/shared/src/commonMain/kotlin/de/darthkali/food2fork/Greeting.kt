package de.darthkali.food2fork

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}