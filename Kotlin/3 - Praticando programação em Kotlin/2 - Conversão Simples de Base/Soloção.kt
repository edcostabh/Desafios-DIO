fun main(args: Array<String>) {
	
	var s : String
	var n : Int
	val r = """x.*""".toRegex()
	var valor = true
	
	while(valor) {
	    val s = readLine()!!.toString()
	    
	    if (s.contains(r)) {
	        val remover = s.removeRange(0,2)
          val result: Int = remover.toInt(16)
    
          println(result.toString())
	    } else if (s.toInt() > 0) {
	        val decimal = Integer.toHexString(s.toInt()).toUpperCase()
          val decimalCompleto = "0x$decimal"
	      
	        println(decimalCompleto)
	    } else {
	        valor = false
	    }
	}
}