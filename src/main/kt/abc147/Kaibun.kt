package kt.abc147

/**
 * @author ykonno.
 * @since 2019/12/11.
 */
fun main(args: Array<String>) {
    val s = readLine()!!
    solver(s)
}

fun solver(s: String) {
    // println(s.length)
    var ans = 0
    val rev = s.reversed()
    for( cnt in 0..(s.length / 2).toInt()-1 ){
        if (!s.get(cnt).equals(rev.get(cnt))){
            ans++
        }
        // println("s = " + s.get(cnt) + " , rev = " + rev.get(cnt))
    }
    println(ans)
}