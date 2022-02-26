def writer = {
    append 'Dan'
    append ' lives in NYC'
}

def append(String s) {
    println "append() called with arg $s"
}

writer() 
/* output is 
append() called with arg Dan
append() called with arg  lives in NYC
*/

StringBuffer sb = new StringBuffer()
// writer now delegates "append" method to Object
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()
println sb
/* output is

*/
