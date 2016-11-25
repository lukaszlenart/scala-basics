package module2

import org.scalatest._

class CarTest extends FlatSpec with Matchers {

  behavior of "Car"

  it should "start as with cold engine" in {
    val car = Car("toyota")

    car.startEngine("12345") should be("12345 - toyota is cold")
  }

  it should "start as with hot engine" in {
    val car = Car("toyota")

    car.startEngine("12345", false) should be("12345 - starting toyota")
  }

}
