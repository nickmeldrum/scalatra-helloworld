package HelloWorld

import org.scalatra._
import scalate.ScalateSupport

class HelloWorld extends ScalatraServlet with ScalateSupport {
  get("/") {
    <html>
      <body>
        <h1>Oh hai there!</h1>
      </body>
    </html>
  }
}
