/*
This chapter covers Groovy Closures. A closure in Groovy is an open, anonymous, block of code that can take arguments,
return a value and be assigned to a variable.
*/

def c = {}

println c.class.name
println c instanceof Closure

// Closure is class and anymous object
def sayHello = { name ->
    println "Hello! $name"
}

sayHello('World')

List nums = [1, 2, 3, 6, 9]
nums.each({
    num -> println num
})

// 'it' is preserved keyword for iteration
nums.each({ println it })

def timesTen(num, closure_0) {
    closure_0(num * 10)
}

timesTen(2, {println it})

// 'times' are predefined closure
10.times {
    println it
}