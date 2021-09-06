object Main extends App {
  def myCompose[A, B, C] (f: B => C, g: A => B): A => C =
    a => f(g(a))

  val f = (b: Int) => b * 2
  val g = (a: Int) => a + 1

  val composedFn = myCompose(f, g)

  val result = composedFn(1)

  println(s"result=$result")
//   val compositeFunction = (a: Int, b: Int) => a + b
//   val compositeResult = compositeFunction(1, 2)
//   println(s"compositeResult=$compositeResult")

//   val curriedFunction = curry(compositeFunction)
//   val curriedResultA = curriedFunction(1)
//   println(s"curriedResultA=$curriedResultA")
//   val curriedResultB = curriedResultA(2)
//   println(s"curriedResultB=$curriedResultB")
}