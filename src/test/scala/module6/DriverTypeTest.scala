package module6

import module2.Driver
import module5.DriverType
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DriverTypeTest extends AnyFlatSpec with Matchers {

  behavior of "Driver Type test"

  it should "allow create Normal driver" in {
    val driver = Driver("12345", 34, Some(DriverType.Normal))

    driver.driverLicense should equal("Normal 12345")
  }

  it should "allow create Professions driver" in {
    val driver = Driver("12345", 34, Some(DriverType.Professional))

    driver.driverLicense should equal("Professional 12345")
  }

  it should "allow create driver without driver type" in {
    val driver = Driver("12345", 34)

    driver.driverLicense should equal("12345")
  }

  it should "allow create driver with explicitly Missing type" in {
    val driver = Driver("12345", 34, Some(DriverType.Missing))

    driver.driverLicense2 should equal("12345")
  }

}
