package basics

// 선언식
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식
// fun sum(a: Int, b: Int) = a + b


// 반환값이 없는 함수
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit는 생략될수 있다
//fun printSum(a: Int, b: Int) {
//    println("sum of $a and $b is ${a + b}")
//}

fun main() {
    printSum(-1, 8)
}