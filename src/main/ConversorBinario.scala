package main

object ConversorBinario extends App {

  def convertirBinario(numero: Int): Int = {
    if (numero == 0) 0
    else numero % 2 + 10 * convertirBinario(numero / 2)
  }


  //Prueba
  val n = 17
  println(s"Numero Decimal[$n]: numero binario ["+convertirBinario(n)+"]")
}
