package module6

import org.scalatest._

class TraitTest extends FlatSpec with Matchers {

  behavior of "Trait test"

  it should "pass" in {
    true should be (true)
  }

}
