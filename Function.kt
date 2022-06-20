import javax.sound.sampled.Line

fun main(args: Array<String>)
{

    fun forcechoke() //function created without parameter
    {
      print("Hello my friend\n")

    }

    forcechoke() //call the function

    fun calculateNumbers( a: Int, b: Int):Int //function with return type
    {

        val c=a+b
        return  c
    }

    val cal = calculateNumbers(10,20)
    print(cal)

    print("\nCalculated value is $cal")

    fun mymood(mood : String = "Hungry")
    {

        print(mood)
    }

    mymood()
    print("\n Iam entereing a new value")
    mymood("Angry")


    fun createAnEnter(stmt :String)
    {

        print(stmt)
    }

    createAnEnter("\nI am a disco dancer")

    println("\nThe line iam printing is ${createAnEnter(stmt = "I am a Joker")}")
}