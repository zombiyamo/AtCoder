package abc

fun main() {
    val s = readLine()!!.toCharArray()
    if (s.size == 8 && s.first().isUpperCase() && s.last().isUpperCase()) {
        val list = s.drop(1).dropLast(1)
        val tmp = list.joinToString("")
            tmp.toIntOrNull()?.let {
                if (it in 100000..999999) {
                    println("Yes")
                    return
                }
            }
    }
    println("No")
}