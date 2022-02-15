package demo02_exercise

object Calculator {

  // 定义方法实现两个整数的加减乘除操作
  // 方式1：普通写法
  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Int = a / b


  // 方式2：柯里化操作
  def calculate(a: Int, b: Int)(fun: (Int, Int) => Int): Int = fun(a, b)

  def main(args: Array[String]): Unit = {

    println(add(7, 3))
    println(subtract(7, 3))
    println(multiply(7, 3))
    println(divide(7, 3))

    println("-" * 10)

    println(calculate(7, 3)(_ + _))
    println(calculate(7, 3)(_ - _))
    println(calculate(7, 3)(_ * _))
    println(calculate(7, 3)(_ / _))

  }

}
