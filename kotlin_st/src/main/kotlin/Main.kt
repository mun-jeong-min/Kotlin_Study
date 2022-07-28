fun main() {
    println(sum(10, 10))
    sum2(20, 20)
    println(max(10, 20))
    println(parseInt("s"))
    println(whenFunc(true))
    where(11)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Unit {
    val rst: Int = a + b;
    println("a+b = $a+$b = $rst");
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun parseInt(str: String): Int? {
    return null;
}

fun whenFunc(str: Any):String =
    when (str) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        is String -> "1111"
        else -> "12345"
    }

fun where(num: Int): Unit {
    if(num in 1..10) {
        print(num)
    }
}