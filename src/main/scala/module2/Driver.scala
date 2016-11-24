package module2

case class Driver(driverLicense: String, age: Int) {

  def canDrive_? : Boolean = {
    age >= 18
  }

}
