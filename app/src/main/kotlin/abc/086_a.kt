package abc

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    println(if ((a * b) % 2 == 0) "Even" else "Odd")
}