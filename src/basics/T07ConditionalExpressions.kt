package basics

fun main(args: Array<String>) {
	
	var result1 = maxOf(1, 99)
	println(result1)
	
	var result2 = maxOfSimple(1, 99)
	print(result2)
}

// 조건식으로 큰 값 반환
fun maxOf(a: Int, b: Int): Int {
	if(a > b) {
		return a
	} else {
		return b
	}
}

// 표현식으로 사용
fun maxOfSimple(a: Int, b: Int) = if(a > b) a else b