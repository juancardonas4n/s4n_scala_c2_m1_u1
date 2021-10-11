
// def fact(n:Int):Int = if (n == 0) 1 else n * fact(n - 1)

def fact(n:Int):Int = n match {
  case 0 => 1
  case n => n * fact(n - 1)
}

// def fact(n:Int) = List.range(1,n+1).foldLeft(1)(_*_) 

// def fact(n:Int) = List.range(1,n+1).foldRight(1)(_*_)

// def fact(n:Int) = {
//   def factp(n:Int,acum:Int):Int = n match {
//     case 0 => acum
//     case n => factp(n-1,n*acum)
//   }
//   factp(n,1)
// }


// def factCps(k:Int=>Int, n:Int):Int = n match {
//   case 0 => k(1)
//   case n => factCps(k(n *), n - 1)
// }
