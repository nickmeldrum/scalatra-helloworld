import org.scalatest._

class HelloWorldSpec extends FunSpec with Matchers {
    describe("the hello world function") {
        it ("returns the string Oh hai there!") {
            val stream = new java.io.ByteArrayOutputStream()
            Console.withOut(stream) {
                val hw = new HelloWorld
                hw.run()
            }
            stream.toString should be ("Oh hai there!\r\n")
        }

        it ("returns the string Oh hai there mocking the trait") {
          trait MockOutput extends Output {
            var messages: Seq[String] = Seq()

            override def print(s: String) = messages = messages :+ s
          }

          val hi = new HelloWorld with MockOutput
          hi.run()
          hi.messages should contain("Oh hai there!")
        }
    }
}
