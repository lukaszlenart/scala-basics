package module1

import org.scalatest._

class IfTest extends FlatSpec with Matchers {

  behavior of "If test"

  it should "pass" in {
    true should be(true)
  }

}
