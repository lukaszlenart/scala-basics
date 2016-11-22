package module2

import org.scalatest._

class CaseClassTest extends FlatSpec with Matchers {

  behavior of "CaseClass test"

  it should "pass" in {
    true should be (true)
  }

}
