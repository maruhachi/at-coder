package kt.beginners

/**
 * @author ykonno.
 * @since 2019/09/03.
 */
fun main(args: Array<String>) {
    val s = readLine()!!
        .chunked(1) // 1文字ごとに分割 => TODO:1.0にはない
        .map(String::toInt)
    solver3(s)
}

fun solver3(s: List<Int>) {
    println( s.sum() )
}
