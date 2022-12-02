package abc

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    var cnt = 0
    for (i in a..b) {
        if (i.toString().reversed() == i.toString()) cnt++
    }
    println(cnt)
}