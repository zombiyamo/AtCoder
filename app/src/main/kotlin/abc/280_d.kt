//package abc
//
//fun main() {
//    val k = readLine()!!.toInt()
//    println(myBinarySearch(1, k) { isOk(it, k) })
//}
//
//fun isOk(n: Int, k: Int): Boolean {
//    var sum = 1.0
//    for (i in 1..n) {
//        sum *= i
//    }
//    return sum % k == 0.0
//}
//
//fun myBinarySearch(begin: Int, end: Int, isOk: (key: Int) -> Boolean): Int {
//    var ng = begin
//    var ok = end
//
//    while (Math.abs(ok - ng) > 1) {
//        val mid = (ok + ng) / 2
//        if (isOk(mid)) {
//            ok = mid
//        } else {
//            ng = mid
//        }
//    }
//
//    return ok
//}
//
//fun <T> List<T>.myBinarySearch(isOk: (T) -> Boolean): Int {
//    return myBinarySearch(-1, size) { index -> isOk(get(index)) }
//}
//
//fun <T> Array<T>.myBinarySearch(isOk: (T) -> Boolean): Int {
//    return myBinarySearch(-1, size) { index -> isOk(get(index)) }
//}