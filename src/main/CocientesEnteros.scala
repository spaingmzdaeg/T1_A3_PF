package main

object CocientesEnteros extends App {

  /* otra forma
  def obtenerCociente(a: Int, b: Int): Int = {
    if (a - b <= 0) 1
    else obtenerCociente(a - b,b) + 1

  }*/

  def obtenerCociente(a: Int, b: Int): Int = {
    if (a < 0) -obtenerCociente(-a,b)
    if (b < 0) -obtenerCociente(a,-b)
    if (a < b)  0
    else 1 + obtenerCociente(a - b,b)
  }

  // PRUEBA
  val dividendo = 16
  val divisor = 2
  println(s"El Cociente entero del dividendo:$dividendo y el divisor:$divisor es:"+obtenerCociente(
    dividendo,divisor
  ))


}
