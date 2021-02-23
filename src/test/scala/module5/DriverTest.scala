package module5

import module2.Driver
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DriverTest extends AnyFlatSpec with Matchers {

  behavior of "Driver test"

  it should "allow define normal driver" in {
    val driver = Driver("123456", 34, Some(DriverType.Normal))

    driver.driverType.isDefined should be(true)
    driver.driverType should equal(Some(DriverType.Normal))
  }

  it should "allow define professional driver" in {
    val driver = Driver("123456", 44, Some(DriverType.Professional))

    driver.driverType.isDefined should be(true)
    driver.driverType should equal(Some(DriverType.Professional))
  }

}
