object Ninth {
  def main(args:Array[String]):Unit={
    val number = 35

    if (number % 5 == 0 && number % 7 ==0) {
      println(s"$number is divisible by both 5 and 7")
    }

    else {
      println(s"$number is not divisible by either 5 or 7")
    }
  }
}
