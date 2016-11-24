package module2

import org.scalatest._

class DriverTest extends FlatSpec with Matchers {

  behavior of "Driver"

  it should "ba able to driver if over 18" in {
    val driver = Driver("ASJ123123", 22)

    driver.canDrive_? should be(true)
  }

  it should "not be able to drive if below 18" in {
    val driver = Driver("ASJ123123", 22)

    driver.copy(age = 12).canDrive_? should be(false)
  }

}
