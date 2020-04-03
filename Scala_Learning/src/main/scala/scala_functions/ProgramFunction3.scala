package scala_functions

object ProgramFunction3 {
  
  def main(args: Array[String])
  {
    //Passing function as arguments
    functionExample(25, multiplyBy2)
  }
  
  def functionExample(a:Int, f:Int=>AnyVal):Unit = 
  {  
     println("Value is : " + f(a))   
  }
  
  def multiplyBy2(a:Int):Int = 
  {  
     return a*2
  }
  
  //Demo of look at higher order functions
  
  //Define a list 
  val list = List(10,11,12,13)
  
  //Define a function that doubles each value that is given to it
  def doubleValue = (x: Int) => x * x
  
  //The List class has something called a map function which takes in other function and produces a new List. 
  //We are going to feed our doubleValue function to it
  val doubledList = list.map(x => doubleValue(x))
  
  println("High Ordered Function Example : " + doubledList)
}
