object ConsecutiveDupSubListLength11 extends App{
  var list = List(1,1,1,2,3,3,3,4,5,6,6,6,6,7)
  println(encodeModify(list))
  println(encodeModified2(list))
  def encodeModified2[A](ls: List[A]): List[Either[A, (Int, A)]] =
    encode(ls) map { t => if (t._1 == 1) Left(t._2) else Right(t) }

  def encodeModify[A](ls: List[A]): List[Any] = {
    encode(ls).map{e => if (e._1 == 1) e._2 else e }
  }
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }

  def pack[A](ls: List[A]): List[List[A]] = {
    if(ls.isEmpty) List(List())
    else {
      var (packed, next) = ls span{_ == ls.head}
      if(next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
}
