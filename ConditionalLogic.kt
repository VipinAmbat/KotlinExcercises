fun main()
{

    val a=2
    val b=2

    if (a==b)
    {

        println("A is equal to B")

    }

    val c=5

    if (a != c)

    {

        println(" A is not equal to C")
    }



    val accountBalance = 100

    val price =50

    if(accountBalance>=50)
    {

        println("You can buy this item")
    }
    else
    {

        println("You have broke the item")
    }

    val degrees =30


    if (degrees>=50)
    {
        print("Its cold")
    }

    else if(degrees>10 && degrees<50)
    {
        println("Its supercold")

    }
    else
    {
        println("Its hot")
    }


    //Use of when statement


    val num =1

    when(num)
    {

        1 -> println("num==1")
        2 -> println("num==2")
        else -> println("num  is not one nor 2")

    }
}