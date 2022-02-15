package demo01_highfunction

// Scala混合了面向对象和函数式的特性，在函数编程语言中，函数是“头等公民”，
// 它和Int、String、Class等其他类型处于同等的地位，可以向其他类型的变量一样被传递和操作。
// 如果一个函数的参数列表可以接收函数对象，那么这个函数就被称为高阶函数（High-Order Function）
// 如之前学习过的map方法，它就可以接收一个函数，完成List的转换
// 常用的高阶函数有以下几类：
// 1.作为值的函数
// 2.匿名函数
// 3.柯里化
// 4.闭包等等

// 在Scala中，函数就像数字、字符串一样，可以将函数对象传递给一个方法。
// 例如：我们可以对算法进行封装，然后将具体的动作传递给函数，这种特性很有用
object D01_函数作为对象传递 {

  def main(args: Array[String]): Unit = {
    // 将一个整数列表中的每个元素转换为对应个数的小星星
    val list = (1 to 10).toList
    // 定义函数对象，将Int->String
    val function = (x: Int) => "*" * x
    // 调用map方法，将list转换成目标列表
    val list1 = list.map(function)
    println(list1)
  }

}
