package fastcampus.kotlin.part0.chapter2


//1) lateinit
//var text :String? = null
lateinit var text :String // variable에만 지정 가능 / lateinit을 설정하는 대신 타입을 지정
// lateinit var age : Int //  primitive types 사용 불가능
lateinit var age : Integer // 참조 타입은 사용 가능


//2) lazy : lambda
val test : Int by lazy {

    println("초기화 중...") // 시점 파악 용 log
    100
}

fun main(){
    // 04. 초기화 지연
    /*
    정의 : 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
    목적 : 메모리를 효율적으로 사용하기 위해서 / null safet 한 value를 사용하기 위해서
    1) lateinit, var
        - 변수 타입을 지정해야함
        - prrimitive type 지정은 불가능 (참조 타입 변경 혹은 값 할당 필요)
        - 선언 후 나중에 초기화 해줘도 됨
    2) lazy, val
        - 선언과 동시에 초기화 필요
        - 호출 시점에 초기화
     */


    // println(text) //선언 전 호출 시 UninitalizedPropertyAccessException 발생

    text="name" //초기화 지연
    age=Integer(10)
    println(text)


    //main -> 초기화(호출 시점에서 초기화) -> 초기화 값 -> 두 번째 호출 (이미 초기화를 했기에 출력)
    println("메인 함수 실행")
    println("초기화 한 값 : $test")
    println("두 번째 호출 : $test")
}