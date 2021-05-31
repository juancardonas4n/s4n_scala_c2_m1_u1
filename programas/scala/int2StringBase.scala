// Ejercicio 3. Implemente la función la siguiente firma.

def int2StringBase(i:Int,b:Int):List[Char] = {
  if (i != 0) {
    val d = i % b
    val c = (d + '0').toChar
    int2StringBase(i / b, b) :+ c
  }
  else List()
}






// Ejercicio 4. Utilizando la función int2StringBase reescriba las siguiente funciones:

def int2String(i:Int) = int2StringBase(i,10)

def int2StringBin(i:Int) = int2StringBase(i,2)
