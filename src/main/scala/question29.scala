object question29 {
  def main(args: Array[String]): Unit = {
    val num = 14
    if (num > 0 && num % 7 != 0) {
      println(s"$num is a positive number and not divisible by 7")
    } else {
      println(s"$num is either not a positive number or divisible by 7")
    }
  }
}
