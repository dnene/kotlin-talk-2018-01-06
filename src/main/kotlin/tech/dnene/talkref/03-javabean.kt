package tech.dnene.talkref

class Address constructor(city: String) {
  // PS: No one except in rare cases writes code this way .. its almost always like in Address2
  var _city: String = city
  var city
    get() = _city
    set(value) {
      _city = value
    }
}

class Address2(var city: String)

fun main(args: Array<String>) {
  /** look - no new keyword **/
  val address = Address("Pune")
  println(address.city)

  /** I can mutate a var inside a val */
  address.city = "Mumbai"
  println()
}