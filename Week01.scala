
def max(xs: List[Int]): Option[Int] = xs match {
  case Nil => None
  case List(x: Int) => Some(x)
  case x :: y :: tail => max( (if (x > y) x else y) :: tail )
}
