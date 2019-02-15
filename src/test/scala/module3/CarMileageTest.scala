package module3

import org.scalatest._

class CarMileageTest extends FlatSpec with Matchers {

  behavior of "Car Mileage test"

  it should "have the same mileage" in {
    val carMileage = CarMileage(List(1, 2, 3, 4))

    carMileage.mileage should be(1 :: 2 :: 3 :: 4 :: Nil)
  }

  it should "have the first element the same" in {
    val carMileage = CarMileage(List(1, 2, 3, 4))

    val head :: tail = carMileage.mileage

    head shouldBe 1
    tail shouldBe 2 :: 3 :: 4 :: Nil
  }

}
