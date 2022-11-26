package abc

fun main() {
    val (h, _) = readLine()!!.split(" ").map(String::toInt)
    val s = mutableListOf<String>()
    val t = mutableListOf<String>()
    repeat(h) {
        s.add(readLine()!!)
    }
    repeat(h) {
        t.add(readLine()!!)
    }
    for (i in 0 until h) {
        if (s[i].filter { it == '#' }.length != t[i].filter { it == '#' }.length) {
            println("No")
            return
        }
    }
    println("Yes")
}