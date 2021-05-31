
def raizEntera(n:Int):Int = {
  def iraiz(n:Int, a:Int):Int = {
    val a2 = a * a
    if (a2 > n) 0
    else {
      val r = iraiz(n,2*a)
      val ra = r + a
      val ra2 = ra * ra 
      if (n < ra2) r else ra
    }
  }
  iraiz(n,1)
}
