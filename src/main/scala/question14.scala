object question14 {
  def main(args: Array[String]): Unit = {
    val num = -6
    if(num > 1){
      if (num % 2 == 0){
        println(s"$num is possitive and even")
      }
      else {
        println(s"$num is not even")
      }
    }
    else {
      println(s"$num is negetive number")
    }
  }

}
