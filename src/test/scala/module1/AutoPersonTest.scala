package module1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AutoPersonTest extends AnyFlatSpec with Matchers {

  it should "return fullName" in {
    val person = AutoPerson("Lukasz", "Lenart")

    person.fullName should be("Lukasz Lenart")
    person.firstName should be("Lukasz")
    person.lastName should be("Lenart")
  }

}
