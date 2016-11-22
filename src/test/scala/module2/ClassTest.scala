package module2

import org.scalatest._

class ClassTest extends FlatSpec with Matchers {

  behavior of "Class test"

  it should "pass" in {
    true should be (true)
  }

}
