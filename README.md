---------------------------------------------------------------------------
# A Deep Dive Into JAVA
---------------------------------------------------------------------------
## Creating your first JAVA program:

Things to remember:
1. Every JAVA file ends with .java extension.
2. The name of the file is the same as the name of the class. For example, refer to FirstJavaProgram.java.
3. When a .java file is compiled into byte code, the new file generated has the extension of .class.
4. Compile the .java file into bytecode with the command: "javac FirstJavaProgram.java".
5. Run the byte code with the command : "java FirstJavaProgram".

---------------------------------------------------------------------------
## OOP - Object Oriented Programming
---------------------------------------------------------------------------
- It is a programming paradigm based on the concept of objects
- There are two main features - Objects and Classes
- For eg. A bottle is a class. It may have properties, attributes and functions. A glass bottle is an object of the bottle class. A bamboo bottle is an object of the bottle class. A plastic bottle is an object of the bottle class. All are bottles, but have slightly different attributes, properties and functions.
- If classes are blueprints, objects are the buildings built upon those blueprints.
- Objects contain data that define its state and methods that define its behavior.

---------------------------------------------------------------------------
## - Advantages of OOP
---------------------------------------------------------------------------

- Code Reusability | Blueprint is written once, objects can be spawned off the blueprint multiple times. 
- Code Scalability
- Splitting of problems into smaller bits for better solvability.
- Reduced code redundancy becasue of inheritance. 
---------------------------------------------------------------------------
## Class
---------------------------------------------------------------------------

- A template, a blueprint.
- It holds the properties and behavior of the objects.
- Classes in Java contain:
    - Data Member
    - Methods
    - Contructor
    - Blocks
    - Class and Interface
- Creating a class is planning the design of objects. What characteristics, properties and methods can they have, is all defined in the class. 
SYNTAX:

class <class_name>
{
    data_member;//field
    method;
}
'A' is class name.
int is a data member example
int calcSum is a method example.

class A {
    int a;
    int b;
    int calSum(int x, int y){
        return (x + y);
    }
}

---------------------------------------------------------------------------
## Objects
---------------------------------------------------------------------------
- An object is an instance of a class. An instance of the blueprint. 
- It has certain properties and specific behavior that has been declared in the class. It can have a specific state. 
- If int is a class, then int a is an object of the class int. a can only store a value that the class int allows. 
- Objects in the real world can be tangible or intangible. (House, Burger, Pizza, Speakers vs. Education system)
- Characterisitcs:
    - State -> value of the object
    - Behavior -> the functionality of the object
    - Identity -> Objects have unique identities - Not visible to the user but used by the JVM to identify objects.
    (once we declare an int, we don't know where in the memory it is stored as is in C/C++.)
    (identity hash map)

---------------------------------------------------------------------------

---------------------------------------------------------------------------
