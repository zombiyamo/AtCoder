package abc

fun main() {
    val (n, d) = readLine()!!.split(" ").map(String::toInt)
    val list = mutableListOf<List<Int>>()
    var count = 0
    repeat(n) {
        list.add(readLine()!!.split(" ").map(String::toInt))
    }
    for (i in 0 until n) {
        for (j in (i + 1) until n) {
            var sum = 0.0
            for (k in 0 until d) {
                sum += Math.pow((list[i][k] - list[j][k]).toDouble(), 2.0)
            }

            for (k in 0..sum.toInt()) {
                if (k * k == sum.toInt()) {
                    count++
                    break
                }
            }
        }
    }
    print(count)
}