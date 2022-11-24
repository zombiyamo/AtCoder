package abc

fun main() {
    var (n, x) = readLine()!!.split(" ").map(String::toInt)
    val m = mutableListOf<Int>()
    repeat(n) {
        m.add(readLine()!!.toInt())
        x -= m[it]
    }
    m.sort()
    while (x >= m.first()) {
        x -= m.first()
        n++
    }
    print(n)
}