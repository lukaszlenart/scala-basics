package module1

case class Person(firstName: String, lastName: String) {

  def fullName: String = {
    s"$firstName $lastName"
  }

}
