package module1

import org.scalatest._

class PersonSingletonTest extends FlatSpec with Matchers {

  behavior of "Person Singleton"

  it should "init and return fullName" in {
    PersonSingleton.fullName = "Lukasz Lenart"

    PersonSingleton.fullName should be("Lukasz Lenart")
  }

  it should "only return fullName" in {
    PersonSingleton.fullName should be("Lukasz Lenart")
  }

}
