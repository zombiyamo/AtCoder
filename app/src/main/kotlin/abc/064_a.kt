package abc

fun main() {
    val (r, g, b) = readLine()!!.split(" ").map { it.toInt() }
    println(if ((100 * r + 10 * g + b) % 4 == 0) "YES" else "NO")
}