object question3 {
  def main(args:Array[String]):Unit={
    val number=30
    if(number % 2 != 0 && number % 3 == 0)
      {
        println(s"$number is odd and divisible by 3")
      }
      else{
        println(s"$number is even number")
      }
  }
}



//val number =27
//    if (number % 2 != 0) {  // Check if the number is odd
//      if (number % 3 == 0) {  // Check if the number is  divisible by 3 or not
//        println(s"$number is odd and  divisible by 3")
//      } else {
//        println(s"$number is odd not divisible by 3")
//      }
//    } else {
//      println(s"$number is even")
//    }