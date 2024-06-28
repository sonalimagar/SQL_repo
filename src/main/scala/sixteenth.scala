object sixteenth {
  def main(args: Array[String]): Unit ={
    val number = 25

    if (number % 2 == 0 ) {
      println(s"$number is divisible by  2")
    }

    else if( number % 5 ==0){
      println(s"$number is divisible by 5 ")
    }

    else {
      println(s"$number is divisible by either 2 or 5 ")
    }
  }

}
