package module2

case class Car() {

  def startEngine(key: String, cold: Boolean = true): String = {
    if (cold) {
      s"$key - cold"
    } else {
      key
    }
  }

}
