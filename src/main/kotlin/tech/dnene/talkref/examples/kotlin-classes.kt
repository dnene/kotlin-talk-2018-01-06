package tech.dnene.talkref.examples

object StaticObject {
  @JvmStatic fun foo() { println("Foo is called")}
  @JvmField val maxInt = Int.MAX_VALUE
}

data class Car(val make: String, val model: String, val year: Int) {
  fun isMakeIn(set: Set<String>) = set.contains(make)
}