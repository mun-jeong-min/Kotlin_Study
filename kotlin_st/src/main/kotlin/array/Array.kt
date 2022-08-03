package main.kotlin.array

fun main() {
    val items = listOf("apple", "banana", "kiwi")
    for(item in items) {
        println(item)
    }

    val items2 = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items2 -> print("melon")
        "apple" in items2 -> print("watermelon")
        "kiwi" in items2 -> print("SA")
        else -> print("end")
    }
    println(items2)

    items
        .filter { it.length > 4 }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}

