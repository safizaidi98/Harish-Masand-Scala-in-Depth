import java.util.Date

object Day3 {

  def main(args: Array[String]): Unit = {

    var date = new Date()

    log(date, "Hello")

    Thread.sleep(2000)
    log(date, "Hello1")

    Thread.sleep(2000)
    log(date, "Hello2")


  }

  def log(date : Date, msg : String) = {
    println(msg + date)
  }
}
