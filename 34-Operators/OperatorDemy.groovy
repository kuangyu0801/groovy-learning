
assert 10 ** 2 == 100

assert true
assert !false

// Elvis Operator
    // if user.name non-null
    displayName = user.name ? user.name : 'Anonymous'
    displayName = user.name ?: 'Anonymous'

// Object Operator
    // Saft Navigation Operator
    Person p = new Person()

    
    def address = p?.address
    assert address == null
