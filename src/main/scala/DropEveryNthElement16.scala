object DropEveryNthElement16 extends App{
  var list = List(1,2,3,4,5,6,7,8,9)
  println(dropRecursive(3, list))
  println(dropTailRecursive(3, list))
  println(dropFunctional(3, list))
  def dropRecursive[A](n: Int, ls: List[A]): List[A] = {
    def dropR(c: Int, ls: List[A]): List[A] = {
      (c, ls) match {
        case (_, Nil) => Nil
        case (1, _ :: tail) => dropR(n, tail)
        case (c, h :: tail) => h :: dropR(c-1, tail)
      }
    }
    dropR(n, ls);
  }

  def dropTailRecursive[A](n: Int, curLt: List[A]): List[A] = {
    def dropR(c: Int, curLt: List[A], resultLt: List[A]): List[A] = {
      (c, curLt)  match {
        case (_, Nil) => resultLt.reverse
        case (1, _ :: tail) => dropR(n, tail, resultLt)
        case (c, h :: tail) => dropR(c-1, tail, h :: resultLt)
      }
    }
    dropR(n, curLt, Nil);
  }

  def dropFunctional[A](n: Int, ls: List[A]) =
    ls.zipWithIndex filter(e => (e._2+1)% n != 0 ) map (_._1)
}
