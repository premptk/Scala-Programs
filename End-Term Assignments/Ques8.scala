object closures{
    def main(args: Array[String]):Unit={
        var name = "Himanshu";
        isEligible(12, name);
    }
    var valid_age = 18;
    def isEligible(age: Int, name: String) = {
        println("Name : Prem Ranjan Pattanayak")
        println("Section : DS         ")
        println("Roll No : 47         ")
        if(age>=valid_age)
            println(s"$name of age $age is eligible");
        else
            println(s"$name of age $age is ineligible");
    }
}
