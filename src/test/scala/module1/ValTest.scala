package module1

import org.scalatest._

class ValTest  extends FlatSpec with Matchers {

  behavior of "Val test"

  it should "pass" in {
    true should be(true)
  }

}
