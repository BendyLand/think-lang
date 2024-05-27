package think

import parser.*

@main def run() = 
    println("\nHello Think!\n")
    val file = readFile("../test.txt")
    val lines = splitFileIntoLines(file)
    lines.foreach(println)