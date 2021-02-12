package main

object Sumatoria extends App{

  def sumatoria(limiteInicial: Int, limiteFinal: Int): Int= {
  {
    if (limiteInicial == limiteFinal)
      limiteFinal
    else
      limiteInicial + sumatoria(limiteInicial+1,limiteFinal)
  }

  }
  // Prueba
  val li = 0
  val lf = 3

  println(s"Sumatoria entre [$li] y [$lf] = "+sumatoria(li,lf))


}
