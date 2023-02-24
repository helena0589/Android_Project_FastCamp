package fastcampus.kotlin.part0.chapter1

fun main(){
    //1..10 == IntRange(1,10)
    for (i in 1..10){
        print(i)
        print(".")
    }

    //until : 마지막 숫자 전까지
    for( i in 1 until 10 ){
        print(i)
        print(".")
    }

    //step은 양수만 사용
   for ( i in 1 .. 10 step(2)){
        print(i)
        print(".")
    }

    //downTo
    for ( i in 1 downTo 10 ){
        print(i)
        print(".")
    }

    for ( i in 1 downTo 10 step(2)){
        print(i)
        print(".")
    }

    //while
    var c =1
    while(c<11){
        print(c)
        print(".")
        c++
    }
}