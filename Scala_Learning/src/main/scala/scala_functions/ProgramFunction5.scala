package scala_functions
import java.util.Date

object ProgramFunction5 {
  
  def main(args: Array[String])
  {
    val list = List(1,2,3,4,5)
    val hof = list.map(x => (x *2))
     
    //Creating a normal function
    def doubler(i: Int): Int = {return i * 3}
    
    //Assigning a function to a variable
    val d = doubler(_)
    
    //Creating an anonymous functin and assigning it a variable e
    val e = (i:Int) => { i * 4}:Int
    
    val r = 1 to 10
    val res1 = r.map(doubler)
    val res2 = r.map(d)
    
    println("Value after high order function is applied Example 1 	: " + hof)
    println("Value after high order function is applied Example 2 	: " + doubler(5))
    println("Value after high order function is applied Example 3 	: " + d(10))
    
    println("\nValue after high order function is applied Example 4 	: " + res1)
    println("Value after high order function is applied Example 5 	: " + res2)
    
    println("Value after high order function is applied Example 6 	: " + e(3))
    
    println("\nValue after high order function is applied Example 7 	: " + r.map(getOps1(3)))
    println("Value after high order function is applied Example 7 	: " + r.map(getOps2(6)))   
    
    println("\nValue after recursive function is applied Example 1  	: " + rFactorial(6))
    println("\nValue after tail recursive function is applied Example 2 : " + tFactorial(4,1))
    
    val sum = (a:Int, b:Int, c:Int) => a + b + c
    val f = sum(10, _:Int, _:Int)
    println("\nDemo of partially Defined Function Example 1 		 : " + f(20, 30))
   
    val date = new Date
    val newLog = log(date, _:String)
    newLog("Demo of partially Defined Function for logging message")
   
    //Closures - Here num is declared outside the function
    var num = 10
    val add = (x:Int) => x + num
    println("Demo of Closures in Scala 			      :	" + add(20))
  }
  
  def log(date:Date, message:String) =
    {
      println(date + "  " + message)
    }


  def getOps1(c:Int) = (i:Int) =>
    {
      val doubler = (x:Int) => {x*2}
      val tripler = (y:Int) => {y*2}
      if (c > 0 ) doubler(i) else tripler(i)       
    }
    
    //Creating an anonymous functions
    def getOps2(c: Int) = (i:Int) =>
    {
        if (c > 0 ) {i * 2} else { i * 3}       
    }
    
    //Creating a recursive function
    def rFactorial(n:Int):Int = 
    {
      if (n <= 0) return 1 else return n * rFactorial(n -1)
    }
    
    //Creating a tail recursive function
    def tFactorial(n:Int, f:Int):Int = 
    {
      if (n <= 0) return f else return tFactorial(n -1, n*f)
    }
    
}
