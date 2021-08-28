object Day1 {

  def sum(x : Int, y: Int) : Int ={
    return (x+y)
  }

  def increment(x : Int) : Int = {
    return (x + 1)
  }

  def divisibleByThree(x : Int): Boolean ={
//    if(x % 3 == 0) { println(s"Yes $x is Divisible by 3")}
//    else "Not Divisible"
    (x % 3) == 0
  }



  def main(args: Array[String]): Unit = {

    println(sum(5, 10))

//    println(increment(5))

    println()
    println()
    println()

    var increment = (x : Int) => {x+1}

    println(increment(2))

    var printWorld = () => "Hello World"

//  println(divisibleByThree(6))





    val ListOfNumber = List.range(0, 10)

    ListOfNumber.foreach(n => if(divisibleByThree(n)) println("Num " + n + " is " + divisibleByThree(n)))



    var divByThree = (x : Int) =>{ (x % 3 == 0) }

    println(divByThree(15))

    println( ListOfNumber.filter( x  => x % 3 == 0 ))

    println( ListOfNumber.filter( _% 3 == 0 ))

    var sqOfNum = ListOfNumber
                    .map(x => x*x)
                    .filter(x => x%4 == 0)

    println(sqOfNum)

    var doublNum = ListOfNumber.map(_*2)
    println(doublNum)

println()
    println()
    println()

    println(
      printValue(add, 2, 4)
    )


  }

  def printValue( m : (Int, Int) => Int, x : Int, y: Int ) ={
    m(x, y)
  }

  def add (x : Int, y : Int) ={
    x + y
  }
}


