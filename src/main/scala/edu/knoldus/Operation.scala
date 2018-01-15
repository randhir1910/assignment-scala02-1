package edu.knoldus

import org.apache.log4j.Logger

class Operation {
  val log = Logger.getLogger(this.getClass)

  def rotateList(list: List[Symbol], length: Int): List[Symbol] = {
    if (list.length >= length) {
      list match {
        case _ if length == 0 => list
        case head :: tail => rotateList(tail :+ head, length - 1)
      }
    }
    else {
      log.info("index size should be less than list size")
      list
    }
  }

  def happyNumber(number: Int, list: List[Int]): Boolean = {
    def nextNumber(x: Int, next: Int): Int = {
      x match {
        case _ if x == 0 => next
        case _ => val temp = next + (x % 10) * (x % 10)
          nextNumber(x / 10, temp)
      }
    }

    list match {
      case _ if number < 0 => false
      case _ if number == 1 => true
      case head :: tail if tail.contains(number) => false
      case _ => val num = nextNumber(number, 0)
        happyNumber(num, num :: list)
    }
  }

  def compress(list: List[Symbol], result: List[Symbol]): List[Symbol] = {
    list match {
      case Nil => result.reverse
      case head :: Nil => compress(Nil, head :: result)
      case head1 :: head2 :: tail if head1 == head2 => compress(head2 :: tail, result)
      case head1 :: head2 :: tail if head1 != head2 => compress(head2 :: tail, head1 :: result)
    }
  }
}
