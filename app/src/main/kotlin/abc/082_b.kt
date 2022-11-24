package abc

fun main() {
    val s = readLine()!!.split("").sorted().joinToString("")
    val t = readLine()!!.split("").sorted().reversed().joinToString("")
    println(if (s < t) "Yes" else "No")
}