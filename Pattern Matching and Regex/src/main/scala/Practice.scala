import scala.util.matching.Regex

object Practice {
  def main(args: Array[String]): Unit = {

    def MP(x : Int) = {
      x match {
          case 1 => "one"
          case 2 => "two"
          case 3 => "three"
          case _ => "none"
      }
    }

    def MP1(x : Any) = {
      x match {
        case 1 => "one"
        case 2 => "two"
        case "one" => "three"
        case "three" => "four"
        case _ => "none"
      }
    }


    println(MP1("three"))

    val mercedes = Car("Mercedes", 500000)
    val bmw = Car("BMW", 600000)
    val jaguar = Car("Jaguar", 700000)

    for (car <- List(mercedes, bmw, jaguar)){
      car match{
        case Car("Mercedes", 500000) => println("the car is Mercedes")
        case Car("BMW", 600000) => println("the car is BMW")
        case Car("Jaguar", 700000) => println("the car is Jaguar")
      }
    }


    var pattern = new Regex("Hello")
    var stringtoFind = "Hello World crazy people Hello"

    println(pattern findFirstIn(stringtoFind))
    println((pattern findAllIn(stringtoFind)).mkString(", "))

    println(pattern findAllMatchIn(stringtoFind))

    pattern = "[0-9]+".r
    stringtoFind = "the boy age is 15 and age is 19"

    println((pattern findAllIn(stringtoFind)).mkString(", "))

    var abc = (pattern findAllIn(stringtoFind)).toArray
    println(abc)

    println(pattern.findAllIn(stringtoFind).toList)

    pattern = "HELLO".r
    println( pattern findFirstIn(stringtoFind) getOrElse("No Match Found") )

    pattern = "(H|h)ello".r
    stringtoFind = "Hello how are you? hello say something"

    println(
      pattern.findAllIn(stringtoFind) foreach(w => println(w))
    )

    println(
      pattern findAllIn stringtoFind foreach(w => println(w))
    )


    stringtoFind = "Hello i Able to do it, abl11 able able0"
    pattern = "abl[ae]\\d+".r

    println(
      pattern findAllIn(stringtoFind) toList
    )


    pattern = "abl\\D\\d+".r

   println(
     pattern findAllIn(stringtoFind) toList
   )

    pattern = "abl\\D\\d*".r

    println(
      pattern findAllIn(stringtoFind) toList
    )

    pattern = "[Aa]bl[a-z]*\\d*".r

    println(
      pattern findAllIn(stringtoFind) toList
    )
















  }
}

case class Car(name : String, cost : Int)
