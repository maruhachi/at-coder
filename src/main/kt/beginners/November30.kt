package main.kt.beginners

fun main(args: Array<String>) {
    val m1 = readLine()!!.split(" ").map(String::toInt)[0]
    val m2 = readLine()!!.split(" ").map(String::toInt)[0]
    solver5(m1, m2)
}

fun solver5(m1: Int, m2: Int) {
    var result = if( m1 == m2) 0 else 1
    print(result)
}