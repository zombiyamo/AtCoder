package abc

fun main() {
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    for (i in 1..n) {
        var aa = 0
        var bb = i
        while (bb % 2 == 0) {
            aa++
            bb /= 2
        }
        if (aa > a) {
            a = aa
            b = i
        }
    }
    println(b)
}