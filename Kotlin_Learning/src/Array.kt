class Array {

}

fun main() {
    val strings = listOf("one", "two", "three")
    println(strings)

    val strings2 = setOf("1","2","3")
    println(strings2)

    sum(4,5)
}

fun sum(a: Int, b: Int): Unit {
    println("sum $a and sum $b")
}