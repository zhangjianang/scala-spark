package cn.spark.study

import java.io.IOException

/**
  * Created by ang on 2018/8/19.
  * 必须给出函数名和参数，还有类型，不必给出返回值类型，只要不是递归，函数就可以推断出返回类型
  */
object func1 {
  def main(args: Array[String]) {
//    sayHello("ang",18)
//    println(feb(10))
//    println(params(10,10,3,5))
//    println(params(1 to 5:_*))
//    println(recur(1 to 10:_*))

    lazyFunc()

  }
  def sayHello(name:String,age:Int)= {
  if(age>18){
    printf("%s adult ",name)
    age
  }else if(age<18) {
    printf(name +" child "+age)
    age
  }else{
    println("no one")
  }
  }

  def feb(n:Int):Int = {
    if(n<=1) 1
    else feb(n-1)+feb(n-2)
  }

  def params(n:Int *)={
    var sum =0
    for(i<-n){
      sum+= i
    }
    sum
  }

  /**
    * 变长参数，需要制定*，
    * 使用时候，要是传入的是数组，要变换成可变参数 :_*
    * 递归函数 需要赋给返回值
    *
    * @param num
    * @return
    */
  def recur(num:Int*):Int={
     if (num.length == 0)0
     else
       num.head+recur(num.tail:_*)
  }

  /**
    *  过程没有返回值(无等号=)，或者直接将返回值设置成Unit
    *
    * @param a
    */
  def procedure(a:Int){println(a)}

  import scala.io.Source._

  def lazyFunc(name:String="newPath"): Unit ={

    lazy  val  lines = fromFile("C://Users//Administrator//Desktop//gs.txt").mkString
    lazy  val  line2 = fromFile("C://Users/adimn/Desktop/gs.txt").mkString
//    println(lines)
//    println(line2)


    try{
      lazy  val  line2 = fromFile("C://Users/adimn/Desktop/gs.txt").mkString
//      println(lines)
      throw new Exception("sth is wrong")
    }catch {
      case e:IOException => println("io exception")
      case e: Exception => println(e.getMessage)
      case _: Exception => println("default exception")
    }
  }
}



