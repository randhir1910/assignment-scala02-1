package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {
  val log = Logger.getLogger(this.getClass)
  val operation = new Operation
  log.info(operation.rotateList(List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), 3) + "\n")
  log.info(operation.compress(List('b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e, 'a, 'a, 'a, 'a), List.empty) + "\n")

  val number1 = 19
  val number2 = -10
  val number3 = 20
  val number4 = 7

  log.info(operation.happyNumber(number1, List.empty) + "\n")
  log.info(operation.happyNumber(number2, List.empty) + "\n")
  log.info(operation.happyNumber(number3, List.empty) + "\n")
  log.info(operation.happyNumber(number4, List.empty))
}
