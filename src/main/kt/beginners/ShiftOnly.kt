package kt.beginners

/**
 * @author ykonno.
 * @since 2019/09/03.
 */
fun main(args: Array<String>) {
    // 1 <= n <= 200
    val n = readLine()!!.toInt()
    // 1 <= a <= 10^9
    val a = readLine()!!.split(" ").map(String::toInt)
    solver4(n, a)
}

fun solver4(n: Int, a: List<Int>) {
    var k = ArrayList<Int>(a)
    var cnt:Int = 0
    loop@ while(true) {
        (0..n).forEach {
            if (it == n) return@forEach
//            println(k.get(it))
            if (k.get(it) % 2 != 0) {
                return@loop
            }
            k[it] = k.get(it) / 2
        }
        cnt++
    }
    println(cnt)
}
