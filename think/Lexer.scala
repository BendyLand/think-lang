package lexer

import scala.io.Source
import java.io.PrintWriter

def writeCurrentFile(file: String) = 
    new PrintWriter("../current-file.th") { write(file); close() }

def readFile(path: String): String = 
    Source
        .fromFile(path)
        .getLines()
        .mkString("\n")
