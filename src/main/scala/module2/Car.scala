package module2

case class Car(make: String, broken: Boolean = false) {

  def startEngine(key: String, cold: Boolean = true): String = {
    if (cold) {
      s"$key - $make is cold"
    } else {
      s"$key - starting $make"
    }
  }

}
