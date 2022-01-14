package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class TailRecursiveFactorialTest extends AnyFlatSpec {
  behavior of "TailRecursiveFactorialTest"

  val tailRecursiveFactorialCalculator = new TailRecursiveFactorial

  "Factorial of 5" should "be" in {
    val number: Int = 5
    assertResult(120)(tailRecursiveFactorialCalculator.factorial(number))
  }
  "Factorial of -5" should "be" in {
    val number: Int = -5
    assertResult(1)(tailRecursiveFactorialCalculator.factorial(number))
  }
  "Factorial of 0" should "be" in {
    val number: Int = 0
    assertResult(1)(tailRecursiveFactorialCalculator.factorial(number))
  }
  "Factorial of 1" should "be" in {
    val number: Int = 1
    assertResult(1)(tailRecursiveFactorialCalculator.factorial(number))
  }
}
