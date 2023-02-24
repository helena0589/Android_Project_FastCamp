package fastcampus.kotlin.part0.chapter1

// 1. 메인 함수 : 출력
fun main() : Unit{
    val result = test(1, c=5)
    test2(id="helena", name="조희우", nickname="hyu")
    println(result)
    println(time1(1, 3))
    println(time2(1, 3))
}

// 2. 함수
fun test(a: Int, b: Int = 3, c : Int = 4) : Int {
    println(a+b)
    return a+b
}

// single expresssion : '='을 사용하여 함수를 간략하게 구현
fun test2(name : String, nickname : String, id : String) = println(name + nickname + id)

fun time1 (a: Int, b:Int) : Int{
    return a*b
}
fun time2 (a: Int, b: Int) : Int = a*b

//3. 오버로딩
/*
fun test(a: Int): Int{
    val b=3
    println(a+b)
    return a+b
}
// 오버로딩을 할 필요 없이 (b: Int=3) 으로 초기값 설정 가능
*/