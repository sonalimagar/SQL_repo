object question21 {
  def main(args: Array[String]): Unit ={
    val num = 15
    if(num % 2 != 0 && num % 4 != 0) {

      println(s"$num is odd and not divisible by 4  ")
    }

    else {
      println(s"$num is either not odd or divisible by 4")
    }
  }
}
