package tech.dnene.talkref

/** Data classes in kotlin generate helper classes with overridden implementations for isEqual, toString and hash
    and also provide a helpful copy method */

data class Phone(val make: String, val model: String)

object Dataclasses {
  @JvmStatic
  fun main(args: Array<String>) {
    val oneplus3T = Phone("Oneplus", "3T")
    println(oneplus3T)
    val oneplus5T = oneplus3T.copy(model="5T")
    println(oneplus5T)
  }
}