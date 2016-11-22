package module6

import org.scalatest._

class WithTest extends FlatSpec with Matchers {

  behavior of "With test"

  it should "pass" in {
    true should be (true)
  }

}
