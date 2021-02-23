package module7

import module2.Driver
import module5.DriverType.{Normal, Professional}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AcceptDriverTest extends AnyFlatSpec with Matchers {

  it should "accept normal Driver over 18 age" in {
    val driver: Driver = Driver("123", 19, Some(Normal))
    val acceptDriver = AcceptDriver.accept(driver)

    val accepted = acceptDriver(driver)

    accepted shouldBe true
  }

  it should "deny professional Driver under 21 age" in {
    val driver: Driver = Driver("123", 20, Some(Professional))
    val acceptDriver = AcceptDriver.accept(driver)

    val accepted = acceptDriver(driver)

    accepted shouldBe false
  }

  it should "deny any Driver without a type" in {
    val driver: Driver = Driver("123", 25, None)
    val acceptDriver = AcceptDriver.accept(driver)

    val accepted = acceptDriver(driver)

    accepted shouldBe false
  }

}
