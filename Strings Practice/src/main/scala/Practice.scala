object Practice {
  def main(args: Array[String]): Unit = {

    var temp = "Hello World"
    var temp2 = "new"
    println(temp.length)

    println(temp + temp2)

    println(temp.equals(temp2))
    println(temp == temp2)
    println(temp.isBlank)
    println(temp == "")


    var abc =
      """
        |this
        |is
        |a
        |multi line string
        |""".stripMargin

    println(abc)

    var name = "Chris Jericho"
    var salary = 20000.0

    println(s"name is $name and salary is $salary")

    println(f"name is $name%s and salary is $salary%8.2f")



  }
}
