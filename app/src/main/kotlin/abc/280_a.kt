package abc

fun main() {
    val (h, _) = readLine()!!.split(" ").map(String::toInt)
    var str = ""
    repeat(h) {
        str += readLine()
    }
    println(str.filter { it == '#' }.length)
}