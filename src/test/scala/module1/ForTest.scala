package module1

import org.scalatest._

class ForTest extends FlatSpec with Matchers {

  behavior of "For test"

  it should "pass" in {
    true should be(true)
  }

}
