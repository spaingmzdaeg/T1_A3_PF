package main

object DivisoresEnterosEntreDosNumeros extends App {

  def sumatoria(x: Int, y:Int = 1 ): Int ={

    if (y >= x) 0
    if (x % y == 0) y + sumatoria(x,y+1)
    else sumatoria(x,y+1)
  }
  println(sumatoria(24))

}


