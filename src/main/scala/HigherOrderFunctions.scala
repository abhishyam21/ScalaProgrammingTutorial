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
    var a = multiParameterFunction(1,2,3,4,5,6)
    println(a)
    var res1 = functionCurrying(10)(20)(30)
    println(res1)
    var  result2 = functionCurrying(40)_
    var result3 = result2(40)
    var result4 = result3(40)
    println(result4)
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

    var result2 = (_: Double) / (_: Double)
    println(result2(10,2))
  }

  /**
    * Function which accepts multiple parameters
    * @param args
    * @return
    */
  def multiParameterFunction(args : Int*) ={
    var sum = 0
    for( a <- args)
      sum+=a
   sum
  }

  /**
    * Function with multiple inner functions
    * @param a
    * @param b
    */
  def multipleFunctions(a: Int, b:Int)={
    var kiran = "Kiran"
    def inner1(a: Int) = {
      def inner12(a: Int) ={
      var abhi1 = "abhishyam"
      }
      def inner13(a: Int) = {
      }
    }
  }

  def functionCurrying(a:Int)(b:Int)(c:Int) ={
    a+b+c
  }

  /**
    * function to multiply a number by 2
    */
  def multiplyBy2(a: Double) = {
    a*2
  }
}
