package pl.asmo.orodis.specs

import java.util.logging.Level
import org.scalatest.{FlatSpec, Matchers, BeforeAndAfterAll}
import pl.asmo.orodis.Getable
import org.apache.log4j.Logger
import java.lang.String
import org.apache.commons.codec.binary.Base64

abstract class IntegrationSpec[T <: Getable] extends FlatSpec with Matchers with ExtendedHtmlUnit with BeforeAndAfterAll {
  val logger = Logger.getLogger("IntegrationSpec")
  implicit val model: T = createModel

  def createModel: T

  def login() = {
    val value = (System.getProperty("test.username") + ":" + System.getProperty("test.password")).getBytes
    webDriver.setHeader("Authorization", "Basic " + new String(Base64.encodeBase64(value)))
  }

  def loadModelUrl() = {
    logger.info("Test URL: " + model.getUrl)
    go to model.getUrl
  }

  override def beforeAll = {
    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.SEVERE)
    login()
    loadModelUrl()
  }
}

