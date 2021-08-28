import Array._

object ArrayManupilation {
  def main(args: Array[String]): Unit = {

    var marks = Array(58, 36,98,18,56,95,45)

    var totMark = 0
    marks.foreach(mark => totMark = totMark + mark)

    println(totMark)

    marks.foreach(mark => totMark = totMark + mark)

    println(marks.map(m => m + 10))

//            ^
//            |
//    neechay waala statement equivalent hay ooper walay k

    println(marks.map(_ + 10))

    marks = Array(21, 25, 39, 58, 79, 64, 52, 94, 34)

    var avg = marks.reduceLeft( (x, y) => (x + y)/2 )

    println(avg)


    var avg2 = marks.reduceLeft( (x,y) =>{
      println(s"x is $x, y is $y & avg is : " + (x+y)/2)
      (x+y)/2
    } )

    println(avg2)

    println()
    println()
    println()

//    AVERAGE
    var avg3 = marks.reduceLeft( _/2 +_/2 )
    println(avg3)

//    Total Marks

    println(marks.reduceLeft(_+_))

    println(marks.reduceLeft(_ max _))

    println(marks.reduceLeft( (x,y) => x.max(y) ))
    println(marks.reduceLeft( (x,y) => (x max y)  ))



//             MultiDimensional Array

    var arr = ofDim[Int](3, 3)

//    for(i <- 0 to 2; j <- 0 to i){
//      arr(i)(j)
//    }
//
//
//    for(i <- 0 to 2; j <- 0 to i){
//      arr(i)(j)
//    }


    for(i <- 0 to 2){
      for(j <- 0 to 2){
        arr(i)(j)
      }
    }


    for(i <- 0 to 2){
      for(j <- 0 to 2){
        print(arr(i)(j))
      }
      println()
    }


    println()
    println()
    println()


    arr = ofDim[Int](5, 5)

    for(row <- 0 to 4){
      for(col <- 0 to 4){
        arr(row)(col) = col + 1
      }
    }


    for(row <- 0 to 4){
      for(col <- 0 to 4){
        print(arr(row)(col) + " ")
      }
      println()
    }

    println()
    println()
    println()

    for(row <- 0 to 4){
      for(col <- 0 to 4){
        arr(row)(col) = col + 1
        if(row == col){arr(row)(col) = 1} else {arr(row)(col) = 0}
      }
    }


    for(row <- 0 to 4){
      for(col <- 0 to 4){
        print(arr(row)(col) + " ")
      }
      println()
    }

    println()
    println()
    println()
    println()


    var marks1 = Array(5, 6, 8, 9, 2, 4, 6)
    var marks2 = Array(5, 9, 2, 6, 4, 2, 6)


//    println( marks1 ++ marks2 )
//    println( concat(marks1, marks2) )

    var allMarks = concat(marks1, marks2)

//    println(allMarks.map(x => x))

    allMarks.foreach(println)


  }
}
