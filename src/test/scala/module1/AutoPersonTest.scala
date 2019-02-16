package module1

import org.scalatest._

class AutoPersonTest extends FlatSpec with Matchers {

  it should "return fullName" in {
    val person = AutoPerson("Lukasz", "Lenart")

    person.fullName should be("Lukasz Lenart")
    person.firstName should be("Lukasz")
    person.lastName should be("Lenart")
  }

}
