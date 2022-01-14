package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.slf4s.{Logger, LoggerFactory}

class LogTest extends AnyFlatSpec {
  val log = new Log()
  val testLogger: Logger = LoggerFactory.getLogger(classOf[Log])


  "Log message for given message and level" should "be" in {
    val level = "one"
    val message = "check"
    assertResult("[one]:check")(log.logMessage(message, level))
  }

  "Log message for given message only" should "be" in {
    val level = "INFO"
    val message = "check"
    assertResult("[INFO]:check")(log.logMessage(message))
  }
}
