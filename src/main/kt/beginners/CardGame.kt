package kt.beginners

/**
 * @author ykonno.
 * @since 2019/11/06.
 */
fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)
    solver6(n, a)
}

fun solver6(n: Int, a: List<Int>) {
    var aliceScore: Int = 0
    var bobScore: Int = 0
    n.toString()

    var cards = a.sortedDescending()
    var cnt = 0;
    for (card in cards){
        if (cnt % 2 == 0){
            aliceScore += card
        } else {
            bobScore += card
        }
        cnt++
    }
    println(aliceScore - bobScore)
}
