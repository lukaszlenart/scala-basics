package module3

import module2.Car
import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CarGarageTest extends AnyFlatSpec with Matchers {

  behavior of "Car Mileage test"

  it should "have the same mileage" in {
    val carMileage = CarMileage(List(1, 2, 3, 4))

    carMileage.mileage should be(1 :: 2 :: 3 :: 4 :: Nil)
  }

  it should "find car by model" in {
    val mercedes = Car("mercedes")
    val toyota = Car("toyota")

    val carGarage = CarGarage(Map("mercedes" -> mercedes, "toyota" -> toyota))

    carGarage.findByName("mercedes") should equal(Some(mercedes))
  }

  it should "not find car by make" in {
    val mercedes = Car("mercedes")
    val toyota = Car("toyota")

    val carGarage = CarGarage(Map("mercedes" -> mercedes, "toyota" -> toyota))

    carGarage.findByName("honda") should equal(None)
  }

  it should "count cars by make" in {
    val mercedes1 = Car("mercedes")
    val mercedes2 = Car("mercedes")
    val toyota = Car("toyota")

    val carGarage = CarGarage(Map("mercedes1" -> mercedes1, "mercedes2" -> mercedes2, "toyota" -> toyota))

    carGarage.countCars("mercedes") should equal(2)
  }

  it should "find broken cars" in {
    val mercedes1 = Car("mercedes", broken = true)
    val mercedes2 = Car("mercedes", broken = true)
    val toyota = Car("toyota")

    val carGarage = CarGarage(Map("mercedes1" -> mercedes1, "mercedes2" -> mercedes2, "toyota" -> toyota))

    carGarage.findBrokenCars should equal(mercedes1 :: mercedes2 :: Nil)
  }

  it should "find broken cars sorted by make" in {
    val mercedes1 = Car("mercedes", broken = true)
    val mercedes2 = Car("mercedes")
    val honda = Car("honda", broken = true)

    val carGarage = CarGarage(Map("mercedes1" -> mercedes1, "mercedes2" -> mercedes2, "toyota" -> honda))

    carGarage.findBrokenCars should equal(honda :: mercedes1 :: Nil)
  }

}
