package module5

import module1.SimplePerson

case class SimpleDriver(firstName: String, lastName: String)
  extends SimplePerson(firstName, lastName)
  with Professional