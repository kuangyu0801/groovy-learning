# 1
- jvm need the groovy.jar class path in order to run groovy byte code
- Run groovy in 3 env
    - groovyc $FILE + groovy $FILE
    - GroovyConsole
        - AST browser

From Java to Groovy
- package are automated imported
- all properties are private by default
    - no need for getter and setter
- method are public by default
- return is 
- ';' is optional

# 22-keyword
- groovy add keywords on top of existing java
    + however: "true", "false", "null" are literals

# 24-assertion
- need to set by line "assert true"

# 25-script
- script are still transformed in to a java class

# 26-class
- convention: filename is the same as class name (but not required, opposite to Java)
```
Developer d = new Developer();
d.setLastname("Dan")
d.lastname = "Dan // 等效, 也是call setter
```
# Sec-6 Closure
- Reference https://groovy-lang.org/closures.html
[53-closure.groovy](/53-closure.groovy)
[54-params.groovy](/54-params.groovy)
[55-collections.groovy](/55-collections.groovy)
[56-curry-methods.groovy](/56-curry-methods.groovy)