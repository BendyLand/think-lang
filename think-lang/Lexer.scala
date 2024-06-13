package lexer

import scala.io.Source
import java.io.PrintWriter

def writeToFile(path: String, contents: String) = 
    new PrintWriter(path) { write(contents); close() }

def readFile(path: String): String = 
    Source
        .fromFile(path)
        .getLines()
        .mkString("\n")
