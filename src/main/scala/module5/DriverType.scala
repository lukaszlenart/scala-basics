package module5

sealed trait DriverType

object DriverType {
  case object Normal extends DriverType
  case object Professional extends DriverType
  case object Missing extends DriverType
}
