import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.selenium.{WebBrowser}
import org.openqa.selenium._
import org.scalatest.{FunSuite, Matchers}

/**
 * User: krzysztof.ryk@solsoft.pl
 * Date: 7/11/14 8:52 AM
 */
class SelSpec extends FunSuite with Matchers with WebBrowser  {

  implicit val webDriver: WebDriver = new HtmlUnitDriver
  val host = "http://www.google.com"
  test("Google browser works!") {
    go to (host)
    click on "q"
    textField("q").value = "Cheese!"
    submit()
    // Google's search is rendered dynamically with JavaScript.
    assert (pageTitle contains ("Cheese!") )
  }

}
