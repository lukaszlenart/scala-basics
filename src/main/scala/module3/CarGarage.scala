package module3

import module2.{Car, Driver}

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

  def readyCars: Seq[Car] = {
    cars.filter(_._2.driver.isDefined).values.toSeq
  }

  def readyDrivers: Seq[Driver] = {
    cars.filter(_._2.driver.isDefined).flatMap(_._2.driver).toSeq
  }

  def readyDrivers1: Seq[Driver] = {
    val drivers = for {
      car <- cars
      driver <- car._2.driver
    } yield {
      driver
    }

    drivers.toSeq
  }

}

object CarGarage {

  def ready_?(car: Car): Boolean = {
    car match {
      case Car(make, broken, Some(Driver(_, age, _)))
        if make.equals("mercedes") && !broken && age > 18 =>

        true

      case _ =>
        false
    }
  }

}