package com.example.kotlin

fun main(){
    max(10,3)
    isHoliday("금")
}

fun max(a: Int, b: Int){
    /*
    //java
    val result = if(a>b){
        println(a)
    } else{
        println(b)
    }
    println(result) //Unit 반환

     */

    //kotiln
    val result = if(a>b){
        a
    }else{
        b
    }
    println(result)

    /*3항연산자는 존재하지 않으나 중괄호 생략 가능
    val result=if(a>b) a else b
    */
}


//When : Switch문 대신
fun isHoliday(dayOfWeek : Any){
         when(val day = dayOfWeek){
            "월",
            "화",
            "수",
            "목",
            "금" -> false
            "토",
            "일" -> if(day == "토") "좋아" else "너무 좋아"
             in 2 .. 4 -> {}
             in listOf("월", "화") -> {}
            else -> "기본값"
        }
    }
}