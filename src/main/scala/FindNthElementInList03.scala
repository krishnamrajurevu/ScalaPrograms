object FindNthElementInList03 extends App{

  println(nthElementInList(4, List(1,2,3,4,5)))
  println(nthRecursive(5, List(1,2)))
  def nthElementInList(n: Int, list: List[Int]): Int = {
    if(n >= 0 && n < list.size) list(n);
    else throw new NoSuchElementException
  }

  def nthRecursive(n: Int, list: List[Int]): Int = (n, list) match {
    case (0, h :: tail) => h
    case (n, h :: tail) => nthRecursive(n-1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}
