/**
  * Created by Rachana Rao on 5/28/2017.
  */
object Cases {
  case class Person(name: String, age:Int)

  def main(args: Array[String]) {
      val abhi = Person("Abhi", 25)
    val uday = Person("Uday", 26)
    val sai = Person("Naveen", 24)
    val kiran = Person("Kiran", 24)
    for (person <- List(sai,abhi,uday,kiran)){
        person match {
          case Person("Uday", 26) => println(person.name)
          case Person("Naveen", 24) => println(person.name)
          case Person(name, age) => println(person.name)
        }
    }
  }
}
