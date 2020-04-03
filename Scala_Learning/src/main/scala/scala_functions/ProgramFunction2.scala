package scala_functions

object ProgramFunction2 {
  
  def main(args: Array[String])
  {
    
    println("\nStep 2: How to call a function with parameters")
    //val totalCost = calculateDonutCost("Glazed Donut", 5)
    val totalCost = calculateDonutCost(5, 5)
    println(s"Total cost of donuts = $totalCost")

    println("\nStep 3: How to define and use a function with no return type")
    printDonutSalesReport()
  }
  
  def printDonutSalesReport(): Unit = 
  {
  // lookup sales data in database and create some report
  println("Printing donut sales report... done!")
  }
  
  def calculateDonutCost(donutItems: Int, quantity: Int): Unit = 
  {
    println(s"Calculating cost for $donutItems, quantity = $quantity")  
  }
}
