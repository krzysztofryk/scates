import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.selenium.WebBrowser
import org.openqa.selenium._
import org.scalatest.{FunSuite, Matchers}
import security.UserAndPassword

/**
 * User: krzysztof.ryk@solsoft.pl
 * Date: 7/11/14 8:52 AM
 */
class AccSelSpec extends FunSuite with Matchers with WebBrowser   {

  implicit val webDriver: WebDriver = new HtmlUnitDriver
  val host = ""
  test("ACC Login In works!") {
    go to (host)
    Alert alert = wait.until(alertIsPresent())
    UserAndPassword user = new UserAndPassword("", "")

    alert.authenticateUsing(user)
    click on ".user.myaccount"
//    textField("q").value = "Cheese!"
//    submit()
    // Google's search is rendered dynamically with JavaScript.
    assert (pageTitle contains ("Cheese!") )
  }

}
