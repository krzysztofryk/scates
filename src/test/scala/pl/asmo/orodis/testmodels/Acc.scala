package pl.asmo.orodis.testmodels

import org.openqa.selenium.WebDriver

class Acc (webDriver: WebDriver) extends BaseTestModel(webDriver) {

  val getUrl = host + "de/p/BP90027784.html";

  def getProductPageImages  = {
    findAll(cssSelector("img")).toArray
  }

}

