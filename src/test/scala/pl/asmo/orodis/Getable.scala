package pl.asmo.orodis

trait Getable {
  def getUrl : String
  val url = getUrl
}
