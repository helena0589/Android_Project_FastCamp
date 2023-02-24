package fastcampus.kotlin.part0.chapter1

fun main(){
    var name : String = "희우"

    // null type = type + '?'(Elvis Operator)
    var number : Int? = 10
    number = null

    var nickname : String? = null

    /*
    // null checking
    val result = if (nickname == null){
        "값이 없음"
    }else{
        nickname
    }
    */

    nickname = null
    val result = nickname?: "값이 없음"
    val size = nickname?.length
    // val size = nickname!!.length

    print(result)
}