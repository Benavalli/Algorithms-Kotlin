package org.example

import Factorial
import Hashing
import InsertionSort
import MergeSort
import hashing.couting.StringCounting
import queue.QueueAlgorithms
import stack.Stack

fun main() {
    //val inputArray = intArrayOf(5, 4, 3, 2, 0, 10, 10, 3, 1, 12, -3, -10, 7)
//    val insertionSort = InsertionSort()
//    insertionSort.insertionSortAsc(inputArray).forEach { print("$it, ")}
//    println()
//    insertionSort.insertionSortDesc(inputArray).forEach { print("$it, ")}
//    println()
//    val factorial = Factorial()
//    println("Factorial of 5 is ${factorial.factorial(5)}")
//    println()
    //val mergeSort = MergeSort()
    //println(1 / 2)
    //mergeSort.mergeSort(inputArray).forEach { print("$it, ") }


    //println(hashing.firstSecondOccurrence("amora"))


    //val stack = Stack()
    //print(stack.removeAllAdjacentDuplicates("abbaca"))

   // val queue = QueueAlgorithms()
    //queue.play()
    val count = StringCounting().computeOccurences()
    print(count)



}
