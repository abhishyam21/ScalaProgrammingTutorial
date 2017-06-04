/**
  * Created by Rachana Rao on 6/4/2017.
  */

/**
  * Higher Order Functions are those functions
  * which work on other functions
  */
object HigherOrderFunctions {
  def main(args: Array[String]) {
    function1(5)
  }

  def function1(a:Int ): Unit ={
    println(a)
    println(multiplyBy2(a))
  }

  /**
    * function to multiply a number by 2
    */
  def multiplyBy2(a: Int) = {
    a*2
  }
}
