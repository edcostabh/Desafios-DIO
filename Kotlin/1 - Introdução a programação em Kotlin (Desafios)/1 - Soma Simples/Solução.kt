import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)  // faz a leitura da linha
    val a = input.nextInt() // leitura e atribuição do primeiro número à variável "a"
    val b = input.nextInt() // leitura e atribuição do segundo número à variável "b"
    println("SOMA = "+ ( a+b )) // imprime a string "SOMA = " concatenada com a soma das variávies "a" e "b"
}
