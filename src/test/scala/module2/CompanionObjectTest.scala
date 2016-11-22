package module2

import org.scalatest._

class CompanionObjectTest extends FlatSpec with Matchers {

  behavior of "Companion Object test"

  it should "pass" in {
    true should be (true)
  }

}
