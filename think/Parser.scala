package parser

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
