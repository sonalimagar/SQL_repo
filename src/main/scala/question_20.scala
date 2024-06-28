object question_20 {
  def main(args: Array[String]): Unit = {
    val num= 45

    if(num% 5 ==0 && num % 9 ==0){
      println(s"$num is multiple of both 5 and 9")
    }
    else {
      println(s"$num is not multiple of both 5 and 9")
    }

  }
}


