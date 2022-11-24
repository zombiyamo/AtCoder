package abc

fun main() {
    println(readLine()!!.dropWhile { it != 'A' }.dropLastWhile { it != 'Z' }.length)
}