// http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/Map.html

def map = [:]
println map
println map.class

// key type is by default string
def emailKey = "third email"
def person = [first:"Dan", last:"Vega", email:"some@gmail.com", 'backup email':"some@gmail.com", (emailKey):"some@gmail.com"]
println person
println person.first

// looping through person
for (entry in person) {
    println entry
}

for (key in person.keySet()) {
    println "$key:${person[key]}"
}