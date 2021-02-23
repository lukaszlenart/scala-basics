import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FirstTest extends AnyFlatSpec with Matchers {

  behavior of "First test"

  it should "pass" in {
    true should be (true)
  }

  ignore should "fail" in {
    true shouldBe false
  }

}
