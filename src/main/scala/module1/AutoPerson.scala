package module1

case class AutoPerson(firstName: String, lastName: String) {

  var fullName: String = ""

  fullName = s"$firstName $lastName"

}
