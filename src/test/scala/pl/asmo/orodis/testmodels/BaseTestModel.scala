package pl.asmo.orodis.testmodels


import org.openqa.selenium.WebDriver
import org.scalatest.Matchers
import org.scalatest.selenium.WebBrowser
import org.scalatest.selenium.Page
import pl.asmo.orodis.Getable


/**
 * @author Rafal Glowacz
 */
abstract class BaseTestModel(webDriver: WebDriver) extends Page with Matchers
with WebBrowser with Getable {
  implicit val driver = webDriver
  implicit val host = System.getProperty("test.host");

}
