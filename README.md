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