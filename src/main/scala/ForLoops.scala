/**
  * Created by Rachana Rao on 5/28/2017.
  */
object ForLoops {
  def main(args: Array[String]){
    //general loop
    for( i <-0 to 10)
      println(i)

    //using until keyword
    for (i <- 1 until 10)
      println(i)

    //for loop with filter
    for( i <- 1 to 10 if(i%2) ==0)
      println(i)
    println("-------------------------------")
    //for loop using by keyword
    for( i <- 1 to 20 by 3)
      println(i)
  }
}
