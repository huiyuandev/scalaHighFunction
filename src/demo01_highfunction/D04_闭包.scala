package demo01_highfunction

// 闭包指的是可以访问不在当前作用域范围数据的一个函数
// 柯里化就是一个闭包
object D04_闭包 {

  // 使用闭包实现求两个整数的和
  def main(args: Array[String]): Unit = {
    val x = 15
    val getSum = (y: Int) => {
      x + y
    }
    println(getSum(59))
  }

}
