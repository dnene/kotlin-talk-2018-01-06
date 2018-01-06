package tech.dnene.talkref.examples

import java.util.regex.Pattern

open class LuhnModN(val charRange: String) {
  val codePoints: Map<Char, Int> = charRange.mapIndexed { index, c -> c to index }.toMap()
  val cpToChars = codePoints.map { it.value to it.key }.toMap()
  val charCount: Int = charRange.length
  val divisor = charCount

  fun checkDigit(str: String) = (cpToChars[((divisor - (computeSum(str) % divisor)) % divisor)]!!)

  fun computeSum(str: String): Int {
    val odd = str.filterIndexed { i, c -> i%2 == 0 }.map { codePoints[it]!!  }
    val even = str.filterIndexed { i, c -> i%2 == 1 }.map { codePoints[it]!! * 2 }
    return (even + odd).map { (it / charCount) + (it % charCount) }.sum()
  }

  open fun validate(str: String) = checkDigit(str.dropLast(1)) == str.last()
}

object GSTINValidator: LuhnModN("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
  val gstinPattern = Pattern.compile("[0-9]{2}[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}[1-9A-Za-z]{1}[Z]{1}[0-9a-zA-Z]{1}")
  override fun validate(str: String) = gstinPattern.matcher(str).matches() && super.validate(str)
}

fun main(args: Array<String>) {
  val isValid = GSTINValidator.validate("99ZZZZZ9999Z9ZP")
  println(isValid)
}
