package me.m1key.scala

class LambdaRunner (f: () => Unit){

  def run(): Unit = {
    f
  }

  def runOther(f2: (String) => Unit): Unit = {
    f2("Lambda Runner")
  }

}
