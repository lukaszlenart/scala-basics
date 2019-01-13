package module7
import module2.Driver
import module5.DriverType.Normal

object AcceptDriver {

  def accept(driver: Driver): Int => Boolean = {
    driver.driverType match {
      case Some(Normal) =>
        (age: Int) => {
          age >= 18
        }

      case Some(_) =>
        (age: Int) => {
          age >= 21
        }

      case _ =>
        (_: Int) => {
          false
        }
    }
  }

}
