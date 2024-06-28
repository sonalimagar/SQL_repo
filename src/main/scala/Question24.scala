object Question24 {
  def main(args: Array[String]): Unit ={
    val number = 9

    if (number % 2 == 0 || number % 3 == 0) {
      println(s"$number is divisible by either 2 or 3")
    }
    else {
      println(s"$number  is not divisible by either 2 or 3")
    }
  }

}
