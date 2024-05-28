// scalac *.scala && scala main.run
package main

import lexer.*
import parser.*

@main def run() =
    println("\nHello Think!\n")
    val file = readFile("../test.th")
    val fileNoComments = removeComments(file)
    println(file)
    println(fileNoComments)

    