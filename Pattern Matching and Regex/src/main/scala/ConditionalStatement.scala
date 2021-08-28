object ConditionalStatement {
  def main(args: Array[String]): Unit = {

    var numList = List.range(1,11)
    println(for(i <- numList if i%2 == 0; if i != 4) yield i)
  }
}
