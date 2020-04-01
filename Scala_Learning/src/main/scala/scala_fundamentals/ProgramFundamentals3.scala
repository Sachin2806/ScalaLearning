package scala_fundamentals

object ProgramFundamentals3 {
  
  def main(args: Array[String]){
    
    //Declaring Scala Supported Types Using Inference
    println("Step 2: Scala Types")
    val donutsBoughtToday = 5
    val bigNumberOfDonuts = 100000000L
    val smallNumberOfDonuts = 1
    val priceOfDonut = 2.50
    val donutPrice = 2.50f
    val donutStoreName = "Allaboutscala Donut Store"
    val donutByte = 0xa
    val donutFirstLetter = 'D'
    val nothing = ()
    
    println("\nStep 3: Using Scala compiler to convert from one data type to another")
    val a: Short = 1
    val b: Int = a
    
    println("After conversion : " + a.toInt)
    
    //User driven conversion from one data type to another
    val str:String = a.toString()
    println("After conversion : " + str)
  }
  
}