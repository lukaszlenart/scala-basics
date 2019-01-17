package module7

sealed trait CarMake

object CarMake {
  case object VW extends CarMake
  case object Ford extends CarMake
}

case class LuxuryCar(make: CarMake) {

  def passCertification(accepted: CarMake => Boolean): Boolean = {
    accepted(make)
  }

}
