fun main()
{

    val smaller = 10
    val bigger =100

    // 1 st way of writing if Condition
     val max = if (bigger>smaller) bigger else smaller

    print(max)

   // 2nd way of writing if Condition


   if (bigger>10)
   {
       println(" Bigger is greater $bigger than 10" )
   }
    else if(bigger>100)
   {
       println(" Bigger is greater $bigger than 100" )

   }

    else
   {
    println("not too big")
   }

    // 3rd way to include strings in if else block

    val number =1

    val bucket:Any =if(number>100) // mention to return
    {
        "alpha"
    }
    else if(number>10)
    {
        print("Less than  90")
        2
    }
    else if(number>80)
    {
        1
    }
    else
    {
        0
    }

    print("bucket =$bucket")

    //returning an true or flase

    val number2 = number>100

    println(number2)




}