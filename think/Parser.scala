package parser

def extractDataDefinitions(file: String): Array[String] = 
    val lines = file.split("\n")
    var result = Array.empty[String]
    for line <- lines do
        // For now, data cannot include '=' or ':', 
        // and should be a total of one token.
        val isDataDef: Boolean = 
            !line.contains("=")  && 
            !lines.contains(":") &&
            (line.split(" ").size == 1)
        if isDataDef then
            result = result :+ line
    result

def removeComments(file: String): String = 
    val lines = file.split("\n")
    var result = ""
    lines.foreach { line =>
        if line.contains("#") then
            val index = line.indexOf('#')
            result += line.substring(0, index) + "\n"
        else
            result += line + "\n"
    }
    result
