package abc

fun main() {
    val s = readLine()!!
    val t = readLine()!!
    print(if (s.contains(t)) "Yes" else "No")
}