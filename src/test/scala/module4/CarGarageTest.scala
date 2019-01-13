package module4

import module2.{Car, Driver}
import module3.CarGarage
import org.scalatest._

class CarGarageTest extends FlatSpec with Matchers {

  behavior of "Car Garage test"

  it should "list cars with drivers" in {
    val driver1 = Driver("123345", 23)
    val driver2 = Driver("123346", 256)
    val car1 = Car("mercedes", driver = Some(driver1))
    val car2 = Car("mercedes", driver = Some(driver2))
    val car3 = Car("mercedes")

    val carGarage = CarGarage(Map("mercedes1" -> car1, "mercedes2" -> car2, "mercedes3" -> car3))

    carGarage.readyCars should equal(car1 :: car2 :: Nil)
  }

  it should "list drivers assigned to cars" in {
    val driver1 = Driver("123345", 23)
    val driver2 = Driver("123346", 256)
    val car1 = Car("mercedes", driver = Some(driver1))
    val car2 = Car("mercedes", driver = Some(driver2))
    val car3 = Car("mercedes")

    val carGarage = CarGarage(Map("mercedes1" -> car1, "mercedes2" -> car2, "mercedes3" -> car3))

    carGarage.readyDrivers should equal(driver1 :: driver2 :: Nil)
    carGarage.readyDrivers1 should equal(driver1 :: driver2 :: Nil)
  }

}
