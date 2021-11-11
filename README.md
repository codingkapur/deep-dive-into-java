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
- Creating an object:
    a.  Programmer p1; //Initialized an object.
        p1 = new Programmer();

    b. Programmer p1 = new Programmer();

    new is a keyword which when used, allocated memory to the newly created object p1.

Accessing Class Members:
Objectname.variableName = value;
Objectname.methodName(parameterList);

class Programmer
{
    String lang;
    int experience;
    void createApp() {
        Code
    }
}

Programmer p1 = new Programmer();
p1.lang = 'Java';
p1.experience = 5;
p1.createApp();

The dot operator (.) bridges the object and its methods inherited from the class where it was declared and designed.

---------------------------------------------------------------------------
## ACCESS MODIFIERS
---------------------------------------------------------------------------
It specifies the accessibility or scope of a field, method, constructor or class. We can change access levels by applying these access modifiers.

There are 4 types of access modifiers in java:
    - Private - Access only within the class
    - Default - Access only within the package.
    - Public  - Access everywhere
    - Protected - Access only within the class and outside the class. 

But why?
    Peformance, code efficiency and encapsulation

Modifiers that are applicable for inner classes but not for outer classes are Private, Protected and Static.

Private Access Modifier allows field, class, contructor or method to be accessed only in the same class.
Protected allows access in the same package.

---------------------------------------------------------------------------
## CONSTRUCTOR
---------------------------------------------------------------------------
Constructor is a special type of method in Java.
It is used to initialize an object at the time of its creation. 
It is invoked during object creation. It provides data for the objects. 

Rules:
1. Constructor and Class name should be the same.
2. Constructor cannot have any explicit return type.

Types of constructors:
1. Default Constructors
    - No parameters.
    - no-arg constructors.
    - Java compiler creates default constructor if not created.
    - initializes variables of class with default values.

    eg. :

    class Pen
    {
        Pen()//Default Constructor
        {
            System.out.println("Let's Write);
        }
    }
2. Parameterized Constructor
    - Takes in parameters.
    eg. :
    class ClassName {
        //parameterized constructor with 1 argument.
        ClassName(data type variable){
            //code
        }
        //parameterized constructor with 2 argument.
        ClassName(data_type variable, data_type variable){
            //code
        }
    }

    An illustration:

    class Pen{
        Pen(){
            this("generic)
            System.out.println("Hello world");
        }
        Pen(String brand){
            System.out.println("The pen belongs to the " + brand + " brand");
        }
    }

    class NewPen{
        public static void main)(String a[]){
            Pen inkPen = new Pen("Parker);
            //Output here will be The pen belong to the Parker brand.
            //Pen inkpen = new Pen();
            //Output here will be the pen belongs to the generic brand
        }  
    }

    Identity Hash Map:
    class objName = new constructor();
    console.log(objname);
    //Output is the identity hash map.

    class objName;
    console.log(objName);
    //Error as memory has not been allocated to the new object. At this point, since the constructor has not been invoked, it does not have an identity hash map.


---------------------------------------------------------------------------
## STATIC KEYWORD
---------------------------------------------------------------------------
Static variables are variables which are preceded by the keyword 'static'.
It is used primarily for memory management as every static variable is assisgned memory only once.
'static' can be used with variables, methods, constructors, blocks and nested classes. 
---------------------------------------------------------------------------
## FINAL KEYWORD
---------------------------------------------------------------------------
Final variables always hold the same value.
can be used for classes, attributes and methdos to make the unchangeable.
Also called modifier. It is a non access modifier.

