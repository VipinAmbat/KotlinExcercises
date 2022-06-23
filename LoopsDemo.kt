fun main()
{

    val vehicles = arrayListOf("Mercedes","BMW","Audi","Tiago")

    for (a in vehicles)
    {

        println("Name of vehicle is :$a")
    }

    val map1 = mapOf("Name" to "Phone","Call" to "Number")

    for ((key,value) in map1)
    {

        println("Key:$key is associated with value:$value")

    }

   var x=0

    while(x<=10)
    {
        println(x)

        x=x+1



    }
}