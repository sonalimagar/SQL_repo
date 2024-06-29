object Fourth {
  def main(args: Array[String]): Unit = {
    val number = 18

    if (number % 4 == 0) {
      println(s"$number is divisible by 4")
    }
    else if (number % 6 == 0) {
      println(s"$number is divisible by 6")
    }
    else {
      println(s"$number is not divisible by either 4 or 6")
    }
  }
}

