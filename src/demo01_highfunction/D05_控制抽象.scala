package demo01_highfunction

//控制抽象也是函数的一种，它可以让我们更加灵活的使用函数，假设函数A的参数列表需要接收一个函数B，
//且函数B没有输入值也没有返回值，那么函数A就被称为控制抽象函数
object D05_控制抽象 {

  def main(args: Array[String]): Unit = {
    val myShop = (f1: () => Unit) => {
      println("Welcome in!")
      f1()
      println("Thanks for coming!")
    }
    myShop {
      // 匿名函数，无参无返回值
      () => {
        println("买苹果")
        println("买香蕉")
        println("买黄瓜")
      }
    }

  }

}
