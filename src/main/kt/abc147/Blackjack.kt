package kt.abc147

/**
 * @author ykonno.
 * @since 2019/12/11.
 */

fun main(args: Array<String>) {
    val s = readLine()!!.split(" ").map(String::toInt)
    solver9(s)
}

fun solver9(s: List<Int>) {
    val ans = if (s.reduce { acc, i -> acc + i } > 21 ) "bust" else "win"
    println(ans)
}