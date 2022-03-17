data class info(var h:Int, var w:Int)

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

    var sl = list2.sortBy { it.h }
    println()
}
