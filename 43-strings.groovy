package com.demo.script

// Java
char c = 'c'
println c.class

String str = "This is a string"
println str.class

// Groovy

def c2 = 'c'
// always uses String
println c2.class

// single quote is also fine
def str2 = 'this is a string'
println str2.class

// interpolation
String name = "KUANG-YU"
// " " print vairable
String msg = "name is: ${name}"
println msg
// ' ' print literal
String msg2 = 'name is: ${name}'
println msg2

// multiling 3 double quote
def msglong = """
A
msg
of
multi
line
"""
println msglong

// dollar slashy for escaping slash
//def folder = "C:\\groovy\dan\foobar"
def folder = $/C:\\groovy\dan\foobar/$
println folder