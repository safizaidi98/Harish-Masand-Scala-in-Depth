

object ImplicitClassPractice {
  def main(args: Array[String]): Unit = {

    implicit class StringFuncClass(s : String){
      def firstChar(): String = return s.substring(0,1)
    }

    var newStr = "Hello World"
//    var firChar = new StringFuncClass(newStr)
//    println(firChar.firstChar())

    println(newStr.firstChar())



  }
}



