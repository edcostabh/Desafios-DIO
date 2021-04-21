fun main(args: Array<String>) {
    
    val N = readLine()!!.toInt()
    var N1:Int
    var L:String
    var N2:Int
    
    for (i in 1..N) {
        val x = readLine()!!.toString()
        
        // Carrega cada posição da entrada para as variáveis N1 (Numero posição 1), L (Letra do meio) e N2 (Numero posição 2)
        N1 = x.substring(0,1).toInt()
        L  = x.substring(1,2).toString()
        N2 = x.substring(2,3).toInt()
        
        if (N1 == N2) {
            println(N1 * N2)
        } else if (L == L.toUpperCase()) {
            println(N2 - N1)
        } else if (L == L.toLowerCase()) {
            println(N1 + N2)
        } 
    }
}