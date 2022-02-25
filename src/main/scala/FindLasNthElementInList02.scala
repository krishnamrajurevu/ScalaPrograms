object FindLasNthElementInList02 extends App {
  val list = List(1,2,3,4,5,6,7,8,9);
  println("using init ::", usingInit(list))
  println("using init ::", usingMatch(list))
  println("using take right ::", nthElementUsingTakeRight(4, list))
  println(lastNthRecursive(3, List(1,2,3,4,5,6)))

  def usingInit[A](list: List[A]): A = {
    if(list.isEmpty) throw  new NoSuchElementException
    else list.init.last
  }
  def usingMatch[A](list: List[A]): A = {
    list match {
      case h :: _ :: Nil => h
      case _ :: tail => usingMatch(tail)
      case _ => throw new NoSuchElementException
    }
  }

  def nthElementUsingTakeRight[A](n: Int, list: List[A]) = {
    if(n < 0) throw new IllegalArgumentException
    if(n > list.length) throw  new NoSuchElementException
    list.takeRight(n).head
  }

  def lastNthRecursive[A](n: Int, ls: List[A]): A = {
    def lastNthR(count: Int, resultList: List[A], curList: List[A]): A =
      curList match {
        case Nil if count > 0 => throw new NoSuchElementException
        case Nil              => resultList.head
        case _ :: tail        =>
          lastNthR(count - 1,
            if (count > 0) resultList else resultList.tail,
            tail)
      }
    if (n <= 0) throw new IllegalArgumentException
    else lastNthR(n, ls, ls)
  }


}
