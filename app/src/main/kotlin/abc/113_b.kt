package abc

import kotlin.math.abs

fun main() {
    readLine()!!.toInt()
    val (t, a) = readLine()!!.split(" ").map(String::toInt)
    val h = readLine()!!.split(" ").map(String::toDouble)

    val diff = h.map { t - it * 0.006 }
        .map { abs(a - it) }
    var min = Double.MAX_VALUE
    var answer = Int.MAX_VALUE
    diff.forEachIndexed { index, d ->
        if (min > d) {
            min = d
            answer = index + 1
        }
    }
    print(answer)
}