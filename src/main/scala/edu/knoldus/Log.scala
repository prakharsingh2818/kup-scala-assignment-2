package edu.knoldus

import org.slf4s.{Logger, LoggerFactory}


class Log {
  def logMessage(message: String, level: String = "INFO"): String = {
    val logger: Logger = LoggerFactory.getLogger(classOf[Log])
    logger.info(s"[$level]:$message")
    s"[$level]:$message"
  }
}

