package parser

import scala.io.Source

def readFile(path: String): String = 
    Source
        .fromFile(path)
        .getLines()
        .mkString("\n")

def splitFileIntoLines(file: String): Array[String] = 
    file.split("\n")