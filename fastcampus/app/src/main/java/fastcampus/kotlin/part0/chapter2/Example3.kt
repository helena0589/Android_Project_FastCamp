package fastcampus.kotlin.part0.chapter2

fun main() {
    //let, run, apply, also & with
    //1. let
    /*
     수신객체.let { it | local variable ->
        ...
        마지막줄 : return
     }
    */
    val a = 3
    a.let { }

    var user: User? = User("조희우", 22, true)
    //nullable
    val age = user?.let {
        it.age
    }

    /*
        val age = user.let{ user ->
            user.age
        }
    */
    println(age)


    //2. run
    /*
       let과 차이점
        - 수신객체를 받는 방법
        - 수신객체 선언이 불가능하며, this로 받고 this는 생략이 가능함
        - 객체를 초기화할 때 사용함
        - 람다식을 리턴
     */

    /*
        수신객체.run{ this ->
            ...
            마지막줄 : return
         }
    */

    val kid = User("아이", 4, false)
    val kidAge = kid.run {
        this.age
    }
    println(kidAge)

    //3. apply
    /*
        - local variable 선언 불가능
        - 수신객체를 this로 받으며, this는 생략 가능
        - 수신객체를 리턴
    */

    /*
    수신객체.apply{
     ...
      return : 수신객체
    }
     */

    val kidName = kid.apply {
        name
    }
    println(kidName) //객체가 출력

    //apply를 사용한 객체 속성 초기화
    val female = User("슬기", 20, true, true)
    println(female.hasGlasses)

    val femaleValue = female.apply {
        hasGlasses = false
    }
    println("femaleValue : $femaleValue")
    println(femaleValue.hasGlasses)
    println(female.hasGlasses)

    // 4. also
    /*
      수신객체.also{ it | local variable ->
        ...
        return : 수신객체 (자기자신)
      }
     */
    /*
        - 수신객체 내용을 확인할 때 (로그 출력)시 추천
        - local variable보다는 it을 추천함
     */
    val male = User("민수", 17, false, true)
    val maleValue = male.also { user ->
        user.name // it.name
        user.hasGlasses = false // it.hasGlasses = false
        println(user.name)
    }
    println(maleValue) //코드 조각
    println(maleValue.hasGlasses) // 속성값


    // 5. with : 확장함수는 아님
    /*
        with(수신객체) { -> [this]
            ...
            return : 람다식(마지막줄)
        }
     */

    val result = with(male) {
        hasGlasses = false
        true
    }
    println(result)
}

class User(
    val name : String,
    val age : Int,
    val gender : Boolean, // true : female, false : male
    var hasGlasses : Boolean = true,
)