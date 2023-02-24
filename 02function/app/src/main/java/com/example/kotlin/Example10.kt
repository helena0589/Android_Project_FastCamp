package com.example.kotlin

//String template
//print log
fun main(){
    val a = 10
    val name = "안녕"
    val isHigh = true

    /*
    * java
    * println(a.toString() + name + isHigh.toString())
    * String.format("%s %d, name, a)
    * */

    // toString 필요 없이 $를 사용하여 출력
    println("$a $name $isHigh") //10 안녕 true
    println("$a ${name.length} $isHigh") //10 2 true
}