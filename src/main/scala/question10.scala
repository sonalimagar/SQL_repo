object Tenth {
  def main(args: Array[String]): Unit = {
    val number = -8

    if (number >= 0) {
      if (number % 2 == 0) {
        println(s"$number is non-negative and even")
      } else {
        println(s"$number is non-negative but odd")
      }
    } else {
      println(s"$number is negative")
    }
  }
}
