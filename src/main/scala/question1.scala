import org.apache.spark.SparkContext

object question1 {
  def main(args:Array[String]):Unit={
    val number=14
    if (number > 0 && number % 2 == 0) {
      println("The number is positive and even")
    } else {
      println("The number is not positive and it is odd")
    }

  }

}