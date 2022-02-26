/*
Closure Basics
*/
// Create a Method that accepts a closure as an argument
def callClosure(Closure c) {
    c('Hello World')
}

callClosure { name -> println "print string $name"}

// Create a list and use them each to iterate over each item in the list and print it out
List list = [1, 5, 7, 8, 10]
list.each ({println it})

// Create a map of data and iterate over it using each method. 
Map map = [first:1, second:2, third:3]
map.each({println it})

def printKV = {key, value -> println "$key: $value"}
map.each(printKV)


// Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture. 

def greet = {String greeting, String name ->
    println "$greeting! $name"
}

greet('Yo', 'Harry')

def sayHello = greet.curry('Hello')

sayHello('Jerry')

/*
Explore GDK
*/

List people = [
    [name:'Jane',city:"New York City"],
    [name:'John',city:"Cleveland"],
    [name:'Mary',city:"New York City"],
    [name:'Dan',city:"Cleveland"],
    [name:'Tom',city:"New York City"],
    [name:'Frank',city:"New York City"],
    [name:'Jason',city:"Cleveland"]    
]







//Search for the find and findAll methods.
println people.find { person -> person.city == "Cleveland" }
println people.findAll { person -> person.city == "Cleveland" }
// Search for the any and every methods.
println people.any { person -> person.city == "Cleveland" }
println people.every { person -> person.city == "Cleveland" }
println people.every { person -> person.name.size() >= 3 }
// Search for the method groupBy that accepts a closure

def peopleByCity = people.groupBy { person -> person.city } 
println peopleByCity

def newyorkers = peopleByCity["New York City"]
println "New Yorkers: "
newyorkers.each {
    println it.name
}

def clevelanders = peopleByCity.Cleveland
 
println "Clevelanders: "
clevelanders.each {
    println it.name
}