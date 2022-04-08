package Package

fun max(s1: Int, s2:Int) = if(s1>s2) s1 else s2

fun s(color: Color) =
    when(color){
        Color.RED -> "A"
        Color.BLUE -> "B"
        Color.ORANGE -> "C"
        Color.YELLOW -> "D"
        Color.GREEN -> {
            println("STARTTTTTT")
        };
        // Color.GREEN -> {
        // 실행구문
        // }
        // 이런 형태로 실행 구문가능
    }

fun main() {
    var s:Int = 30 // var은 변할수 있는 변수
    val r:Int = 20 // val은 변할수 없는 상수
    var a = 30 // 타입 추론을 지원하기 때문에 자료형을 쓰지않아도 됨.

    var arr:IntArray = IntArray(40)

    var sss:CharArray = CharArray(40)
    
    println(max(66,77))
    println(s(Color.GREEN))
}