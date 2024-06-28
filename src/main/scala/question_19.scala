object question_19 {
  def main(args: Array[String]): Unit ={
    val num= 27

    if(num% 3 ==0 && num % 7 ==0){
      println(s"$num is multiple of both 3 and 7")
    }
    else {
      println(s"$num is not multiple of both 3 and 7")
    }
  }

}
