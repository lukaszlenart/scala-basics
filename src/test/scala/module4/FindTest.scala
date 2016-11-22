package module4

import org.scalatest._

class FindTest extends FlatSpec with Matchers {

  behavior of "Find test"

  it should "pass" in {
    true should be (true)
  }

}
