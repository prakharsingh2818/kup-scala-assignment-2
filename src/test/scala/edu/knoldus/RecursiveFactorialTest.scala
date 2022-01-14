package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class RecursiveFactorialTest extends AnyFlatSpec {

  behavior of "RecursionFactorialTest"

  val recursiveFactorialCalculator = new RecursiveFactorial

  "Factorial of 5" should "be" in {
    val number: Int = 5
    assertResult(120)(recursiveFactorialCalculator.factorial(number))
  }
  "Factorial of -5" should "be" in {
    val number: Int = -5
    assertResult(1)(recursiveFactorialCalculator.factorial(number))
  }
  "Factorial of 0" should "be" in {
    val number: Int = 0
    assertResult(1)(recursiveFactorialCalculator.factorial(number))
  }
  "Factorial of 1" should "be" in {
    val number: Int = 1
    assertResult(1)(recursiveFactorialCalculator.factorial(number))
  }
  "Factorial of 3" should "not be" in {
    val number: Int = 3
    assert(9 != recursiveFactorialCalculator.factorial(number))
  }
}
