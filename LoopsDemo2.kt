fun main()
{

    for (i in 1..10){

        print(i)

    }

    val students = listOf("Subin","Hero","Klark")

    for (student in students)
    {

        println(student)
    }

    for ((index,student) in students.withIndex())
    {

        println("Students ${index+1} and name is ${student}")
    }

    println("while")

    var count =0

    while(count<5)
    {
       println(count)
        count++

    }

    println("do while")

    var a =0
    do{

        println(a)
        a++
    }while(a<5)

}