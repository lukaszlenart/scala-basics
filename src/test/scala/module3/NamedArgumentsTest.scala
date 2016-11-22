package module3

import org.scalatest._

class NamedArgumentsTest extends FlatSpec with Matchers {

  behavior of "Named Arguments test"

  it should "pass" in {
    true should be(true)
  }

}
