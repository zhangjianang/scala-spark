package cn.spark.study.ang

import scala.collection.mutable.ArrayBuffer

/**
  * Created by adimn on 2018/8/20.
  */
object angArray {
  def main(args: Array[String]) {
//    arrayDiffBuffer()
//    arrayDiffBuffer(true)
    genArray()
  }

  def arrayDiffBuffer(showArray:Boolean=false): Unit ={

    if(showArray){
      var a =new Array[Int](10)
      a(1) =10
      println(a(1))
      //必须设成可变的。
      a++=Array(1,2,3)
      println(a(0))
      println(a(10))
      println(a(11))
      println(a(12))
      //    a += 1 false 不允许这样，array 一旦设定说明就是不能变的了。
      var c = a.toBuffer

      println(a.mkString("-"))
      println(a.max)
      println(a.sum)
      scala.util.Sorting.quickSort(a)
      println(a.mkString("-"))
      println(a.toString)

    }else{
      var buf = new ArrayBuffer[Int](5)
      buf+=1
      buf++=(1 to 5)
      buf.insert(3,11,12,13)
      buf.remove(0)
      iteratorBuff(buf)
      iteratorBuff(buf,2)

      buf.toArray
    }


  }

  def iteratorBuff(buf:ArrayBuffer[Int],itype:Int=1): Unit ={
    if(itype==1){
      for(per <- buf)
        println(per)
    }else if(itype ==2 ){
      for(i <- (0 until buf.length)){
        println("until:"+i +","+buf(i))
      }
      for(i <- (0 until buf.length).reverse){
        println("until:"+i +","+buf(i))
      }
    }
  }

  def genArray(): Unit ={
    var a = for(i <- (0 until 10)) yield i*2
    for(p <- a){
      println(p)
    }
  }
}
