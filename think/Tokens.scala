package tokens

type Value = Int | Double | Char | String | Boolean

object Token:
    case class Data(value: Value)
    case class Variable(name: String)
    case class Fact(condition: String)
    case class Rule(condition: String)



