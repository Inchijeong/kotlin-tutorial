package basics

fun main(args: Array<String>) {
	
	val x = 10
	val y = 9
	
	if(x in 1..y+1) {
		println("fits in range")
	}
	
	var list = listOf("a", "b", "c")
	
	println(list.lastIndex)
	
	if(-1 !in 0..list.lastIndex) {
		println("-1 in out of range")
	}
	
	println(list.indices)
	
	if(list.size !in list.indices) {
		println("list size is out of valid indices range, too")
	}
	
	for(x in 1..5) {
		print(x)
	}
	
	println()

	// 1과 10 포함	
	for(x in 1..10 step 2) {
		print(x)
	}
	
	println()
	
	// 9와 0 포함
	for(x in 9 downTo 0 step 3) {
		print(x)
	}
}