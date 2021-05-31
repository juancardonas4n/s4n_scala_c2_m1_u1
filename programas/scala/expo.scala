def potencia(a:Double,n:Int):Double = n match {
  case 0 => 1.0
  case n => a * potencia(a,n-1)
}

def factorial(n:Int):Int = n match {
  case 0 => 1
  case n => n * factorial(n-1)
}


def expo(x:Double):Double = {
  def iExpo(x:Double,n:Int,acum:Double,veces:Int):Double = {
    val term = potencia(x,n) / factorial(n).toDouble
    val nAcum = acum + term
    val diff = nAcum - acum
    if (n == veces) nAcum else iExpo(x,n+1,nAcum,veces)
  }
  iExpo(x,0,0.0,11)
}

def expo2(x:Double):Double = {
  def iExpo2(x:Double,n:Int,pot:Double,fac:Int,acum:Double,veces:Int):Double = {
    val term = pot / fac.toDouble
    val nAcum = acum + term
    val diff = nAcum - acum
    val npot = x * pot
    val nfac = fac * (n + 1)
    if (n == veces) nAcum else iExpo2(x,n+1,npot,nfac,nAcum,veces)
  }
  iExpo2(x,0,1.0,1,0.0,11)
}

def expo3(x:Double):Double = {
   def iExpo3(n:Int, x:Double, acum:Double):Double = n match {
      case 11 => acum
      case n  => iExpo3(n+1,x,acum + (potencia(x,n) / factorial(n).toDouble))
   }
   iExpo3(0,x,0.0)
}
