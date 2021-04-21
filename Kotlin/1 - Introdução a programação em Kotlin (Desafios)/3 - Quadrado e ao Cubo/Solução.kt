fun main(args: Array<String>) {
    //insira as variaveis corretamente
    var r = 1
    for (i in r..readLine()!!.toInt()) {

        println("$r ${ r * r  } ${ r * r * r }") 

        r += 1
    }
}