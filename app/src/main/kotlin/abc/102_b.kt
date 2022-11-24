package abc

fun main() {
    readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt).sorted()
    println(a.last() - a.first())
}