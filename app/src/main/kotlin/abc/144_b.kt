package abc

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..9) {
        for (j in 1..9) {
            if (n == i * j) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}