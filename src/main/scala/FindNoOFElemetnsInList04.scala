object FindNoOFElemetnsInList04 extends App {
  var list = List(1,2,3,4);
  println("length function ", list.length)
  println("using recursion ", recursive(list))
  println("using tail recursion ", tailRecursive(0,list))
  def recursive(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case _ :: tail => 1+ recursive(tail)
    }
  }

  def tailRecursive(result: Int, list: List[Int]): Int = {
    list match {
      case _ :: tail => tailRecursive(result+1, tail)
      case Nil =>result
    }
  }
}
