object ConsecutiveDupSubListEncodeDirectly13 extends App {
  var list = List(1,1,1,2,3,3,3,4,5,6,6,6,6,7)
  println(encodeDirect(list))
  def encodeDirect[A](ls: List[A]): List[(Int,A)] = {
    if(ls.isEmpty) Nil
    else {
      val (packed, next) = ls span { _ == ls.head }
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }
}
