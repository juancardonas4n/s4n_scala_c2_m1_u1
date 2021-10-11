def incr(n:Int) = n + 1
def decr(n:Int) = n - 1

def sumaRec(a:Int, b:Int):Int = (a,b) match {
  case (0,b) => b
  case (a,0) => a
  case (a,b) => sumaRec(incr(a),decr(b))
}

def misterio(a:Int, b:Int):Int = (a,b) match {
    case (0,b) => 0
    case (a,0) => 0
    case (a,b) => {
      def imisterio(n:Int,b:Int,acum:Int):Int = n match {
	case 1 => acum
	case n => imisterio(n - 1, b, sumaRec(acum, b))
      }
      imisterio(a,b,b)
    }
}

println(misterio(8,2))
