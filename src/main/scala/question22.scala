object question22 {
  def main(args:Array[String]):Unit={
    val num= 15

    if(num% 3 ==0 && num % 5 ==0){
      println(s"$num is divisible by both 3 and 5")
    }
    else {
      println(s"$num is not divisible by both 3 and 5")
    }
  }

}
