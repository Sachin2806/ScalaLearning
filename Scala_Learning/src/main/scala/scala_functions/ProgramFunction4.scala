package scala_functions

object ProgramFunction4 {
  
  def main(args: Array[String])
  {
   
    //Demo of higher order functions
    def math(x: Double, y: Double, z: Double, f:(Double, Double) => Double): Double = f(f(x,y), z);
    
    val result1 = math(30, 40, 50, (x,y) => x+y);
    val result2 = math(40, 50, 60, (x,y) => x*y);
    val result3 = math(50, 60, 70, (x,y) => x max y);
    val result4 = math(60, 70, 80, (x,y) => x min y);
        
    println(s"Total sum is = $result1")
    println(s"Total Mul is = $result2")
    
    println(s"max value is = $result3")
    println(s"min value is = $result4")
    
  }
  
  
}
