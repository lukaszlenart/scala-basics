package module4

import org.scalatest._

class CountTest extends FlatSpec with Matchers {

  behavior of "Count test"

  it should "pass" in {
    true should be (true)
  }

}
