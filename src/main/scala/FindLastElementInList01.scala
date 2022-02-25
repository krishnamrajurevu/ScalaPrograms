object FindLastElementInList01 extends App {

  // Basic one
  var list1 = List(1, 1, 2, 3, 5, 8);
  println(findLastElement(list1))
  def findLastElement(list: List[Int]): Int = {
    list.last
  }

  // Any type
  var list2 = List("xyz", 1, 2, 3, 5, "abc");
  println(lastBuiltin(list2))
  def lastBuiltin[A](ls: List[A]): A = ls.last

  // Recursive
  println(lastRecursive(List(1,2)));
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }



}
