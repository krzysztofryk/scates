import org.scalatest.selenium.HtmlUnit
import org.scalatest.{Matchers, FunSuite}

class BlogSpec extends FunSuite with Matchers with HtmlUnit {

  val host = "http://www.onet.pl"

  test("The home page should have a title which contains onet") {
    go to (host)
    assert(pageTitle contains ("Onet"));
  }
}