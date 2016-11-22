package module2

import org.scalatest._

class ObjectTest extends FlatSpec with Matchers {

  behavior of "Object test"

  it should "pass" in {
    true should be (true)
  }

}
