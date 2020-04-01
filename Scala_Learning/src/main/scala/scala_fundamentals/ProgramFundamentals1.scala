package scala_fundamentals

object ProgramFundamentals1 {
  
  def main(args: Array[String]){
    
    println("Using String interpolation to print a variable")
    val name = "Sachin Chavan"
    println(s"My name is : $name")
    println()
    
    println("Using String interpolation on object properties")
    val empDetails = Details("Sachin", 38 , "Engineer")
    println(s"My Details are : ${empDetails.name}, ${empDetails.age}, ${empDetails.designation}")
    println(s"My name is ${empDetails.name}, My age is ${empDetails.age}, My Designation is : ${empDetails.designation}")
    println()
    
    println("Using String interpolation to evaluate expressions")
    val age = 38
    println(s"Is the age same : ${age == 36}")
    println(s"Is the age same : ${age == 38}")
    
    println("Using String interpolation for formatting text")
    val firstname = "Sachin"
    val lastname = "Chavan"
    println(f"$firstname%20s $lastname")
    println()
    
    println("Using f interpolation to format numbers")
    val income = 100.30
    println(s"Salary is : $income")
    println(f"Salary is : $income%.2f")
    println()
   
    println("Using Raw interpolation")
    println(raw"My name is \t$name")
  }
  
  case class Details(name:String, age:Int, designation:String)
}