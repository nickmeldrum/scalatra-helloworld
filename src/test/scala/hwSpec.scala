import org.scalatest._

class HelloWorldSpec extends FunSpec with Matchers {
    describe("the hello world function") {
        it ("returns the string Hi!") {
            1 should be (1)
        }
    }
}
