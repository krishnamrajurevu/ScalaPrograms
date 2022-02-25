object Test extends App {
  var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  list.foldRight(List[Int]()) { (r, h) => {println(r, h)
    r :: h}}

  var s = list.splitAt(list.length/2)
  println(s)
  println(list.drop(5))
  var ls = List(List('a', 'b', 'c'), List('d', 'e'), List('f', 'g', 'h'), List('d', 'e'), List('i', 'j', 'k', 'l'), List('m', 'n'), List('o'))

  var r = ls.sortBy(e => e.length)
  println(r)
  println(isPrime2(7))
  println(gcd(36,63))
  def isPrime2(i :Int) : Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i - 1)).exists(x => i % x == 0)
  }

  def gcd(m: Int, n: Int): Int = if (n == 0) m else gcd(n, m % n)



}