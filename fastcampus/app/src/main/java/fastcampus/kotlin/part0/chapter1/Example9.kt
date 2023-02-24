package fastcampus.kotlin.part0.chapter1

fun main(){
    println(check("안녕")) // 문자열
    println(check(3)) //숫자
    println(check(true)) //몰라요

    cast("안녕") //안녕
    cast(10) //Error : ClassCastException -> null

    println(smartcast("안녕")) //2
    println(smartcast(10)) //9
    println(smartcast(true)) //-1
}

//타입체크
fun check(a: Any):String{
    /*
    return if(a is String){
        "문자열"
    }else if (a is Int){
        "숫자"
    }else {
        "몰라요"
    }
     */

    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "몰라요"
        }
    }
}

//캐스팅
fun cast(a:Any){
    val result = a as? String //? : CCE error 방지 -> null
    // val result = (a as? String) ?: "실패" // CCE -> 실패
    println(result)
}

fun smartcast(a:Any):Int{
    /*
    return if(a is String){
        a. length // a를 String일 경우에만 활성화 : a를 String 타입으로 상정 후 작동
    }else if (a is Int){
        a.dec()
    }else{
        -1
    }
     */
    return when (a) {
        is String -> {
            a. length
        }
        is Int -> {
            a.dec()
        }
        else -> {
            -1
        }
    }
}