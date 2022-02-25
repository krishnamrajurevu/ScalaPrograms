object EliminateConsecutiveDuplicates08 extends App {
  var list = List('a', 'a', 'a', 'a', 'b', 'b', 'c', 'd', 'd', 'd', 'e', 'f', 'g', 'g', 'g', 'h', 'h', 'i');
  println("compress in recursive ", compressRecursive(list));
  println("compressTailRecursive :: ", compressTailRecursive(Nil, list));

  def compressRecursive[A](list: List[A]): List[A] = {
    list match {
      case head :: tail => head :: compressRecursive(tail.dropWhile(_ == head))
      case Nil => Nil
    }
  }

  def compressTailRecursive[A](result: List[A], list: List[A]): List[A] = {
    list match {
      case head :: tail => compressTailRecursive(head :: result, tail.dropWhile(_== head) )
      case Nil => result.reverse
    }
  }

  def compressFunction[A](list: List[A]): List[A] = {
    list.foldRight(List[A]()){(h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
  }



}
