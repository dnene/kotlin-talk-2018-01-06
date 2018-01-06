package tech.dnene.talkref

import java.util.*

object SimpleDifferences {
  @JvmStatic
  fun main(args: Array<String>) {
    /** kotlin has equivalent for primitive types
    // variables are declared using keyword var
    // Semicolon not mandatory and rarely used */

    var x: Int = 5
    var x2: Long = 5L
    var x3: Short = 5
    var x4: Float = 5f
    var x5: Double = 5f.toDouble()

    /** differences
    // - starts with var/val
    // - type follows name separated by a colon */

    var y: Int = x + 2

    /** you can omit the type if the compiler can infer it */

    var z = 99

    /** you can declare final values also */

    val name: String = "Dhananjay"
    // name="nene" - won't compile since it is a val / final

    /** Kotlin has string templates */
    val greeting = "Hello ${name}"
    println(greeting)
  }

  /** methods are declared using keyword fun (as are functions which we will see later) */
  fun greet() {
    println("Hello World")
  }

  /** method arguments do not have val/vars - they are always vals */
  fun greet(name: String) {
    // name = "foo" - won't compile
    println("Hello ${name}!")
  }

  /** method arguments can also have default values */

  fun greetDefault(name: String = "World") {
    println("Hello ${name}!")
  }
  /** methods can return values */

  fun today(): Date {
    return Date()
  }

  /** methods can also be written as expressions
   * This is referred to as block bodies vs expression bodies
   * return types can be compiler inferred with expression bodies */

  fun today2() = Date()
  fun add(a: Int, b: Int) = a + b

  /** kotlin has if conditions */

  fun checkNumber(n: Int) {
    if (n % 2 == 0) {
      println("Even number")
    }
  }

  /** it also has if - expressions. these always return a value */
  /** The expression below is also the Kotlin equivalent of ternary operator */
  fun isOdd(n: Int) = if (n % 2 == 0) false else true

  /** There are while loops */
  fun loopDownTo(n: Int) {
    var counter = n
    while(counter > 0) {
      println("Count: ${counter}")
      counter--
    }
  }

  /** for loops are different */
  fun forLoop(n: Int) {
    for (counter in 0..n-1) {
      println("Counter is ${counter}")
    }
  }

  /** Note .. functions not returning a value have a return type of Unit which is a singleton type */
  fun singleton(): Unit {
    return Unit
  }
}