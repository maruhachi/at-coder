package kt.beginners

/**
 * @author ykonno.
 * @since 2019/09/04.
 */
fun main(args: Array<String>) {
    val (n, a, b) = readLine()!!.split(" ").map(String::toInt)
    solver5(n, a, b)
}

fun solver5(n: Int, a: Int, b: Int) {
    var ans: Int = 0
    (1..n).forEach {
        var souwa = it.toString().chunked(1).map(String::toInt).sum()
        if (souwa in a..b){
            ans += it
        }
    }
    println(ans)
}