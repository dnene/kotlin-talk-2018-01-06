package tech.dnene.talkref


object Classes {

}

/** Kotlin has a notion of primary and second constructors
 *  The primary constructor is defined immediately after the class name
 */
class MyClass constructor(val str: String, val int: Int) {

  /** But you can have a secondary constructor as well */
  constructor(str: String): this(str,99) {
    // do something .. this body is optional
  }

  /** a class has init blocks as well which are executed when it gets instantiated ** */
  init {
    println("another ${this.javaClass} just got instantiated")
  }

  /** static methods and variables are declared using what is called a companion object **/
  companion object {
    val THIS_IS_A_CONSTANT = 99
    fun thisIsAStaticMethod() {
      println("Just invoked a static method")
    }
  }

}