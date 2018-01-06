package tech.dnene.talkref

/** This is one of the most powerful capabilities of Kotlin **/
object Nullability {
  @JvmStatic
  fun main(args: Array<String>) {
    /** a type name by default indicates a non-nullable variable */
    val str1: String = "hello"
    // var str2: String = null <-- won't compile

    /** a question mark at the end of a type name indicates it is a nullable type .. THATS A DIFFERENT TYPE */
    val str2: String? = null

    /** Most methods on non-nullable types cannot be invoked on nullable types - the compiler won't allow it */
    // println(str2.length) <-- won't compile

    /** you have to do a null check and the compiler treats the value as non nullable in the if block **/

    if (str2 != null) {
      println(str2.length)
    }

    /** but not outside the block */
    // println(str2.length) <-- won't compile

    /** kotlin also has the elvis operator ..
      which is kind of the default value if null
      but also can be used to chain computations in case the earlier ones return null */

    val str3 = str2 ?: "default"

    /** what if you want to tell the compiler it certainly is a non null */
    val str4: String = str2!! // <-- this will result in an exception because it is actually a null

    /** There is a stdlib function called let which I use frequently when dealing with nullable types */
    str2?.let { str2IfNotNull ->
      // do something here
      println(str2IfNotNull)
    }

  }

}