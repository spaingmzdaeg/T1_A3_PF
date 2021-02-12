package main

object Factorial extends App{

  // Factorial
  def factorial(n:Int):Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
  // Prueba
  val numero = 5
  println(s"factorial de [$numero] = "+factorial(5))


}
