package tech.dnene.talkref


fun main(args: Array<String>) {
  val myList = mutableListOf<Int>()
  myList.add(1)
  myList.add(2)
  println(myList)

  val myMap = mutableMapOf<Int,String>()
  myMap[27] = "Maharashtra"
  myMap[33] = "Tamilnadu"
  println(myMap[27])
  println(myMap[11] ?: "unknown")
}