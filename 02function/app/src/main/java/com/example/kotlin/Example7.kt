package com.example.kotlin

fun main(){
    // mutable list : 수정 가능
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)
    list.addAll(listOf(7,8,9))

    //immutable list : 수정 불가능, 기본값
    val list1=listOf(1,2,3,4)
    list[0] //list.get(0)
    //list.add

    val diverseList = listOf(1,"안녕",1.78, true)
    list1.map{it * 10}

    println(list) // 주소값 출력
    println(list.joinToString(",")) // 리스트 요소 출력


    //map
    val map = mapOf((1 to "안녕"), (2 to "hello"))

    val map1 = mutableMapOf((1 to "안녕"), (2 to "hello"))
    map1[3]="응"
    map1[100] = "호이"
}