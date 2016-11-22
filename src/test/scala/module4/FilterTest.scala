package module4

import org.scalatest._

class FilterTest extends FlatSpec with Matchers {

  behavior of "Filter test"

  it should "pass" in {
    true should be (true)
  }

}
