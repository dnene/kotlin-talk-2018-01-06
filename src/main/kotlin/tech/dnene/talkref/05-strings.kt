package tech.dnene.talkref

import java.util.*

object StringStuff {
  @JvmStatic
  fun main(args: Array<String>) {
    /** Strings are actually java strings under the covers but have many more methods on them */
    val str1 = "the quick brown fox jumped over the lazy dog"

    println(str1.capitalize())
    println(str1.slice(4..7))
    println("  hello    world    ".trim())

    /** The String class is far more powerful .. but I can't demonstrate many other features yet */

    /** String templates are also pretty powerful */
    val today = "Today is ${Date().toGMTString()}"
    println(today)

    /** String templates can span multiple lines */
    val paragraph = """This has been a wonderful day so far
      given the wonderful audience out here"""
    println(paragraph)
  }
}