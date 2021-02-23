package module1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonTest extends AnyFlatSpec with Matchers {

  behavior of "Person"

  it should "return fullName" in {
    val person = Person("Lukasz", "Lenart")

    person.fullName should be("Lukasz Lenart")
    person.firstName should be("Lukasz")
    person.lastName should be("Lenart")
  }

  it should "allow create a Person based on full name" in {
    val person = Person("Lukasz Lenart")

    person.fullName should be("Lukasz Lenart")
    person.firstName should be("Lukasz")
    person.lastName should be("Lenart")
  }
}
