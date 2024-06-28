object thirtyone {
  def main(args: Array[String]): Unit ={
    val number = 18

    if(number % 4 == 0 || number % 6 == 0){
      println(s"$number is divisible by either 4 or 6")
    }
    else {
      println(s"$number is not divisible by either 4 or 6")
    }

  }

}
