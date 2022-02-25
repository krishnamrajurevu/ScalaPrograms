object PatternNestedLists07 extends App {
  var list = List(List(1, 1), 2, List(3, List(5, 8)));
  var list1 = List(List(1,2), List(3), List(5,6,7))
  println("platterns ", flatternList(list));
  println(list1.flatten)

  def flatternList(list: List[Any]): List[Any] = list map {
    case ms: List[_] => flatternList(ms)
    case e => List(e)
  }
}
