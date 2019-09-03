package kt.beginners

/**
 * @author ykonno.
 * @since 2019/09/03.
 */
fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val (b, c) = readLine()!!.split(" ")
        .map(String::toInt)
    val s = readLine()!!
    solver1(a, b, c, s)

}

fun solver1(a: Int, b: Int, c: Int, s: String) {
    print(a + b + c)
    println(" " + s)
}