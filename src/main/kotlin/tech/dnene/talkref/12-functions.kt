package tech.dnene.talkref

/** lambdas are anonymous functions */
val doubler = { n: Int -> n * 2 }

/** The default input value of a lambda is named a t **/
val printNext: (Int) -> Unit = { println(it+1) }

/** functions are also values with a type Function **/
fun addFunc(a: Int, b: Int) = a + b
val addVal = { a: Int, b: Int -> a + b }

/** functions can have vararg arguments */
fun printEach(vararg str: String) {
  for(s in str) {
    println(s)
  }
}

/** functions can take function values as arguments */
fun doubleComputation(input: Int, computation: (Int) -> Int)  = computation(input) * 2

/** functions can be declared as tail recursive **/

tailrec fun factorial(n: Int, accumulator:Int = 1): Int {
  if (n <= 1) return accumulator
  else return factorial(n - 1, n * accumulator)
}

fun main(args: Array<String>) {
  println(doubler(5))

  println(addFunc(2,3))
  println(addVal(2,3))

  printEach("Hello", "World")
  /** or **/
  val helloWorldArray = arrayOf("Hello", "World")
  printEach(*helloWorldArray) // <-- this is called a spread operator

  /** lambdas can be passed to functions **/
  println(doubleComputation(5, {it + 3}))
  /** If the last argument is a lambda it can be passed differently after ending the round brace earlier */
  println(doubleComputation(5) {it + 3})

  println(factorial(5))
}

