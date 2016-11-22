package module7

import org.scalatest._

class MatchCaseTest extends FlatSpec with Matchers {

  behavior of "Match Case test"

  it should "pass" in {
    true should be (true)
  }

}
