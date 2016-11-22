package module6

import org.scalatest._

class ExtendsTest extends FlatSpec with Matchers {

  behavior of "Extends test"

  it should "pass" in {
    true should be (true)
  }

}
