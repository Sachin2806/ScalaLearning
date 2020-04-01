package scala_fundamentals

object ProgramFundamentals10 {
  
  def main(args: Array[String]){
    
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      
    println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
    println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))
  
    println("\nshow(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")) )
    println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")) )
  
    //Using getOrElse() Method
    val a = Some(5)
    val b = None 
      
    println("\na.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(11): " + b.getOrElse(11))
    
    //Using isEmpty() Method
    println("\na.isEmpty: " + a.isEmpty )
    println("b.isEmpty: " + b.isEmpty )
    
    println("\nStep 1: How to use Option and Some - a basic example")
    val glazedDonutTaste: Option[String] = Some("Very Tasty")
    println(s"Glazed Donut taste = " + glazedDonutTaste.get)
  }
  
  def show(x: Option[String]) = x match 
  {
      case Some(s) => s
      case None => "?"
  }
}
