fun main()

{

    val greeting: String = " Happy Birthday"

    val owe = 50

    println("Maggie owes me \$$owe by this month")

    println(" The greeting [$greeting] variable has ${greeting.length} number of characters")

    // get te value from index

    val bad = greeting.get(2)

    val letter =greeting[1]

    println(bad)

    println(letter)


    var compare1 = "Beta"

    var compare2 ="Alpha"

    println("Comparing two string ${compare1.compareTo(compare2)}")

    val sub1 = greeting.subSequence(1,6)

    println("Subsequence is $sub1")

    // using for loop in strings

    for (single in greeting)
    {

        println("Single is $single")
    }


}