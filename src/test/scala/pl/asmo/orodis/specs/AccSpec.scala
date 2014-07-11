package pl.asmo.orodis.specs

import pl.asmo.orodis.testmodels.Acc

/**
 * @author Rafal Glowacz
 */
class AccSpec extends IntegrationSpec[Acc] {

  "The acc login" should " be enable" in {
    model.getProductPageImages.length should be > 10
  }

  def createModel = new Acc(webDriver);
}
