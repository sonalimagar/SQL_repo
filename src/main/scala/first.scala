import org.apache.spark.SparkContext

object first {
  def main(args:Array[String]):Unit={
    val number=14
    if (number > 0 && number % 2 == 0) {
      println("The number is possitive and even")
    } else {
      println("The number is not possitive and it is odd")
    }

  }

}