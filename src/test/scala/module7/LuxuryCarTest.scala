package module7

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LuxuryCarTest extends AnyFlatSpec with Matchers {

  it should "pass certification if VW" in {
    val car = LuxuryCar(CarMake.VW)

    val accept = (make: CarMake) => {
      make == CarMake.VW
    }

    val result = car.passCertification(accept)

    result shouldBe true
  }

  it should "not pass certification if Ford" in {
    val car = LuxuryCar(CarMake.Ford)

    val result = car.passCertification(_ == CarMake.VW)

    result shouldBe false
  }

}
