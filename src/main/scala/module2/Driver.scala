package module2

import module5.DriverType

case class Driver(licenseId: String, age: Int, driverType: Option[DriverType] = None) {

  def canDrive_? : Boolean = {
    age >= 18
  }

  def driverLicense: String = {
    driverType match {
      case Some(dt) =>
        s"$dt $licenseId"

      case None =>
        licenseId
    }
  }

  def driverLicense2: String = {
    driverType match {
      case Some(dt) if dt != DriverType.Missing =>
        s"$dt $licenseId"

      case _ =>
        licenseId
    }
  }

}
