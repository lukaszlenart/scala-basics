package module5

import org.scalatest._

class ProfessionalDriverTest extends FlatSpec with Matchers {

  behavior of "Professional Driver test"

  it should "allow define professional driver" in {
    val driver = ProfessionalDriver("Lukasz", "Lenart", "123333")

    driver.professionalDriverLicense should be("123333")
  }

  it should "allow define simple driver" in {
    val driver = SimpleDriver("Lukasz", "Lenart")

    driver.professionalDriverLicense should be("missing")
  }

}
