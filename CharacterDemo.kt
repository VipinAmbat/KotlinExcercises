fun main()
{

    val a:Int =25 //Immutable

    var b: Int = 67 //mutable

    var c =89

    print("The numbers are $a $b $c")

    val letter : Char = 'A'

    val infinity1 ='\u221E'

    val tab = '\t'

    println("Char given is $letter")
    println ("Infinity is equal to $infinity1")
    println("Placing a space $tab")

    // Boolean data

    val firstVar = true

    val secondVar = false

    println("Negating first operation ${!firstVar} ")

    if(firstVar || secondVar)
    {
        println("at least one operand is true")
    }

    if(firstVar && secondVar)
    {
        println("at least both operand are true")
    }



}