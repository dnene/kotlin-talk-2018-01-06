package tech.dnene.talkref

object Casting {
  @JvmStatic
  fun main(args: Array<String>) {
    val str1 = "Hello"
    val str2: String? = null

    /** Any is the supertype of all types */
    val any: Any = str1

    /** "is" is used to do an instance of test */
    println("Is str1 an instance of String: ${str1 is String}")
    println("Is str2 an instance of String: ${str2 is String}")
    println("Is any an instance of String:  ${any is String}")

    /** this works across inheritance hierarchies. */
    val int1 = 5
    println("Is int1 an instance of Number: ${int1 is Number}")

    /** "as" is used to do typecasts and assign to another name */
    val num1: Number = 5 // the concrete type is an int
    val num2 = num1 as Int // this is how you typecast it. Will raise an exception if it is an invalid cast

    /** safe casting  */
    val num3 = "Hello" as? Int
    println(num3) // <-- no exception, just makes it into a null value

    /** There is a subtype of all types - its called Nothing - it represents a value that NEVER exists :) **/
    val result = foo()
  }

  fun foo(): Nothing {
    while(true);
  }
}