/**
  * Created by abhishyam.c on 6/5/2017.
  */
object ArraysExample {

  def main(args: Array[String]): Unit = {
    //different declarations for array
    var array1 =  Array(1,2,3,4,5,6)
    show(array1)
    var array2 = new Array[String](5)
    array2(0) = "abhi"
    array2(1) = "shyam"
    array2(2) = "Kiran"
    showStrings(array2)
  }

  def show(array: Array[Int]): Unit ={
    for(a <- array)
      println(a)
  }

  def showStrings( array: Array[String]): Unit ={
    array.foreach( (a:String) => println(a) )
  }
}
