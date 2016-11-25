package module5

import module1.SimplePerson

case class ProfessionalDriver(firstName: String, lastName: String, driverLicense: String)
  extends SimplePerson(firstName, lastName)
  with Professional {

  override def professionalDriverLicense: String = driverLicense

}
