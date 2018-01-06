package tech.dnene.talkref


fun main(args: Array<String>) {
  /** kotlin has immutable collections for array/list/map/set
   * These are actually kotlin immutable interfaces around standard java collections
   * So these can be passed to and from from java classes relatively easily
   */

  val oneToFive = listOf(1,2,3,4,5)
  val cityStates = listOf("Mumbai" to "MH", "Pune" to "MH", "Nasik" to "MH",
      "Vadodara" to "GJ", "Ahmedabad" to "GJ")
  println(cityStates)
  println(cityStates[1].first)

  val cities = setOf("Vadodara", "Ahmedabad", "Surat", "Vadodara")
  println(cities)

  val stateCodes = mapOf(
      "01" to "Jammu and Kashmir",
      "24" to "Gujarat",
      "27" to "Maharashtra",
      "33" to "Tamilnadu")
  println(stateCodes)
  println(stateCodes["27"])

  /** There is a really large number of methods on the collections interface
   * Shown below are just some of the few
   * Most of them work with a lambda function
   */

  /** Iterate without any return value (for side effects) **/
  cityStates.forEach { println(it) }

  /** transform into some other value */
  println(oneToFive.map { it * 2 })

  /** filter out some values based on predicate **/
  println(oneToFive.filter { it % 2 == 0})

  /** groupBy **/
  println(cityStates.groupBy { it.second })

  /** sort **/
  println(oneToFive.sortedBy { 10 - it })

  /** sum **/
  println(oneToFive.sum())

  /** compute sum of squares **/
  println(oneToFive.fold(0) { acc, i -> acc + (i * i)})

  /* create a map based on computed key */
  println(cityStates.associateBy { it.first })
  println(cityStates.associateBy({ it.first }, { it.second }))
}
