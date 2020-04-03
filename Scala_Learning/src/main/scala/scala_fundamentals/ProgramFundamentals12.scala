package scala_fundamentals

object ProgramFundamentals12 {
  
  def main(args: Array[String]){
    
    println("Step 1: How to create an enumeration")
    object Donut extends Enumeration 
    {
      type Donut = Value

      val Glazed      = Value("Glazed")
      val Strawberry  = Value("Strawberry")
      val Plain       = Value("Plain")
      val Vanilla     = Value("Vanilla")
    }

    println("\nStep 2: How to print the String value of the enumeration")
    println(s"Vanilla Donut string value = ${Donut.Vanilla}")

    println("\nStep 3: How to print the id of the enumeration")
    println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")
    
    println("\nStep 4: How to print all the values listed in Enumeration")
    println(s"Donut Types = ${Donut.values}")
    
    println("\nStep 5: How to pattern match on enumeration values")
    Donut.values.foreach {
      case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
      case _ => None
}
  
  }
  
}
