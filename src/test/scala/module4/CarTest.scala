package module4

import module2.{Car, Driver}
import org.scalatest._

class CarTest extends FlatSpec with Matchers {

  behavior of "Car test"

  it should "allow create Car without driver" in {
    val car = Car("mercedes")

    car.driver should equal(None)
    car.driver.isEmpty should equal(true)
  }

  it should "allow create Car with a driver" in {
    val driver = Driver("123456", 22)
    val car = Car("mercedes", driver = Some(driver))

    car.driver.isDefined should be(true)
  }

}
