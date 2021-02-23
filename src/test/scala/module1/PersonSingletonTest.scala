package module1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonSingletonTest extends AnyFlatSpec with Matchers {

  behavior of "Person Singleton"

  it should "init and return fullName" in {
    PersonSingleton.fullName = "Lukasz Lenart"

    PersonSingleton.fullName should be("Lukasz Lenart")
  }

  it should "only return fullName" in {
    PersonSingleton.fullName should be("Lukasz Lenart")
  }

}
