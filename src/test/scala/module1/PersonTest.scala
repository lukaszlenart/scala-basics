package module1

import org.scalatest._

class PersonTest extends FlatSpec with Matchers {

  behavior of "Person"

  it should "return fullName" in {
    val person = Person("Lukasz", "Lenart")

    person.fullName should be("Lukasz Lenart")
    person.firstName should be("Lukasz")
    person.lastName should be("Lenart")
  }

}
