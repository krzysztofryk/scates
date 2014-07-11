import org.openqa.selenium.WebDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{Matchers, FlatSpec, GivenWhenThen}
import org.openqa.selenium.htmlunit.HtmlUnitDriver

/**
 * User: krzysztof.ryk@solsoft.pl
 * Date: 7/11/14 9:24 AM
 */
class WebsiteSpec extends FlatSpec with GivenWhenThen with Matchers with WebBrowser {
  implicit val webDriver: WebDriver = new HtmlUnitDriver

  "My Website" should "search for a given term" in {
    go to ("http://www.hascode.com/")
    pageTitle should be("hasCode.com")
    click on id("s")
    textField("s").value = "lucene"
    submit()
    pageTitle should include regex ("hasCode.com.+Search Results.+lucene")
    pageSource should include("Lucene Snippets: Index Stats")
    pageSource should include("Lucene Snippets: Faceting Search")
    pageSource should include("Hibernate Search Faceting: Discrete and Range Faceting by Example")
  }
}