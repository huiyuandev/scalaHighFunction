package demo01_highfunction

// 在Scala中，没有赋值给变量的函数就是匿名函数
object D02_匿名函数 {

  def main(args: Array[String]): Unit = {
    val list = (1 to 10).toList
    val list1 = list.map((x: Int) => "*" * x)
    println(list1)

    // 优化版
    val list2 = list.map("*" * _)
    println(list2)
  }

}
