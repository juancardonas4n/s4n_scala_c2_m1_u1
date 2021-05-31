
// def potencia(a:Double, n:Int):Double = n match {
//   case 1                 => a
//   case n if (n % 2 == 0) => { 
//     val an2 = potencia(a,n / 2)
//     an2 * an2
//   }
//   case n                 => a * potencia(a, n - 1)
// }


// Implementar la función de potencia 
def potencia(a:Double, n:Int):Double = n match {
  case 1 => a
  case n if (n % 2 == 0) => {
    val an2 = potencia(a,n / 2)
    an2 * an2
  }
  case n => a * potencia(a,n-1)
}
