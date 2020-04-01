package scala_fundamentals

object ProgramFundamentals5 {
  
  def main(args: Array[String]){
    
  println("Step 1: A simple for loop from 1 to 5 inclusive")
  
  for (i <- 1 to 5)
  {
    println("value of i : " + i)
  }
  
  println("\nStep 1: A simple for loop from 1 to 5, where 5 is NOT inclusive")

  for (j <- 1 until 5)
  {
    println("value of j : " + j)
  }
  
  println("\nStep 3: Filter values using if conditions in for loop")
  val a = List(1,2,3,4,5)
  for(i <- a if i == 2)
  {
    println("Value found : " + i)
  }
  
  println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
  val names = List("sachin", "ambika", "shubham", "deepu")
  val srchnames = for 
  {
    i <- names
    if(i == "sachin" || i == "ambika")        
  }yield i
  println(s"Name found : $srchnames")
  
  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "Sachin"
  twoDimensionalArray(0)(1) = "Ambika"
  twoDimensionalArray(1)(0) = "Shubham"
  twoDimensionalArray(1)(1) = "Deepu"
  
  for{    
      x <- 0 until 2
      y <- 0 until 2
     }
  println(s"Values at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")  
  println()
  val multiArray1 = Array.ofDim[Int](3,2)
  multiArray1(0)(0) = 4 
  multiArray1(0)(1) = 55
  multiArray1(1)(0) = 87
  multiArray1(1)(1) = 12
  multiArray1(2)(0) = 95
  multiArray1(2)(1) = 132
  
  for(i <- 0 to 2; j <- 0 to 1)
  {
    println("Element " + i + j + " = " + multiArray1(i)(j))
  }
  
  println()

  val rows = 2
  val cols = 3
  
  //Use the Array.ofDim method to create the array you need:
  val a1 = Array.ofDim[String](rows, cols)
  
  a1(0)(0) = "a"
  a1(0)(1) = "b"
  a1(0)(2) = "c"
  a1(1)(0) = "d"
  a1(1)(1) = "e"
  a1(1)(2) = "f"

  for(i<- 0 to 1; j <- 0 to 2)
  {
    println(s"Value of a($i)($j) = ${a1(i)(j)}")
  }
  
   println()
  //Creating 3 dimensional Array
  val x, y, z = 2
  val a2 = Array.ofDim[Int](x,y,z)
  
  a2(0)(0)(0) = 1
  a2(0)(0)(1) = 2
  a2(0)(1)(0) = 3
  a2(0)(1)(1) = 4
  a2(1)(0)(0) = 5
  a2(1)(0)(1) = 6
  a2(1)(1)(0) = 7
  a2(1)(1)(1) = 8
  

  for(i <- 0 until x; j <- 0 until y; k <- 0 until z)
  {
    println(s" Values in a2($i)($j)($k) = ${a2(i)(j)(k)}")
  }
  }
  
}