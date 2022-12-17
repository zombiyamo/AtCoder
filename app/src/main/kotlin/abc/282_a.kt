package abc

fun main() {
    val k = readLine()!!.toInt()
    var str = ""
    var c = 1
    for (i in 'A'..'Z') {
        str += i
        if (k == c) break
        c++
    }
    println(str)
}