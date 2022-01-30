if (true)
    println "value is true"
    
if (!false) 
    println "value is false"
// null is treated as false
def name
if (!name)
    println "name is " + name
name = "Dan"
    
if (name)
    println "name is " + name
    
    
def x = 10
if (x == 10) {
    println "x is 10"
} else {
    println "x is not 10"
} 

def list = [1,2,3,4]
for (num in list) {
    println num
}

// switch

def num = 10
switch (num) {
    case 10:
        println "number is 10"
        break
    default:
        println "we hit the default case"
}