package main.kt.beginners

fun main(args: Array<String>) {
    val n1 = readLine()!!.toInt()
    solve(n1)
}

fun solve(n1: Int){
    // (ans / 1.08).floor() = n1
    val ans = (n1 / 1.08).toInt()

    // ホントは kotlin.math.* 使えないのでJavaのやつ
    val kouho = Math.floor(ans * 1.08)
    val kouho2 = Math.floor((ans + 1) * 1.08)

    when (n1) {
        kouho.toInt() -> {
            println(ans.toString())
        }
        kouho2.toInt() -> {
            println((ans + 1).toString())
        }
        else -> {
            println(":(")
        }
    }
}