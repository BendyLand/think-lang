// ./bld && scala -classpath build main.run 
package main

import lexer.*
import parser.*
import tokens.*

@main def run() =
    println("\nHello Think!\n")
    val file = readFile("think-files/test.th")
    val fileNoComments = removeComments(file)
    val dataDefs = extractDataDefinitions(fileNoComments)
    println("Data definitions:")
    dataDefs.foreach(println)
    writeToFile("think-files/current-file.th", fileNoComments)
    writeToFile("think-files/data-definitions.th", dataDefs.mkString("\n"))
