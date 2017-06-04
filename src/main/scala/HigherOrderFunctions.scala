/**
  * Created by Rachana Rao on 6/4/2017.
  */

/**
  * Higher Order Functions are those functions
  * which work on other functions
  */
object HigherOrderFunctions {
  def main(args: Array[String]) {
    function1(5.345, multiplyBy2)
    anonymousFunctions()
  }

  /**
    * Function which accepts other function
    * as parameter
    * @param a
    * @param f
    */
  def function1(a:Double , f: Double => AnyVal){
    println(a)
    println(f(a))
  }

  /**
    * This is functions in which we have some
    * anonymous functions.
    * An Anonymous function can be create in 2 ways
    * 1). => (rocket)
    * 2)_ (underscore)
    */
  def anonymousFunctions(): Unit ={
    //anonymous function with rocket symbol
      var result = (a:Int, b:Int) => {
        val x = a * 2
        val y = b * 2
        (x+y)/2
      }
    println(result(2,3))
  }
  /**
    * function to multiply a number by 2
    */
  def multiplyBy2(a: Double) = {
    a*2
  }
}
