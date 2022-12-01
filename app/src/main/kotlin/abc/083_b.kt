package abc

fun main() {
    val (n, a, b) = readLine()!!.split(" ").map(String::toInt)
    var cnt = 0
    for (i in 1..n) {
        var tmp = i
        var sum = 0
        do {
            sum += tmp % 10
            tmp /= 10
        } while (tmp != 0)
        if (!(a > sum || sum > b)) {
            cnt += i
        }
    }
    println(cnt)
}