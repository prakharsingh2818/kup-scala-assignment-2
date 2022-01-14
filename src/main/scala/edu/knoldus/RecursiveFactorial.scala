package edu.knoldus

class RecursiveFactorial {
  def factorial(number: Int): BigInt = {
      if (number <= 1) 1
      else number * factorial(number - 1)
  }
}
