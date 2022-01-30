package com.demo.script

// for loop in Java
for (int i = 0; i < 10; i += 1) {
    println i
}

// array
def letters = ['a', 'b', 'c']
println letters.class // ArrayList

// Groovy Range .. an interface
Range r = 1..10
// Range implements Iterable
for (i in r) {
    println i
}
println r.class
println r.from
println r.to
assert (0..10).contains(0)
assert (0..10).contains(5)
assert (0..10).contains(10)
assert (0..10).contains(11) == false

assert (0..<10).contains(10) == false

Date today = new Date()
Date nextWeek = today +  7 // GDK implementation

println today
println nextWeek

Range days = today..nextWeek
for (d in days) {
    println d
}

Range lowerletter = 'a'..'z'
for (c in lowerletter) {
    print c + " "
}
