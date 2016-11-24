import org.scalatest._

class FirstTest extends FlatSpec with Matchers {

  behavior of "First test"

  it should "pass" in {
    true should be (true)
  }

  ignore should "fail" in {
    true should be (false)
  }

}
