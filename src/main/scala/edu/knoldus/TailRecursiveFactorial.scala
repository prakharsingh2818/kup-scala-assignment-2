package edu.knoldus

import scala.annotation.tailrec

class TailRecursiveFactorial {
  def factorial(number: Int): BigInt = {
    @tailrec
    def calculateFactorial(number: Int, accumulator: BigInt = 1): BigInt = {
      if (number <= 1) accumulator //Accumulator is returned as final result
      else calculateFactorial(number - 1, number * accumulator) //Result is stored in the accumulator
    }
    calculateFactorial(number)
  }
}
