//package abc
//
//fun main() {
//    val (n, m) = readLine()!!.split(" ").map(String::toInt)
//    val list = mutableListOf<Pair<Int, Int>>()
//    val colors = mutableListOf<Int>()
//    //n個の頂点の色を初期化。0:未着色、1:黒、-1:白
//    repeat(n) { colors.add(0) }
//
//    repeat(m) {
//        val (f, s) = readLine()!!.split(" ").map(String::toInt)
//        list.add(Pair(f, s))
//    }
//
//}
//
//fun dfs(v: Int, color: Int, colors: MutableList<Int>, list: List<Pair<Int, Int>>): Boolean {
//    var stack = mutableListOf(Pair(0, 1))
//    repeat(stack.size) {
//        // スタックから最後に追加された(頂点, 色)をpop
//        val v = stack.last().first
//        val color = stack.last().second
//        // 今いる点を着色
//        colors[v] = color
//        // 今の頂点から行けるところをチェック
//
//    }
//}