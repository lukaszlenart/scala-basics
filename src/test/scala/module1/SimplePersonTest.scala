package module1

import org.scalatest._

class SimplePersonTest extends FlatSpec with Matchers {

  behavior of "Simple Person"

  it should "return fullName" in {
    val person = new SimplePerson("Lukasz", "Lenart")

    person.fullName should be("Lukasz Lenart")
  }

}
