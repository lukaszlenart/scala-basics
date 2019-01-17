package module7
import module2.Driver
import module5.DriverType.Normal

object AcceptDriver {

  def accept(driver: Driver): Driver => Boolean = {
    driver.driverType match {
      case Some(Normal) =>
        driver => {
          driver.age >= 18
        }

      case Some(_) =>
        driver => {
          driver.age >= 21
        }

      case _ =>
        _ => {
          false
        }
    }
  }

}
