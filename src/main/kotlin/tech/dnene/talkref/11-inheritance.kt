package tech.dnene.talkref

/** Kotlin also supports interfaces like Java */

interface Interface {
  fun mustImplement()
  /** However it also allows for properties */
  val myInt: Int
  /** but they can also contain some logic */
  fun doubleMyInt() = 2 * myInt
}
/** A class to be inherited from must be declared as open or abstract */

abstract class Parent(val int: Int) {
  /** some methods could be declared as non overridable */
  final fun cannotBeOverridden() { println("I am a subclass of ${Parent::class.java}")}
  /** some methods can be declared as abstract to be overridden by child classes */
  abstract fun abstractMethod(): Unit
}

/** A class can choose to inherit from multiple interfaces but only one class
 * The parent class constructors have to be called immediatelty after the constructor declaration */

class Child(val str: String, int: Int): Parent(int), Interface {
  /** overridden functions must be marked by override keyword */
  override fun abstractMethod() {  println("Abstract called") }

  override fun mustImplement() { println("I had to") }
  override val myInt = int
}