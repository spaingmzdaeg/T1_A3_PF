package main

object Divisores extends App{

  def divisores (n: Int, i: Int):AnyVal = {
    if (i <= n) {
      if (n % i == 0){
        print(i + " ")
      }
      divisores(n,i+1)
    }
  }

  // Prueba
  val numero = 16
  println(s"Divisores de $numero")
  divisores(numero,1)


}
