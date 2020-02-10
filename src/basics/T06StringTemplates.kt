package basics

fun main(args: Array<String>) {

	var a = 1
	val s1 = "a is $a" // 문자열 템플릿사용
	
	println(s1)
	
	a = 2
	
	val s2 = "${s1.replace("is", "was")}, but now is $a"
	
	println(s2)
}