package agc

fun main() {
    val n = readLine()!!.toInt()
    var min = Int.MAX_VALUE
    for (i in 1..n / 2) {
        var cnt = 0
        var tmp = i
        do {
            cnt += tmp % 10
            tmp /= 10
        } while (tmp != 0)
        tmp = n - i
        do {
            cnt += tmp % 10
            tmp /= 10
        } while (tmp != 0)
        if (min > cnt) min = cnt
    }
    println(min)
}