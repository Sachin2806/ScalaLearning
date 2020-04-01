package scala_fundamentals

object ProgramFundamentals2 {
  
  def main(args: Array[String]){
    
    println("Step 1: How to escape a Json String")
    //For the below line, the Scala compiler will complain about the double quotes in the JSON field names.
    //val empDetails1 = "{"emp_name":"Sachin","designation":"Engineer","age":38}"
    
    println("\nStep 2: Using backslash to escpae quotes")
    val empDetails2 = "{\"emp_name\":\"Sachin\", \"designation\":\"Engineer\",  \"age\":38}"
    println(s"empDetails2 = $empDetails2")
    
    println("\nStep 3: Using triple quotes \"\"\" to escape characters")
    val empDetails3 = """{"emp_name":"Sachin", "designation":"Engineer",  "age":38}"""
    println(s"empDetails3 = $empDetails3")
    
    println("\nStep 4: Creating multi-line text using stripMargin")
    val empDetails4 =  """
                      |{
                        |"emp_name"     :"Sachin", 
                        |"designation"  :"Engineer",  
                        |"age"          :38
                      |}
                      """
        .stripMargin
    println(s"empDetails4 = $empDetails4")
    
    println("\nTip: stripMargin using a different character")
    val empDetails5 =  """
                      #{
                        #"emp_name"     :"Sachin", 
                        #"designation"  :"Engineer",  
                        #"age"          :38
                      #}
                      """
        .stripMargin('#')
    println(s"empDetails5 = $empDetails5")
    
    
  }
  
}