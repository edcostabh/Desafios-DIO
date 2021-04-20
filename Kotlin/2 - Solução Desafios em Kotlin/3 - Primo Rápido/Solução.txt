fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    
    for (i in 0 until n) {
        var x = readLine()!!.toInt()
        val prime = isPrime(x)
    }
}

fun isPrime(num: Int): Boolean {
    if ((num % 2) == 0 && num !== 2 || num == 1) {
        print("Not Prime\n")
        return false
        
    } else {
        print("Prime\n")
        return true
    }
}