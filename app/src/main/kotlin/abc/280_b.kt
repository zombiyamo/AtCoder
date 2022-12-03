package abc

fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map(String::toInt)
    val ans = mutableListOf(list[0])
    for (s in 1 until n) {
        var tmp = 0
        for (i in 0 until s) {
            tmp += ans[i]
        }
        ans.add(list[s] - tmp)
    }
    println(ans.joinToString(separator = " "))
}