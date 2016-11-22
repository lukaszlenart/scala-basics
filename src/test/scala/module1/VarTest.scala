package module1

import org.scalatest._

class VarTest extends FlatSpec with Matchers {

  behavior of "Var test"

  it should "pass" in {
    true should be(true)
  }

}
