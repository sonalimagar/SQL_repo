object question13 {
  def main(args: Array[String]): Unit = {
    val number = 24

    if (number % 3 == 0 && number % 8 == 0) {
      println(s"$number is divisible by 3 and 8")
    }
    else  {
      println(s"$number is not divisible by 3 and 8")
    }

  }
}
