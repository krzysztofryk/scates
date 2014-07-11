package pl.asmo.orodis.specs

import org.openqa.selenium.htmlunit.HtmlUnitDriver
import scala.Predef.String

/**
 * @author Rafal Glowacz
 */
class ExtendedHtmlUnitDriver() extends HtmlUnitDriver {

  def setHeader(name: String, value: String) {
    this.getWebClient.addRequestHeader(name, value);
  }

}
