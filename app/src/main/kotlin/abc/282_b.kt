package abc

fun main() {
    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val s = mutableListOf<String>()
    var c = 0
    repeat(n) {
        s.add(readLine()!!)
    }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in 0 until m) {
                if (s[i][k] == 'x' && s[j][k] == 'x') {
                    break
                }
                if (k == m - 1) c++
            }
        }
    }

    println(c)
}