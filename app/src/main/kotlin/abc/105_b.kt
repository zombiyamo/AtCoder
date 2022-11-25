package abc

fun main() {
    val n = readLine()!!.toInt()
    for (i in 0..25) {
        for (j in 0..14) {
            if (4 * i + 7 * j == n) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}