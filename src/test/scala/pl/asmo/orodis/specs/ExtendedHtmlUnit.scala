package pl.asmo.orodis.specs

import org.scalatest.selenium.{Driver, WebBrowser}

/**
 * @author Rafal Glowacz
 */
trait ExtendedHtmlUnit extends WebBrowser with Driver {

  /**
   * <code>WebBrowser</code> subtrait that defines an implicit <code>WebDriver</code> for HTMLUnit (an <code>org.openqa.selenium.htmlunit.HtmlUnitDriver</code>), with JavaScript
   * enabled by default.
   *
   * <p>
   * Note: You can disable JavaScript with:
   * </p>
   *
   * <pre>
   * webDriver.setJavascriptEnabled(false)
   * </pre>
   */
  implicit val webDriver = new ExtendedHtmlUnitDriver()

  webDriver.setJavascriptEnabled(false)

 }