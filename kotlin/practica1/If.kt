fun main()
{
    val fecha = Date() 
    val hoy = if (fecha.year == 2019) true else false

    val edad = 20 if(edad >= 20) {   println("eres mayor de edad") 
} 
    else 
    {  
         println("aun eres menor") 
        } 
         val calificacion=61 
         when(calificacion) 
         {   in 10..20 -> println("hay que motivarse por completo")   
         in 30..50 -> println("demuestra un poco mas de trabajo")  
          in 50..59 -> println("por poco")   60 -> println("estuvo peligroso esta operacion") 
            in 61..80 -> println("sigamos adelante")   in 80..100 -> println("Excelente resultado")  
             !in 1..100 -> println("no conozco ese resultado")  
              else -> println("sigo sin conocer esto") 
              //while 
              while (true) 
              {  
                   println("Esto se imprimirá por un largo tiempo!") 
                }
                val array = arrayOf("a", "b", "c") 
                for (i in array.indices) 
                {  
                     println(array[i]) 
                    } 
                    for (i in 6 downTo 0 step 2) 
                    {   
                        println(i) 
                    }
                    
}