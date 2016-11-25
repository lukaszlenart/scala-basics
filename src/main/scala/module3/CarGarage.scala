package module3

import module2.Car

case class CarGarage(cars: Map[String, Car]) {

  def findByName(carName: String): Option[Car] = {
    cars.find(_._1 == carName).map(_._2)
  }

  def countCars(carName: String): Int = {
    cars.count(_._2.make == carName)
  }

  def findBrokenCars: Seq[Car] = {
    cars.filter(_._2.broken).values.toSeq.sortBy(_.make)
  }

}
