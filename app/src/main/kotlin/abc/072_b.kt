package abc

fun main() {
    println(readLine()!!.filterIndexed { index, _ ->
        index % 2 == 0
    })
}