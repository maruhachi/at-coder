package kt.beginners

/**
 * @author ykonno.
 * @since 2019/11/06.
 */
fun main(args: Array<String>) {
    val s = readLine()!!
    solver9(s)
}

fun solver9(s: String) {
    val kouhoChar = listOf("dreamer", "dream", "eraser","erase")
    var hit = false
    var inStr = s
    while(true){
        hit = false
        for ( kouho in kouhoChar){
            if (inStr.endsWith(kouho)){
                inStr = inStr.dropLast(kouho.length)
                if (inStr.isEmpty()){
                    println("YES")
                    return
                }
                hit = true
            }
        }
        if (!hit){
            println("NO")
            return
        }
    }

    // む～り～
    println("NO")
}