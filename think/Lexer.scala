package lexer

import scala.io.Source

def readFile(path: String): String = 
    Source
        .fromFile(path)
        .getLines()
        .mkString("\n")
