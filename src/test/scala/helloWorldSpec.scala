import org.scalatest._

class HelloWorldSpec extends FunSpec with Matchers {
    describe("the hello world function") {
        it ("returns the string Hi!") {
            val stream = new java.io.ByteArrayOutputStream()
            Console.withOut(stream) {
                val hw = new HelloWorld
                hw.run()
            }
            stream.toString should be ("Oh hai there!\r\n")
        }
    }
}
