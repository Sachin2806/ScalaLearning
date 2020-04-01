package scala_fundamentals

object ProgramFundamentals7 {
  
  def main(args: Array[String]){
    
  println("Step 1: How to use while loop in Scala")
  var a = 5
  while ( a > 0)
  {
    println("value of a : " + a)
    a = a -1
  }
  
  println("\nStep 2: How to use do while loop in Scala")
  var b = 0
  do {
      b = b + 1
      println("value of b : " + b)    
     }while(b < 5)
  
  
  }
  
}