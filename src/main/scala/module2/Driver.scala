package module2

import module5.DriverType

case class Driver(driverLicense: String, age: Int, driverType: Option[DriverType] = None) {

  def canDrive_? : Boolean = {
    age >= 18
  }

}
