package edu.scaps

object Hello extends App {
  println("Hi!")
}

class Hello {
  def iu(number: Int): Int = number
}

class Miz {

  def mau(times: Int): String = 1.to(times).foldLeft("")((str, _) => str + "mau, ")

  def mauNice(times: Int): String = (1 to times).map(_ => "mau").mkString(", ")

}