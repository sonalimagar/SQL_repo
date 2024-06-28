object Question26 {
  def main(args: Array[String]): Unit ={
    val age = 70
    val is_new_cust = false
    if(age > 65 && !is_new_cust){
      println(" person is senior citizen discount and not new customer")
    }
    else {
      println("person is new customer")
    }
  }

}
