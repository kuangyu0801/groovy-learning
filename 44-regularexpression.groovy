package com.demo.script

def text = "Being a Cleverland Sports Fan is no way"
def pattern = ~/Cleverland Sports Fan/
def finder = text =~ pattern
def matcher = text ==~ pattern

println finder
println finder.size()
println matcher

text = "Cleverland Sports Fan"
matcher = text ==~ pattern
println matcher

text = "Being a Cleverland Sports Fan is no way"
text.replaceFirst(pattern, "Buffalo")
println text