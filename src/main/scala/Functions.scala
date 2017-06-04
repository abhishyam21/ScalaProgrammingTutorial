/**
  * Created by Rachana Rao on 5/28/2017.
  */
object Functions {

  def myFun1(){
     var b = 1;
    println("This is method with no return ")
    b
  }

  /**
    * If we write = in the method signature,
    * it means that that function is returning some thing
    * We no need to explicitly write the return statement
    * in the end. Compiler has the intelligence  to
    * detect the return type base on last statement
    */
  def functionWithReturn()  = {
    println("Function with return")
    val b = 21
    b
  }
  //parametrized method
  def parmetarizedFunction(a :Int, b:Double) = {
    a+b
  }

  def main(args: Array[String]){
  //function without equal sign
    var a = myFun1()
    println(a)
    var b = functionWithReturn()
    println(b)
    var c = parmetarizedFunction(12,12.3456)
    println(c)
  }
}
