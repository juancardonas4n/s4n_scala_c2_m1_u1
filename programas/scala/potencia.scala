def potencia(a:Double, n:Int):Double = n match {
  case 0 => 1
  case n => a * potencia(a,n-1)
}
