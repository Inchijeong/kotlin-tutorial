package basics

import java.util.*

// null 값이 가능한 자리에 명시적으로 nullable 표시되어야 한다.

fun main(args: Array<String>) {
	printProduct("2", "3")
}

// 반환 값이 없을 경우 반환 타입을 명시할 수 없다.
/*
 * fun parseInt(str: String): Int? { // ... }
 */

fun parseInt(str: String): Int {
	return str.toInt()
}

fun printProduct(arg1: String, arg2: String) {
	
	val x = parseInt(arg1)
	val y = parseInt(arg2)
	
	if(x != null && y != null) {
		println(x * y)
	}
	else {
		println("'$arg1' or '$arg2' is not a number")
	}
}

// 또는

fun printProduct2(arg1: String, arg2: String) {

	val x = parseInt(arg1)
	val y = parseInt(arg2)
	
	if(x == null) {
		println("Wrong number format in arg1: '$arg1'")
	}
	if(y == null) {
		println("Wrong number format in arg1: '$arg2'")
	}
	
	println(x * y)	
}

