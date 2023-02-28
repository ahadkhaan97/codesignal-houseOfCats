fun main() {
    solution(8).forEach {
        println(it)
    }
}

@Suppress("NAME_SHADOWING")
fun solution(legs: Int): MutableList<Int> {
    var legs = legs
    val tempList = mutableListOf<Int>()
    if (legs % 4 == 0) {
        tempList.add(0)
    }
    while (legs > 0) {
        tempList.add(legs / 2)
        legs -= 4
    }
    tempList.sort()
    return tempList
}
