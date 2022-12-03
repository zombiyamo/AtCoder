package abc

fun main() {
    val s = readLine()!!.toCharArray()
    val t = readLine()!!.toCharArray()
    for (i in s.indices) {
        if (s[i] != t[i]) {
            println(i + 1)
            return
        }
    }
    println(t.size)
}