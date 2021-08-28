object ListPractice {
  def main(args: Array[String]): Unit = {
    val colors = List("Red", "Green", "Yellow")

    val matrix = List(
        List(1,2,3),
        List(4,5,6),
        List(7,8,9)
    )

    println(matrix)

    val color = "Red" :: ("Green" :: ("Yellow" :: Nil))

    val usingTO = (1 to 10).toList
    println(usingTO)

    println()
    println()
    println()

    println(colors.size)
    println(colors.length)

    val makingStr = colors.mkString(", ")
    println(makingStr)


    println(
      colors.map(x => s"The Colors are $x")
    )

    println(
      colors.mkString("The Colors are ", ", ", " Choose these")
    )

//    colors = colors +: "Blue"  -------> we cant assign like this because of val. to append use the Operator (:+)

        val newColors : List[String] = colors :+ "Blue" :+ "Blue"

    println(newColors)

//        For Distinct Value

    println(
      newColors.distinct
    )


    for(col <- newColors.distinct){
      println(col)
    }


//    Using Filter

    println
    println
    println

    println(
      newColors.distinct.filter(_.size < 5)
    )

    println(
      newColors.distinct.filter(_=="Green")
    )


    println(
      newColors.distinct.filter(_.size < 5).filter(_=="Green")
    )


    println(
      newColors.distinct.filter(_.contains("e"))
    )

    println(
      newColors.distinct.exists(_== "Blue")
    )


    println(
      newColors.distinct.filter(
        x => x.contains("e")
      )
    )

//    val fillCol = for (col <- 0 to 5){
//      List.fill(5)(col)
//    }

//    val fillCol = List.fill(5) ( for(col <- 0 to 5){return col} )

//    println(fillCol)



//              TABULATE


//    val numbers = List.tabulate(5)(_ + 1)
//    println(numbers)

    val car1 = cars("Mercedes", 50000)
    val car2 = cars("BMW", 80000)
    val car3 = cars("Jaguar", 70000)

    val listOfCars = List(
      car1, car2, car3
    )

    println(listOfCars)

    println()
    println()

//          SORT BY(x)

    println(
      listOfCars.sortBy(car => car.cost).reverse
    )

//          SORT With (x, y)


    val numbers = List(0, 1, 2, 5, 9, 1, 25, 18, 16)

    println(
      numbers
          .filter(x => x % 2 == 0)
          .sortWith( (x, y) => x < y)
    )

    listOfCars.sortWith(sortingLogic)



  }

  def sortingLogic(c1 : cars, c2 : cars) = {
    println(c1.cost)
    println(c1.name)
    println(c2.cost)
    println(c2.name)
    c1.cost > c2.cost
  }

}

case class cars(val name : String, val cost : Int)
