
// def int2String(i:Int):List[Char] = {
//   def iInt2String(i:Int):List[Char] = {
//     if (i != 0) {
//       val d = i % 10
//       val c = (d + '0').toChar
//       iInt2String(i / 10) :+ c
//     }
//     else List()
//   }
//   if (i == 0) List('0')
//   else if (i < 0) '-' +: iInt2String(i)
//   else iInt2String(i)
// }

// Pregunta: ¿Qué pasa si la función en la linea int2String(i / 10) :+ c, 
// se cambia por c +: int2String(i / 10)

def int2String(i:Int):List[Char] = {
  if (i != 0) {
    val d = i % 10
    val c = (d + '0').toChar
    c +: int2String(i / 10)
   }
  else List()
}


// Problema 1: Modificar a int2String para trabajar con el 0 y negativos

import scala.math._
def int2String(i:Int):List[Char] = {
  def iInt2String(i:Int):List[Char] = {
    if (i != 0) {
      val d = i % 10
      val c = (d + '0').toChar
      int2String(i / 10) :+ c
    }
    else List()
  }
  if (i == 0) List('0')
  else if (i < 0) '-' +: iInt2String(abs(i))
  else iInt2String(i)
}

