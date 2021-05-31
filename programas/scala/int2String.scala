def int2String(i:Int):List[Char] = {
  if (i != 0) {
    val d = i % 10
    val c = (d + '0').toChar
    int2String(i / 10) :+ c
  }
  else List()
}
