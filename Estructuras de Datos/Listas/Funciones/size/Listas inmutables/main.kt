fun main(){
    //Algoritmo que devuelva el tamaño de la lista según los elementos que contenga, recuerde utilizar la función size() y en este ejercicio deberá hacerlo con ayuda de listas inmutables.
    //Creación de listas inmutables
    //Con números
  
    //Función size 
    val numeros = listOf(1,2,3,4, 5,6,7,8,9,10)
  val tamañoLista = numeros.size // Devuelve el tamaño de la lista, según el número de elementos que se encuentren
  println("El tamaño de esta lista es de: $tamañoLista")
  
  //Con String
      val nombres = listOf("Martha", "Paula", "Nicolás", "Andrés", "Valentina")
  
    //Función size 
  val tamañoDeLista = nombres.size // Devuelve el tamaño de la lista, según el número de elementos que se encuentren
  println("El tamaño de esta lista es de: $tamañoDeLista")
  }