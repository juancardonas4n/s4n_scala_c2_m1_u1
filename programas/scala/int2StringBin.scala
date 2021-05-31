// Ejercicio 2. Implemente una función llamada int2StringBin que recibe un entero y retorna una lista de caracteres con valores 
// binarios

def int2StringBin(i:Int):List[Char] = {
  if (i != 0) {
    val d = i % 2
    val c = (d + '0').toChar
    int2StringBin(i / 2) :+ c
  }
  else List()
}
