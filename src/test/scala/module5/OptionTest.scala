package module5

import org.scalatest._

class OptionTest extends FlatSpec with Matchers {

  behavior of "Option test"

  it should "pass" in {
    true should be (true)
  }

}
