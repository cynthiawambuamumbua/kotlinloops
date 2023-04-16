fun main() {
    //How do you declare a for loop in Kotlin?
    val nums = arrayOf(2, 4, 5, 6, 7, 8, 9)
    for (num in nums) {
        if (num % 2 == 0) {
            println("even number")

        } else {
            println("odd number")
        }

    }
// How do you declare a while loop in Kotlin?
    var number = arrayOf("mumbua","jane","janet")
    var i = 0
    while (i < number.size) {
        println(number[i])
        i++
    }

////How do you declare a do-while loop in Kotlin?
//    var y=2
//    var z=5
//    do {
//       println(y*z)
//    }
//        while (i<=10)

//How do you use a loop to calculate the sum of an array in Kotlin?
    val array= intArrayOf(2, 4, 9, 3, 7)
    val sum = nums.sum()
    println(sum)

//  How do you use a loop to find the maximum value in an array in Kotlin?
    val k= listOf(1,2,3,4,5,6,7,8,9)
    var max=k.max()
    println(max)

//How do you use a loop to find the minimum value in an array in Kotlin?
    var b= listOf(23,67,9,78,1,3)
    var min=b.min()
    println(min)

// How do you use a loop to count the number of occurrences of a value in an array in Kotlin?
    var list= listOf(12,56,12,78,98,12,67)
    var count=list.count()
    println(count)

    //How do you use a loop to filter elements in an array in Kotlin?
    val names= listOf("cynthia","angela","asenath","ghetto","mike")
    var filter=names.filter { name->names=== names}
    println(filter)
}


