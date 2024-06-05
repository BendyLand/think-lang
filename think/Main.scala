// scalac *.scala && scala main.run
package main

import lexer.*
import parser.*

@main def run() =
    println("\nHello Think!\n")
    val file = readFile("../test.th")
    val fileNoComments = removeComments(file)
    val dataDefs = extractDataDefinitions(file)
    println("Data definitions:")
    dataDefs.foreach(println)

    writeToFile("../current-file.th", fileNoComments)
    writeToFile("../data-definitions.th", dataDefs.mkString("\n"))
