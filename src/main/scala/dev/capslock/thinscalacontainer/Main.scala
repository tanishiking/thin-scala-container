package dev.capslock.thinscalacontainer

import cats.implicits.*

import scala.language.postfixOps

@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  println(mult)

def msg = "I was compiled by Scala 3. :)"

def mult = (1 to 9 toList, 1 to 9 toList) mapN (_ * _)