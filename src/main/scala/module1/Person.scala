package module1

case class Person(firstName: String, lastName: String) {

  def fullName: String = {
    s"$firstName $lastName"
  }

}

object Person {

  def apply(fullName: String): Person = {
    val firstLastName = fullName.split(" ")
    Person(firstLastName(0), firstLastName(1))
  }

}