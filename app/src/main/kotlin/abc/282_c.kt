package abc

fun main() {
    val n = readLine()!!
    val s = readLine()!!
    val list = s.split("\"")
    val ans = mutableListOf<String>()
    for (i in list.indices) {
        if (i % 2 == 0) {
            ans.add(list[i].replace(',', '.'))
        } else {
            ans.add(list[i])
        }
    }
    println(ans.joinToString("\""))
}