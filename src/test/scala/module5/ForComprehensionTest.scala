package module5

import org.scalatest._

class ForComprehensionTest extends FlatSpec with Matchers {

  behavior of "For-comprehension test"

  it should "pass" in {
    true should be (true)
  }

}
