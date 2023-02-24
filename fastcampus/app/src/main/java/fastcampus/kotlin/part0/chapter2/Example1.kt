package fastcampus.kotlin.part0.chapter2

fun main(){
    // 1. 익명함수
    // 2. 변수처럼 사용 -> 함수의 argument, return
    // 3. 일회용 함수 : 한 번 사용 후 재사용되지 않는 함수

    val a = fun(){ println("Hello")}
    val c : Int = 10
    val b : (Int) -> Int = {
        it * 10 // 변수명을 지정하지 않고 it으로 사용 가능
        //함수 구현의 마지막 부분에 오는 것이 리턴
    }

    val d = {i : Int, j : Int -> i*j} // b와 d 중 하나의 형식으로는 변수타입 지정
    val f :(Int, String, Boolean) -> String = {_, b, _-> b} // 사용하지 않는 변수는 underscore로 생략 가능

    println(b) // 코드 조각 자체가 출력됨
    println(b(10)) // 람다 코드 실행

    hello(10, b)
}

fun hello(a:Int, b: (Int) -> Int) : (Int) -> Int{
    println(a)
    println(b(20))
    return b
}