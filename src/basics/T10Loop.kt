package basics

fun main(args: Array<String>) {
	
	val items = listOf("apple", "banana", "kiwifruit");
	
	// for 문
	
	for(item in items) {
		println(item)
	}
	
	// 또는
	
	for(index in items.indices) {
		println("itme at $index is ${items[index]}")
	}
	
	// while 문
	
	var index = 0
	
	while(index < items.size) {
		println("itme at $index is ${items[index]}")
		index++
	}
	
}
