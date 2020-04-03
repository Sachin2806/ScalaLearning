package scala_fundamentals

object ProgramFundamentals11 {
  
  def main(args: Array[String]){
    
    val name1:Any = "Sachin"
    println(s"Type of Any    : $name1")
   
    val name2:AnyRef = "Ambika"
    println(s"Type of AnyRef : $name2")
    
    val name3:AnyVal = 25.64
    println(s"Type of AnyVal : $name3")
    
  }
  
  
}
