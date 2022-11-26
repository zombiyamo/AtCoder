package abc

// TLE
fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toDouble)
    var g = 0.0
    var time = Double.MAX_VALUE
    while (time > b * g + a / Math.sqrt(g + 1)) {
        time = b * g + a / Math.sqrt(g + 1)
        g++
    }
    println(time)
}