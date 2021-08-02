

object userInput {
  def main(args : Array[String])
  {
    print("Enter name : ")
    val s = scala.io.StdIn.readLine()
    print("Enter Roll no. : ")
    val i = scala.io.StdIn.readInt()
    print("Enter marks : ")
    val f = scala.io.StdIn.readFloat()
    
    println();
    println("Name : "+s)
    println("R.No : "+i)
    println("Marks : "+f)
  }
}