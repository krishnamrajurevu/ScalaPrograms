object ReverseList05 extends App {
  var list = List(1,2,3,4);
  println("list ::", usingReverse(list))
  println(("using recursive", usingRecursive(list)));
  println(("usingTailRecursive", usingTailRecursive(Nil, list)))
  def usingReverse(list: List[Int]): List[Int] = {
    list.reverse
  }

  def usingRecursive(list: List[Int]): List[Int] = {
    list match {
      case head :: tail => usingRecursive(tail) ::: List(head)
      case Nil => Nil
    }
  }

  def usingTailRecursive(result: List[Int], list: List[Int]): List[Int] = {
    list match {
      case Nil => result
      case head :: tail => usingTailRecursive(head :: result, tail)
    }
  }
}
