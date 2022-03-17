import kotlin.math.*

data class info(var h:Int, var w:Int)
data class Person(val name : String, val age : Int)

fun main(args: Array<String>) {
    /*print("값을 입력하세요 : ")
    val input = readLine()!!.toInt()
    println("입력받은 내용: $input")
*/
    var arr5=IntArray(4,{0})
    arr5[0] = 140
    arr5[1] = 21
    arr5[2] = 21
    arr5[3] = 32

    var arr=IntArray(4,{0})
    arr[0] = 2
    arr[1] = 1
    arr[2] = 3
    arr[3] = 7

    val list2 = mutableListOf<info>()

    for (i in arr5.indices){
        list2.add(info(arr5[i],arr[i]))
    }

    var sl = list2.sortedWith(compareBy({-it.h},{-it.w}))

    var line: Long = 0
    for (i in sl.indices){
        line += sl[i].w

    }

    var personList = listOf(
        Person("Han",25),
        Person("Kim",19),
        Person("Lee",27),
        Person("Choi",25)
    )
    var personList1 = personList.sortedBy {it.age }

    println()
}
