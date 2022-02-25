object DuplicateElements14 extends App{
  var list = List(1,2,3,4,5)
  println(duplicate(list))
  def duplicate[A](ls: List[A]): List[A] = {
    ls.flatMap(e => List(e,e))
  }
}
