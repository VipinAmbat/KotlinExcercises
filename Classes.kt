// Object and Class in Kotlin

class Car constructor(make:String,model:String)
{

    val make = make
    val model = model

    fun accelerate()
    {
        print("Speed is given")
    }


}

fun main()
{

     val Car1 = Car(make = "Toyota", model = "Avalon")
    println(Car1.make)
    println(Car1.model)
    Car1.accelerate()

}
