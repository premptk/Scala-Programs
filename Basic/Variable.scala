

object Variable {
  def main(args : Array[String])={
    //var is used for mutable objects
    println("Var objects :");
    var myVar = 10;
    var myVar2 = "Prem Ranjan";
    println("myVar = "+myVar);
    println("myVar2 = "+myVar2);
    myVar = myVar+1;
    println("myVar + 1 = "+myVar);
    
    //val is used for immuatble objects
    println("\nVal objects :");
    val myVal = 20;
    val myVal2 = "Prem";
    println("myVal = "+myVal);
    println("myVal2 = "+myVal2);
    //myVal = myVal+1; will throw Error (reassignment to val)
  } 
}