import scala.util.control.Breaks._
/**
  * Created by Rachana Rao on 5/28/2017.
  */
object BreakStatement {
  def main(args: Array[String]) {
    for(j <- 1 to 5)
    breakable {
      for (i <- 1 to 5) {
        if (i == 2) break
        println(i)
      }
    }
  }
}
