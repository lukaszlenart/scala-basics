package module6

import module2.{Car, Driver}
import module3.CarGarage
import org.scalatest._

class CarGarageTest extends FlatSpec with Matchers {

  behavior of "Car Garage test"

  it should "return true if make is mercedes, car is not broken and driver's age is over 18" in {
    val car = Car("mercedes", driver = Some(Driver("12344", 22)))

    CarGarage.ready_?(car) should be(true)
  }

  it should "return false if make isn't mercedes or car is broken or driver's age is below 18" in {
    val car = Car("toyota", driver = Some(Driver("12344", 22)))

    CarGarage.ready_?(car) should be(false)
  }

}
