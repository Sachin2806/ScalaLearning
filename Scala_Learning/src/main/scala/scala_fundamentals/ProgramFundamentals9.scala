package scala_fundamentals

object ProgramFundamentals9 {
  
  def main(args: Array[String]){
    
  println("Creating of Tuple")
  val a = ("Sachin", 38)
  val name1 = ("Chavan", "Sachin")
  
  println("\nAccessing the tuple")
  println("Name : " + a._1)
  println("Age  : " + a._2)
  println()
  
  println("get the tuple class : " + a.getClass)
  
  println("\nIterating over Tuple")
  val b = ("Al", 42, 200.0)
  
  println("\nIterating over a Scala tuple")
  b.productIterator.foreach(println)
  
  //Use variable names to access tuple elements
  val(name, age, weight) = getUserInfo
  
  println("\nThe tuple toString method" + a.toString())
  
  println("\nAnother Method of creating the Tuple : " + (1 -> "a"))
  println("Another Method of creating the Tuple : " + ("a" -> 1))
  
  val c = new Tuple1("Ambika", 32, "Wife")
  println("\n" + c._1)
  
  println("Swapping elements in tuple : " + name1.swap)
  
  
  }
  
  //Creating a simple method
  def getUserInfo = ("Al", 42, 200.0)
}