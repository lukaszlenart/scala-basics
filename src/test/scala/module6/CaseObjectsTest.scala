package module6

import org.scalatest._

class CaseObjectsTest extends FlatSpec with Matchers {

  behavior of "Case objects test"

  it should "pass" in {
    true should be (true)
  }

}
