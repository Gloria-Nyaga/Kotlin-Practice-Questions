// PRACTICE 1

fun main() {
    //Question1
    studentRecords("Gloria Nyaga",23,"(+254) 799740005",63.80F,"Kenyan")

    //Question 2
    greetings("Gloria")

    //Question 3
    text("Hello","Nyaga")

    //Question 4
    solutions(20+30,20-30,20*30,20/30)

    //Question 5
    defineStatus(10)
    defineStatus(-8)
    defineStatus(0)

    //Question 6
    divisibleBySeven(14)
    divisibleBySeven(39)

    //Question 7
    statement("Gloria")
    statement("Nyaga")

    //Question 8
    alphabets("'b','z','y'")

    //Question 9
    school("Akirachix")

    //Question 10
     println ( introWord("Gloria",23))




}

//Question 1
//You are creating an app to capture student records. Some of the data you will capture includes full name, age, phone numbers, weight in Kg and citizen. For the citizen field you will track whether a student is Kenyan or Not.

fun studentRecords(fullName:String,age:Int,phoneNumber:String, weight:Float, citizen:String) {
    println(fullName)
    println(age)
    println(phoneNumber)
    println(weight)
    println(citizen)
}

//Question 2
         //Create and invoke a function that takes in a name and print out "Hello ${name}"
           //eg. given "Ada" it will print put "Hello Ada"

fun greetings(word:String){
    var word= "Hello ${word}"
    println(word)
}


//Question 3
         //Write a Kotlin program to print"Hello" on screen and your name in a separate line.

fun text(greeting:String,name:String){
    println(greeting)
    println(name)
}

//Question 4
     //Write a Kotlin program to perform addition,subtraction,multiplication and division of two numbers.

fun solutions (addition:Int, subtraction:Int,multiplication:Int,division:Int){
    println(addition)
    println(subtraction)
    println(multiplication)
    println(division)
}

//Question 5
     //Write a Kotlin program to check if a given number is positive,negative,or zero.
fun defineStatus(number:Int){

      if (number > 0){
          println("Positive number.")
      }
      else if(number < 0){
          println("Negative number.")
      }
      else if(number == 0){
          println("Number is zero")
      }
}

//Question 6
//Write a Kotlin program to check if a given number is divisible by seven.

fun divisibleBySeven(number:Int){
    if (number %7 == 0) {
        println("Number is divisible by Seven.")
    }
    else if (number % 7 >0){
        println("Number is not divisible by Seven.")
    }
}

//Question 7
//Write a function that takes in a name and prints  name and prints out "That's me!" when your name is passed to it, otherwise it prints out "I don't know who that is"

fun statement(name:String){
    if (name == "Gloria"){
        println("That's me!")
    }
    else (println("I don't know who that is!"))
}

//Question 8
//Write a function that takes in a name and prints  name and prints out "That's me!" when your name is passed to it, otherwise it prints out "I don't know who that is"

fun alphabets(letters: String){
    if (letters == ("'a','e','i','o','u'")){
        println("These are vowels")
    }
    else{
        println("These are consonants")
    }
}

//Question 9
//Given a string "Akirachix". Write a function that prints out a string composed of the first, third and fourth characters of the string.

fun school(word:String){
    println(word[0] + " " + word[2] + " " + word[3])

}

//Question 10
//Write a function that takes in 2 parameters, name and age and returns a String with this structure "Hi, my name is x and I am y years old." Where x and y are the provided name and age respectively.
 fun introWord(name:String, age:Int): String {
    var sentence = "Hi my name is $name and I am $age years old."
    return sentence

}


//20th March 2024
//Arrays

fun main() {
//Question 1
    println (response("Gloria"))

//Question 2
// Write a Kotlin program  that sorts an array of students names in ascending order.
    var names= arrayOf("Gloria", "Nyaga","Grace","Wairimu","Prince","Malonza","Brenda","Ana")
    names = names.sortedArrayDescending()
    println(names.contentToString())

    //Question 3
// In the names provided above. Since classes were reshuffled replace the value of the name Grace with Patience.
    var studentNames= arrayOf("Gloria", "Nyaga","Grace","Wairimu","Prince","Malonza","Brenda","Ana")
    studentNames.set(2,"Patience")
    println(studentNames.contentToString())

    //Question 4
    //In the names provided a few students left the class and no one was there to replace them. Kindly indicate the name of  the remaining students.
    var firstNames: Array<String?> = arrayOf("Gloria", "Nyaga","Grace","Wairimu","Prince","Malonza","Brenda","Ana")
    firstNames[4]=null
    println(firstNames.contentToString())

//Question 5
    //find the average
    val numeric = arrayOf(23,567,43,213,56,6,7788,4,332)
    println(numeric.sum()/numeric.average())

    //find the minimum  value
    val digits = arrayOf(23,567,43,213,56,6,7788,4,332)
    println(digits.minOrNull())

    //find the sum
    val numbers = arrayOf(23,567,43,213,56,6,7788,4,332)
    println(numbers.sum())

}

//Question 1
//Write a function that takes a person's name as an argument and prints out a greeting message with the name. The function should return the unit.

fun response(name:String): String{
    var Unit=("Hello,$name! Welcome to Akirachix.")
    return Unit

}



















