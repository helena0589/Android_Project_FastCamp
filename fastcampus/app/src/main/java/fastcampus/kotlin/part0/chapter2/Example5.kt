package fastcampus.kotlin.part0.chapter2

import android.content.Intent

fun main(){
    // 5. Data, Sealed Class
    /*
    1) Data Class
        데이터를 담기 위한 클래스
        메소드 자동 생성 : override 가능
            toString()
            hashCode()
            equals()
            copy()
        1개 이상의 프로퍼티가 필요함
        데이터 클래스는 abstract, open, sealed, inner를 붙일 수 없음
        상속이 불가능
    */
    val person = Person("희우", 22)
    val dog = Dog ("콩자", 13)
    println(person.toString()) //코드 조각
    println(dog.toString()) // Dog(name=콩자, age=13)
    println(dog.copy(name="조콩자")) // 변경된 값으로 출력 : 일회용

    /*

    2) Sealed class
        추상 클래스, 상속 받은 자식 클래스의 종류를 제한
        컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 앎
        when과 함께 사용할 때 유용함
     */
    val cat : Cat = BlueCat()
    val result = when (cat){
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"

        //whiteClass 추가할 경우 : sealed class는 자동으로 자식 클래스를 확인
        is WhiteCat -> "white"

        // else -> "none"
        // 일반 class는 cat을 상속받은 개체를 모르므로 else문이 필요
        // sealed class로 변경하면 else문이 필요하지 않음 : else redundant
        // sealed class -> 어떤 자식 class를 가지고 있는지 인지
        // 에러 케이스, 뷰 타입 체크 시 주로 사용
    }
}

// 1) Data Class
class Person(
    val name : String,
    val age : Int
)
// dataClass 하나 이상의 프로퍼티가 필요함
data class Dog(
    val name : String,
    val age :Int
){
    //override
    override fun toString(): String {
        return "이름 : $name"
    }
}
//class Cat() // 일반 클래스는 프로퍼티가 없어도 됨

/* 상속 불가능
data class Corgi(
    val pretty : Boolean = true
) : Dog()
*/


//Sealed Class
sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat : Cat()
