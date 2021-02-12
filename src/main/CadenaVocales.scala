package main

object CadenaVocales extends App {



  def esVocal(c:Char):Int = {
    if (c=='A' || c=='E' || c=='I' ||
      c=='O' || c=='U' || c=='a' || c=='e' || c=='i' ||
      c=='o' || c=='u' ) 1
    else 0
  }

  def contarVocales(cadena: String,n: Int): Int = {
    if (n == 1) esVocal(cadena.charAt(n - 1))
    else contarVocales(cadena,n-1) + esVocal(cadena.charAt(n - 1))
  }
  // PRUEBA
  val cadenaPrueba = "chente_chester"
  println(s"La cadena ' $cadenaPrueba ' contiene "+contarVocales(cadenaPrueba,cadenaPrueba.length)+" vocales")



}
