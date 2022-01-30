package com.demo.script

float f = 1.25
println f

println f.class

// Optional Typing of variable
def x = 10
println x.getClass().getName()

x= 'Dan'
println x.getClass().getName()

x = 1.25
println x.getClass().getName()

// float/double operation is always result in double
float f1 = 1.25
float f2 = 2.25
def rf = f1 + f2
println rf.getClass().getName()

// OptionalType operation is BigDecimal
def a = 35.5
def b = 10
def r = a + b
println r.getClass().getName()

// int div will result in double
println (1/2).getClass().getName()

// times | upto | downto | step
20.times {
    print '-'
}

10.downto(5) {num -> println num}

// Converting Data Type

// Implicit - coercion

// Explicit - casting

// Operation Overloading
def s1 = "Hello"
def s2 = ", World"
// + is concatation
println s1 + s2

s1 = 1
s2 = 2
// + is addition
println s1 + s2