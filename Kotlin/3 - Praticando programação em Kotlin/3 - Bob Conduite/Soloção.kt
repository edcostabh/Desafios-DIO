import java.util.Scanner

fun main() {
    var soma:Int
    val N = readLine()!!.toInt()

    for (i in 1..N) {
        val list = readLine()!!.split(" ").map { it.toInt() }

        if (list.size == 2){
            soma = list[0] + list[1]
            println(soma)
        }
    }
}