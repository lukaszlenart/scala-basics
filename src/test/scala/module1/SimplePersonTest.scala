package module1

import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SimplePersonTest extends AnyFlatSpec with Matchers {

  behavior of "Simple Person"

  it should "return fullName" in {
    val person = new SimplePerson("Lukasz", "Lenart")

    person.fullName should be("Lukasz Lenart")
  }

}
