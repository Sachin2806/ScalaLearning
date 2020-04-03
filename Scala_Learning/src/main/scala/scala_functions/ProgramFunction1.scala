package scala_functions

object ProgramFunction1 {
  
  def main(args: Array[String])
  {
     //Scala Function Example without using = Operator
     functionExample1() 
     
     //Scala Function Example with = Operator
     var result1 = functionExample2()
     println("Scala Function Example with = Operator = " + result1)
     
     //Scala Parameterized Function Example
     functionExample3(10, 20) 
     
     //Scala Recursion Function
     var result2 = functionExample4(5,4)   
     println(s"Scala Recursion Function =  $result2")
     
     //Scala Function Parameter example with default value
     var result3 = functionExample5(15,2)     // Calling with two values  
     var result4 = functionExample5(15)   // Calling with one value  
     var result5 = functionExample5()     // Calling without any value    
      
     println("\nBoth parameters passed during the call to function 	: " + result3) 
     println("Only one parameter passed during the call to function 	: " + result4) 
     println("No parameters passed during the call to function 	: " + result5) 
      
     //Scala Function Named Parameter Example
     var result6 = functionExample5(a = 15, b = 2)     
     var result7 = functionExample5(b = 25, a = 3)     
     var result8 = functionExample5(35,4)             
     
     println("\nParameters names are passed during call 	 : " + result6) 
     println("Parameters order have changed during call 	 : " + result7) 
     println("Only values are passed during call 	         : " + result8) 
        
  } 
  
  def functionExample1()
  {
    println("Scala Function Example without using = Operator")
  }
  
  def functionExample2(): Int =
  {
    var a = 10
    return a * a
  }
  
  def functionExample3(x:Int, y:Int) =
  {
     var sum = x + y
     println(s"Scala Parameterized Function Example = $sum")
  }
  
  def functionExample4(x:Int, y:Int):Int = 
  {
    if (y == 0)
      return 0
    else
      x + functionExample4(x, y-1)
  }
   
  def functionExample5(a:Int =0, b:Int = 0):Int = 
  {  
     return a+b  
  }  
  
  
}