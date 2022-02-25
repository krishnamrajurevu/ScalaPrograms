object ConsecutiveDuplicateSubList09  extends App {
  var list = List(1,1,1,2,3,3,3,4,5,6,6,6,6,7)
  println(pack(list))
  def pack[A](ls: List[A]): List[List[A]] = {
    if(ls.isEmpty) List(List())
    else {
      var (packed, next) = ls span{_ == ls.head}
      if(next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
}
