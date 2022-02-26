// implicit parameter
def foo = {
    println it
}

foo('KYL')

def noparafoo = {
    -> println "no parameters"
}

noparafoo()

def sayHello = {
    String first, String last ->
    println "Hello $first $last"
}

sayHello('Kuang-Yu', 'Li')

// default values
def sayHelloDefault = {
    String first, String last = 'Tam' ->
    println "Hello $first $last"
}

sayHelloDefault('Kuang-Yu')

// var-arg
def concat = { 
    String... args -> args.join(' ')
}

println (concat('abc', 'def', 'ghi'))

def printClosureInput(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = {int x, int y -> x + y}
printClosureInput(someClosure)