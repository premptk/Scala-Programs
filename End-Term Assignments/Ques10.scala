object uppercase {
  def to_uppercase(str1: String): String = {
    str1.take(str1.length() - 4) + str1.drop(str1.length() - 4).toUpperCase()
  }
  def main(args: Array[String]): Unit = {
    println("Name : Prem Ranjan Pattanayak")
    println("Section : DS         ")
    println("Roll No : 47         ")
    println("Result: " + to_uppercase("Hello there"));
    println("Result: " + to_uppercase("abc"));
  }
}
