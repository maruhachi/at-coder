package kt.beginners

/**
 * @author ykonno.
 * @since 2019/11/06.
 */
fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    var a: MutableList<Int> = arrayListOf()
    for (i in 1..n){
        a.add(readLine()!!.toInt())
    }
    solver7(a)
}

fun solver7(a: List<Int>) {
    var mochi = a.distinct()
    println(mochi.size)
}
