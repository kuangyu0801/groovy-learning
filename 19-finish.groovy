@groovy.transform.ToString()
class User {
    Long id
    String firstName
    String lastName
    String email
    Date dob

    void printFullName() {
        println "Fullname: $firstName $lastName"
    }
}

User user = new User(firstName:"Dan", lastName:"Vega")
println user