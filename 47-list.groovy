def nums = [1, 5, 7, 29, -19]
println nums
println nums.class // by default is arraylist

// add | remove | get | clear
nums.push(99)
println nums
nums.putAt(0, 77)
println nums

nums[1] = 6
println nums.get(1)

// overloading operator
println nums + [11, 22, 33]

nums.pop()
println nums

nums.removeAt(3)
println nums

def newList = nums - -19
println newList

println nums.getAt(1..3)

nums.clear()
println nums

println nums.flatten()

println nums.unique()

def numbers = [1,2, 5, 5, 7, 1, 2, 8, 9] as Set
println numbers
println numbers.class