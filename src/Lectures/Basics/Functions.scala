package Lectures.Basics

object Functions extends App {
  //A normal function does not need their return type defined, it is best practice though.
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Order", 66))

  def aParameterlessFunction(): Int = 42
  //println(aParameterlessFunction())
  //println(aParameterlessFunction)

  //Recursive functions need their return type defined
  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))
  //When you need loops, use recursion

  def aFunctionWorksWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  //1. Greet a person (name, age) => Hi my name is $name, and I am $age years old
  def greetAPerson(name: String, age: Int): Unit ={
    println("Hi my name is: " + name + " And I am " + age + " years old.")
  }
  greetAPerson("Barry", 69)
  //2. Factorial function 1 * 2 * 3 * ... * n (recursive)

  //3. Fibonacci function f(1) = 1 f(2) = 1 (fn) = f(n - 1) + f(n - 2)

  //4. Test if a number is prime
}
