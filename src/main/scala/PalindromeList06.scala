object PalindromeList06 extends App {
  var list = List(1,2,3,2,1)
  println("isPalindromeUsingReverse ::", isPalindromeUsingReverse(list))
  println("isPalindromeWithoutPreDefined ::", isPalindromeWithoutPreDefined(list))
  println("isPalindromeStr ::", isPalindromeStr("abcbae"))

  def isPalindromeUsingReverse(list: List[Int]): Boolean = {
    if(list == list.reverse) true else false
  }

  def isPalindromeWithoutPreDefined(list: List[Int]): Boolean = {
    val len = list.length;
    for(i <- 0 until len/2) {
      if(list(i) != list(len-i-1)) return false;
    }
    true;
  }

  def isPalindromeStr(str: String): Boolean = {
    val len = str.length;
    for(i <- 0 until len/2) {
      if(str(i) != str(len-i-1)) return false;
    }
    true;
  }
}
