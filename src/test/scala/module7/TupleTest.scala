package module7

import org.scalatest._

class TupleTest extends FlatSpec with Matchers {

  behavior of "Tuple test"

  it should "pass" in {
    true should be (true)
  }

}
