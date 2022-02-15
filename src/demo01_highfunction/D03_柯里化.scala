package demo01_highfunction

// 柯里化（Currying）是指将原先接收多个参数的方法转换为多个只有一个参数的参数列表的过程
object D03_柯里化 {

  // 拼接两个字符串
  // 方式1：普通写法
  def merge1(s1: String, s2: String): String = s1 + s2

  // 方式2：柯里化
  // fun表示函数，可以自定义各种操作，很灵活，不用修改方法体代码
  def merge2(s1: String, s2: String)(fun: (String, String) => String): String = fun(s1, s2)

  def main(args: Array[String]): Unit = {
    val s1 = "xxx"
    val s2 = "yyy"
    println(merge1(s1, s2))

    // 拼接字符串
    val str = merge2("aaa", "bbb")(_ + _)
    println(str)

    // 将第一个字符串转换成大写再与第二个字符串拼接
    val str1 = merge2("ddd", "fff")(_.toUpperCase() + _)
    println(str1)
  }

}
