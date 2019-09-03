package kt.beginners

/**
 * @author ykonno.
 * @since 2019/09/03.
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ")
        .map(String::toInt)
    solver2(a, b)
}

fun solver2(a: Int, b: Int) {
    if (a % 2 == 0 || b % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}
