package basics

fun main(args: Array<String>) {
	
	println(getStringLength("abc"))
	println(getStringLength(1234))
	
}

// is - 해당 타입인지 확인한다.
// 만약, 맞다면 해당 타입으로 자동 형변환 해준다.
fun getStringLength(obj: Any): Int? {
	
	if(obj is String) {
		return obj.length
	}
	
	return null
}

// 또는
fun getStringLength2(obj: Any): Int? {
	
	if(obj !is String) return null
	return obj.length
}

// even
fun getStringLength3(obj: Any): Int? {
	
	if(obj is String && obj.length > 0) {
		return obj.length
	}
	
	return null
}