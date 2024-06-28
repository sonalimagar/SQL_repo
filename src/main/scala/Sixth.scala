object Sixth {
  def main(args:Array[String]):Unit={
    val number = 25
    if (number >= 1 && number <= 10) {
       println(s"$number is in range of[1 ,10]")
    }
    else if(number >= 20 && number <= 30){
      println(s"$number is in range[20,30]")
    }
    else {
      println(s"$number not in both range")
    }
  }

}
