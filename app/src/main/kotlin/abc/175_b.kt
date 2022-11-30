package abc

fun main() {
    val n = readLine()!!.toInt()
    var cnt = 0
    if (n < 3) {
        println(cnt)
        return
    }
    val list = readLine()!!.split(" ").map(String::toInt)
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                val tmp = mutableListOf(list[i], list[j], list[k])
                if (tmp.distinct().size == 3
                    && tmp[0] + tmp[1] > tmp[2]
                    && tmp[1] + tmp[2] > tmp[0]
                    && tmp[2] + tmp[0] > tmp[1]) cnt++
            }
        }
    }
    println(cnt)
}