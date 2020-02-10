package basics

fun main(args: Array<String>) {

	// val - 읽기 전용 지역 변수
	val a: Int = 1  // 즉시 할당
	val b = 2   // 타입은 생략 가능
	val c: Int  // 초기화하지 않을경우 타입이 요구 된다.
	c = 3       // 연기된 할당
	
	// var - 변수 할당
	var x = 5
	x += 1
	
	print(incrementX())
}


// Top-level variables
val PI = 3.14
var x = 0

fun incrementX(): Int{
	x += 1
	return x
}