object RockTheJVMPractice {

  def main(args: Array[String]): Unit = {

    val numberList = List(1,2,3,42)
    val mustHaveThree = numberList match {
      case List(_, _, 3, frthElement) => s"the 3rd is 3 now the forth is $frthElement"
    }

    println(mustHaveThree)

    val printHeadTail = numberList match {
      case head :: tail => s"Head is : $head and tail is $tail"
    }
    println(printHeadTail)

  }
}
