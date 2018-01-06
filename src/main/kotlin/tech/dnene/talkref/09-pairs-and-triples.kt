package tech.dnene.talkref

object PairsAndTriples {
  @JvmStatic
  fun main(args: Array<String>) {
    val myPhone = Pair("Oneplus", "5T")

    /** alternative syntax for declaring a pair */
    val myOtherPhone = "Oneplus" to "3T"

    val myCar = Triple("Skoda", "Octavia", 2007)

    /** You can access them using member properties first, second, third */
    println("My car was made in the year ${myCar.third}")

    /** these can be deconstructed easily as follows **/

    val (myPhoneMake, myPhoneModel) = myPhone
    println(myPhoneModel)

    /** These types are used extensively for storing temporary results and passing them further down the chain
     * or returning multiple values from a function */
  }
}