package abc

fun main() {
    val (n, t) = readLine()!!.split(" ").map(String::toLong)
    val alist = readLine()!!.split(" ").map(String::toLong)
    var index = 0
    val sumAlist = alist.sum()
    var time = t % sumAlist
    while (index < n) {
        if (time <= alist[index]) {
            println("${index + 1} $time")
            break
        }
        time -= alist[index]
        index++
    }
}