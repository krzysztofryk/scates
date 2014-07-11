import java.io.File
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.selenium.WebBrowser
import org.openqa.selenium._
import firefox.{FirefoxProfile, FirefoxBinary, FirefoxDriver}
import chrome.{ChromeOptions, ChromeDriver}
import org.scalatest.{Matchers, FlatSpec, GivenWhenThen}
import security.UserAndPassword


/**
 * User: krzysztof.ryk@solsoft.pl
 * Date: 7/11/14 8:52 AM
 */
class AccSelSpec extends FlatSpec with Matchers with WebBrowser   {

  val firefoxBinPath: File = new File("c:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")
  val firefoxBinary: FirefoxBinary = new FirefoxBinary(firefoxBinPath)
  val firefoxProfile: FirefoxProfile = new FirefoxProfile()
  //implicit val webDriver: WebDriver = new FirefoxDriver(firefoxBinary, firefoxProfile)
  val chromeBinPath: File = new File("c:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe")
  val chromeOptions: ChromeOptions = new ChromeOptions()
  chromeOptions.setBinary(chromeBinPath)
  System.setProperty("webdriver.chrome.driver", "c:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe")
  implicit val webDriver: WebDriver = new ChromeDriver()
  val host = ""
//  test("ACC Login In works!") {
  "Acc" should "be accessible" in {
    webDriver.get(host)
    //go to (host)

    val alert: Alert = webDriver.switchTo().alert()
    //Alert alert = wait.until(alertIsPresent())
    val user: UserAndPassword = new UserAndPassword("", "")

//    alert.authenticateUsing(user)
    //click on className("user myaccount")
//    textField("q").value = "Cheese!"
//    submit()
    // Google's search is rendered dynamically with JavaScript.
//    assert (pageTitle contains ("OPO") )
  }

}
