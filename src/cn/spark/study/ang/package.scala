package cn.spark.study

/**
  * Created by ang on 2018/8/19.
  * 必须给出函数名和参数，还有类型，不必给出返回值类型，只要不是递归，函数就可以推断出返回类型
  */
package object func1 {
  def main(args: Array[String]) {
//    sayHello("ang",18)
//    println(feb(10))
    println(params(10,10,3,5))
    println(params(1 to 5:_*))

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
}



