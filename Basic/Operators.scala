

object Operators {
  def main(args : Array[String])={
    var a = 20;
    var b = 10;
    var c = 30;
    var d = true;
    var e = false;
    
    //Arithmetic Operators
    println("\nArithmetic Operators:");
    println("a = "+a," b = "+b);
    println("a + b = "+(a + b));
    println("a - b = "+(a - b));
    println("a / b = "+(a / b));
    println("a x b = "+(a * b));
    println("15 % 4 = "+(15 % 4));
    
    //Logical Operators
    println("\nLogical Operators:");
    println("d = "+d," e = "+e);
    //   a||b   => || is not a member of Int
    println("Logical OR : d || e = "+(d || e));
    println("Logical AND : d && e = "+(d && e));
    println("Logical NOT :  !e = "+(!e));
    
    // Relational Operators
    println("\nRelational Operators:");
    println("(==, !=, >, <, >=, <=)");
    println("5==5.0 : "+ (5==5.0));
    println("7 > 8 : "+ (7 > 8));
    
    // Bitwise Operators
    println("\nBitwise Operators:");
    println("(&,|, ~, ^, <<, >>, >>>)");
    println("3 & 7 : "+ (3 & 7));
    println("7 | 10 : "+ (7 | 10));
    println("~10 : "+ (~10));
    println("8>>2 : "+ (8>>2));
    
    // Assignment Operators
    println("\nAssignment Operators:");
    println("(=, +=, -=, *=, /=, %=, <<=, >>=, &=, |=, ^=)");
    println("a = "+a," b = "+b);
    a += 2;
    println("a += 2 : "+ (a));
    a -= 4;
    println("a -= 4 : "+ (a));
    a <<= 2;
    println("a <<= 2 : "+ (a));
  }
}