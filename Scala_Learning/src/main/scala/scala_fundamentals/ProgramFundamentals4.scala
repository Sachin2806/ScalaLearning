package scala_fundamentals

object ProgramFundamentals4 {
  
  def main(args: Array[String]){
    
    println("Step 1: Using if clause as a statement")
    val a = 30
    val b = 20
    
    val numberOfPeople = 11
    val donutsPerPerson = 2
    val defaultDonutsToBuy = 8
    
    if(a > b)
      println("a greater")
        
    println(s"\nStep 2: Using if and else clause as a statement")
    if(a > b)
       println("a greater")
    else      
       println("b greater")
       
    println("\nStep 3: Using if, else if, and else clause as a statement")
    if(numberOfPeople > 10)
    {
      println(s"no of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    }
    else if(numberOfPeople == 0)
    {
      println("Number of people is zero.")
      println("No need to buy donuts.")
    }
    else
    {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
    }
    
    println("\nStep 4: Using if and else clause as expression")
    val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
    println(s"No of donuts to buy : $numberOfDonutsToBuy")
    
    
    
    
    
    
 }
  
}