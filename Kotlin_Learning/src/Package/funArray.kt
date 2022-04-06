package Package

fun max(s1: Int, s2:Int) = if(s1>s2) s1 else s2

fun s(color: Color) =
    when(color){
        Color.RED -> "A"
        Color.BLUE -> "B"
        Color.ORANGE -> "C"
        Color.YELLOW -> "D"
        Color.GREEN -> "E"
    }

fun main() {
    println(max(66,77))

    println(s(Color.BLUE))
}