package kt.beginners

import kotlin.math.max
import kotlin.system.exitProcess

/**
 * @author ykonno.
 * @since 2019/11/06.
 */
fun main(args: Array<String>) {
    val (n, y) = readLine()!!.split(" ").map(String::toInt)
    solver8(n, y / 1000)
}

fun solver8(n: Int, y: Int) {
    // yukichi*10 + higuchi*5 + noguchi = y
    // yukichi + higuchi + noguchi = n

    // 各札の0枚～の組み合わせを見ていくイメージ

    // 諭吉のありえる枚数上限
    if (n < y / 10) {
        // 諭吉の最大枚数で足りなきゃおしまい
        println("-1 -1 -1")
        return
    }

    for (yukichi in y / 10 downTo 0) {
        // println("諭吉が${i}枚の場合")
        for (higuchi in n - yukichi downTo 0) {
            // println("樋口が${higuchi}枚の場合、かつ野口は${n - yukichi - higuchi}枚")
            if (yukichi * 10 + higuchi * 5 + n - yukichi - higuchi == y) {
                println("${yukichi} ${higuchi} ${n - yukichi - higuchi}")
                return
            }
        }
    }
    println("-1 -1 -1")
}