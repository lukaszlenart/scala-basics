import org.scalatest._

class FirstSpec extends FlatSpec with Matchers {

  "First test" should "pass" in {
    true should be (true)
  }

}
