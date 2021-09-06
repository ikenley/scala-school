object Main extends App {
  def curry[A, B, C] (f: (A, B) => C) : A => (B => C) =
     (a: A) => (b: B) => f(a, b)
  
  val compositeFunction = (a: Int, b: Int) => a + b
  val compositeResult = compositeFunction(1, 2)
  println(s"compositeResult=$compositeResult")

  val curriedFunction = curry(compositeFunction)
  val curriedResultA = curriedFunction(1)
  println(s"curriedResultA=$curriedResultA")
  val curriedResultB = curriedResultA(2)
  println(s"curriedResultB=$curriedResultB")
}