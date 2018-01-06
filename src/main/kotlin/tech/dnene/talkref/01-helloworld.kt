package tech.dnene.talkref

class HelloWorld {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      println("Hello World!")
    }
  }
}

// Array looks a little different. No void. - its a Unit which is a type (not an absence of)
// packages are sort of java like but not quite
// no requirement of one class per file
// singleton classes are objects
// static members go into companion object
// kotlin-stdlib gets linked in (11K of extra jar size). This is imported by default

