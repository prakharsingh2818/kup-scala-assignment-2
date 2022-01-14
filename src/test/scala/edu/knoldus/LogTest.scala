package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class LogTest extends AnyFlatSpec {
  val log = new Log()

  "Log message for given message and level" should "be" in {
    val level = "one"
    val message = "check"
    assertResult("[one]:check")(log.logMessage(message, level))
  }

  "Log message for given message only" should "be" in {
    val message = "check"
    assertResult("[INFO]:check")(log.logMessage(message))
  }

  "Log message" should "be invalid" in {
    val message = "check"
    assert("[]:check" != log.logMessage(message))
  }
}
