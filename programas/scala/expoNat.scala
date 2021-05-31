def potencia(a:Double, n:Int):Double = n match {
  case 0 => 1
  case n => a * potencia(a,n-1)
}

def factorial(n:Int):Int = n match {
  case 0 => 1
  case n => n * factorial(n-1)
}


def expoNat(x:Double):Double = {
  def iExpoNat(x:Double, n:Int, acum:Double):Double = n match {
    case 11 => acum
    case n  => iExpoNat(x, n + 1, acum + (potencia(x,n) / factorial(n).toDouble))
  }
  iExpoNat(x,0,0.0)
}
