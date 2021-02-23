package module2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DriverTest extends AnyFlatSpec with Matchers {

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
