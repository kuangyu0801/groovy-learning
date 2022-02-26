// https://groovy-lang.org/gdk.html
// each & eachWithIndex
List favNums = [2, 21, 44, 35, 8, 4]

for (int i = 0; i < favNums.size() - 1; i += 1) {
    println "$i:${favNums[i]}"
}

favNums.each({println it})

// each
favNums.each {println it}

// eachWithIndex
favNums.eachWithIndex {num, idx -> 
    println "$idx : $num"
}

List days = ['Monday', 'Tuesday', 'Wensday', 'Thursday', 'Fridy', 'Saturday', 'Sunday']
// find all is a method of List
List weekend = days.findAll {it.startsWith("S")}

println days
println weekend

// collect
List nums = [1, 2, 3, 4, 5, 6]
List numsTimesTen = []
nums.each {
    num ->
    numsTimesTen << num * 10
}

// collect from Interface Iterable
List secondTimesTen = nums.collect {num -> num * 10}

println nums
println numsTimesTen
println "secondTimesTen: $secondTimesTen"