package abc

fun main() {
    val s = readLine()!!
    println(s.filter { it == 'v' }.length + s.filter { it == 'w' }.length * 2)
}