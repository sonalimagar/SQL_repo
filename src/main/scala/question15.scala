object question15 {
  def main(args: Array[String]): Unit ={
    val age = 15

    if (age < 13 || (age >= 13 && age <= 19)) {
      println("Child or Teenager")
    } else {
      println("Adult")
    }
  }

}
