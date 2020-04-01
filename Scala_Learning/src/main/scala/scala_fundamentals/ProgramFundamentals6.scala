package scala_fundamentals

object ProgramFundamentals6 {
  
  def main(args: Array[String]){
    
  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val a1 = 1 to 5
  println(s"Range from 1 to 5 : $a1")
  
  println("\nStep 2: Create a numeric range from 1 to 5 but excluding the last integer number 5")
  val a2 = 1 until 5
  println(s"Range from 1 until 5: $a2")
  
  println("\nStep 3: Create a numeric range from 0 to 10 but increment with multiples of 2")
  val a3 = 0 to 10 by 2
  println(s"Range from 1 until 5: $a3")
  
  println("\nStep 4: Create an alphabetical range to represent letter a to z")
  val alphaRange = 'a' to 'z'
  println(s"Range from 1 until 5: $alphaRange")
  
  println(s"\nStep 5: Character ranges with user specified increment")
  val alphabetRangeFromAToZBy2 = 'a' to 'z' by 2
  println(s"Range from 1 until 5: $alphabetRangeFromAToZBy2")
  
  println("\nStep 6: Storing our ranges into collections")
  val listFrom1To5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1To5.mkString(" ")}")

  val setFrom1To5 = (1 to 5).toSet
  println(s"Range to set 	= ${setFrom1To5.mkString(" ")}")

  val sequenceFrom1To5 = (1 to 5).toSeq
  println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")
  
  println("\nUse of wild character to print the elements")
  arrayFrom1To5.foreach(print(_))
  
  }
  
}