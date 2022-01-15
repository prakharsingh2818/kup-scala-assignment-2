package edu.knoldus

class Log {
  def logMessage(message: String, level: String = "INFO"): String = {
    s"[$level]:$message"
  }
}

