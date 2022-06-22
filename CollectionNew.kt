fun main()
{
    // creating an array

    val names = kotlin.collections.listOf("Emperor","Kings Vike","Richard Mary","Heroes") //Immutable

    println(names)

    // sort the list
    println("Sorting the list")
    println(names.sorted())

    // find element on a list
    println("Find the second element on the list")
    println(names[2])

    //find first element of the list
    println("Show first and last element of the list")
    println(names.first())
    println(names.last())


    //find if the text is contained

    println(names.contains("Heroes"))


    // **********************************************************************************//


    // Mutable array

    val chess = arrayListOf("King","Queen")
    println("Print the chess list")
    println(chess)

    // Add an element

    chess.add("Soldier")
    print(chess)

    // Add an element via index

    chess.add(1,"Horse")
    print(chess)

    // size of chess list
    println("Size of chess list")
    print(chess.size)

    // remove an element

    println(chess.remove("Horse"))
    print(chess)

    // ********************************************************************************** ///


    println(" Working on Map collection")


    val map1 = mapOf("Name" to "Phone","Call" to "Number")

    println(map1.get("Name"))

    println(map1["Call"])

    println(map1.getOrDefault("ID","DP profile"))

    println(map1.values)

    val hmap = hashMapOf("Name" to "Phone","Call" to "Number","ID" to "Marker")

    print(hmap)
    hmap.clear()





}