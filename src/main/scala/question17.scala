object question17 {
  def main(args: Array[String]): Unit ={
    val age =40

    if(age > 60 ){
      println(" a senior citizen discount")
    }
    else if(age <25){
      println("student discount")
    }
    else {
      println("person is not eligible for both discount")
    }
  }

}
