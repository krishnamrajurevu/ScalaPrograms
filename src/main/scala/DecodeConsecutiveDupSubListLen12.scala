object DecodeConsecutiveDupSubListLen12 extends App {
  var list = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'd'), (1, 'e'), (4, 'f'));
  println(decode(list))
  def decode[A](ls: List[(Int, A)]): List[A] = {
    ls.flatMap{ e => List.fill(e._1)(e._2) }
  }
}
