package module3

import org.scalatest._

class DefaultArgumentsTest extends FlatSpec with Matchers {

  behavior of "Default Arguments test"

  it should "pass" in {
    true should be(true)
  }

}
