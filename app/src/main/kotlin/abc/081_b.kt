package abc

fun main() {
    readLine()
    var a = readLine()!!.split(" ").map(String::toInt)
    var ans = 0
    while (a.map { it % 2 }.all { it == 0 }) {
        a = a.map { it / 2 }
        ans++
    }
    println(ans)
}