trait car
{
    def steer:Unit;
    def Start():Unit={ 
        println("Firing up engine")
    }
}
// DemoClass inherits trait
class DemoClass extends car
{
    def steer():Unit={
        println("Steering");
    }
}
object printValues
{
    // Main method
    def main(args: Array[String]):Unit={
         println("Name : Prem Ranjan Pattanayak")
        println("Section : DS         ")
        println("Roll No : 47         ")
        val ob = new DemoClass();
        ob.steer();
        ob.Start();
    }
}
