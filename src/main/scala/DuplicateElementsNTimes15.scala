object DuplicateElementsNTimes15 extends App {
  var list = List(1,2,3,4,5)
  println(duplicate(5, list))
  def duplicate[A](num: Int, ls: List[A]): List[A] = {
    ls.flatMap(e => List.fill(num)(e))
  }
}
