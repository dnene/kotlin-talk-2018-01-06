package tech.dnene.talkref

object ArrayStuff {
  @JvmStatic
  fun main(args: Array<String>) {
    /** arrays are expressed as Array<T> and instantiated using arrayOf(...) */

    val oneToFive = arrayOf(1,2,3,4,5)
    for (index in 0..4) {
      println(oneToFive[index])
    }

    /** Yet another way to iterate through an array */
    for (item in oneToFive) {
      println(item)
    }

    /** special arrays for java interop with arrays of primitives */
    val oneToFour = intArrayOf(1,2,3,4)
    val oneToFiveAnotherWay = oneToFive.toIntArray()


    /** you also have many emptyArray functions */
    val empty = emptyArray<Int>()
  }
}