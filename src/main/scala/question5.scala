object question5 {
  def main(args: Array[String]): Unit = {
    val age = 18
    if (age >= 18 || age >= 16){
      if (age >= 18) {
        println("Person is eligible to vote.")
      }
      if (age >= 16) {
        println("Person is eligible to drive.")
      }
    } else {
      println("Person is not eligible to vote or drive.")
    }


  }

}


// if (age >= 18) {
//      println("Person is eligible to vote.")
//    }
//    else if (age >= 16) {
//      println("Person is eligible to drive but not eligible to vote.")
//    }
//    else {
//      println("Person is not eligible to vote or drive.")
//    }