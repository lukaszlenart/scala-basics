package module7

import module2.Driver
import module5.DriverType.{Normal, Professional}
import org.scalatest.{FlatSpec, Matchers}

class DriverAcceptanceTest extends FlatSpec with Matchers {

  it should "accept normal Driver over 18 age" in {
    val driver: Driver = Driver("123", 19, Some(Normal))
    val fn = AcceptDriver.accept(driver)

    val accept = fn(driver.age)

    accept shouldBe true
  }

  it should "deny professional Driver under 21 age" in {
    val driver: Driver = Driver("123", 20, Some(Professional))
    val fn = AcceptDriver.accept(driver)

    val accept = fn(driver.age)

    accept shouldBe false
  }

  it should "deny any Driver without a type" in {
    val driver: Driver = Driver("123", 25, None)
    val fn = AcceptDriver.accept(driver)

    val accept = fn(driver.age)

    accept shouldBe false
  }

}
