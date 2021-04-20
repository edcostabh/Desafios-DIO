fun main(args: Array<String>) {
    //continue a solução
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toDouble()
    var i = 0.00
    
    if ( r <= 2000.00 ) {
    
    } else if ( r <= 3000.00) {
        i = (r - 2000.00) * 0.08
    } else if ( r <= 4500.00 ) {
        i = (1000.00 * 0.08) + ((r - 3000.00) * 0.18)
    } else if (r > 4500.00) {
        i = (1000.00 * 0.08) + (1500.00 * 0.18) + ((r - 4500.00) * 0.28)
    }
    if (i == 0.00) println("Isento") else println("R$ ${i.format(2)}")
}