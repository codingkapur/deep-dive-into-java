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
- Code Reusability - Class B can use code written in Class A. It can access the data members and methods of class B if access if provided.
- Code Maintainence
- Security
- Use of Polymorphism
- Problem Solving
- Design benefits
- Easy Troubleshooting

Abstraction:
    - The process of hiding the implementation details of a class or method. Only the functionality is accessible to the user.
    - Can be used only with classes and methods
    - Objects cannot be created for abstracted classes.
    - To use the abstract class, the abstract class needs to be extended by a non abstract class and an object is created with the non object class.
    Then abstracted functionalities can be used. 
Inheritance:
    1. Single Inheritance
        Base Class/Super Class {
            some code
        }
        Child Class extends Base/Super Class {
            gets access to code of super class
        }
    2. Multiple Inheritance - no (can be implemented with interface)
    3. Hybrid Inheritance - no (can be implemented with interface)
    4. Multilevel Inheritance
    5. Hierarchial Inheritance

Polymorphism:
    - Single Entity Many Forms
    - Using properties of one class in different classes in different ways

Two types of polymorphism:
    Runtime Polymorphism - Method Overriding
    Compile time Polymorphism - Method overloading
    - Compile time polymorphism:
        - Achieved by method overloading.
            - Changing the type of arguments or number of arguments will invoke the appropriate method when the name of the methods is the same. 
    - Run time polymorphism:
        - Also known as Dynamic Method Dispatch
        - This type of polymorphism is achieved using method overriding
        - A call to the over-ridden method is resolved during run time.
        - When a method of a sub class or child class is the same as the method in the superclass, with the same name, number of arguments, type and return, the subclass/child class method overrides the superclass method. 
        - Run time polymorphism upcasting:
            - Example:
                class A {}
                class B extends A{}
                class C {
                    public static void main(String a[]){
                        A obj = new B{}; 
                        (obj reference is class A, but object is made on class B)
                    }
                }
        IMPORTANT: Method overriding does not apply to data members, but only methods. 

Encapsulation:
    - Process of hiding the data and code from outside interference
    - The data and code can be accessed only within the class in which it is defined.
    - It is achieved by declaring private to variables and public to getter and setter methods.
    - Getter and setter methods are used to get or modify the code or data.
    - This appraoch is used for code reusability and testing.

---------------------------------------------------------------------------
## INTERFACE
---------------------------------------------------------------------------

Interface allows us to achieve complete abstraction
Non abstract methods cannot be defined in interface class.
All the methods in the interface class need to be invoked by child class atleast once.
We use implements keyword to inherit interface class to non abstract or interfaces classes.

---------------------------------------------------------------------------
## - Advantages of OOP
---------------------------------------------------------------------------

- Code Reusability | Blueprint is written once, objects can be spawned off the blueprint multiple times. 
- Code Scalability
- Splitting of problems into smaller bits for better solvability.
- Reduced code redundancy becasue of inheritance. 
---------------------------------------------------------------------------
## OPERATORS IN JAVA
---------------------------------------------------------------------------
Binary operators: 
+
-
*
/
%
Unary Operatory
++
--
Pre-Increment
++a
change value and then use value
int a =10;
int b = 0;
b = ++a;
output: b=11, a = 11;
Post-Increment
a++
use value and then change value
int a =10;
int b = 0;
b=a++;
output: a=11, b= 10;

RELATIONAL OPERATORS:
==
!=
>
<
>=
<=
LOGICAL OPERATORS:
&&
||
!

BITWISE OPERATORS:
& binary and
| binary or
^ binary XOR
~ Bianry one's complement
<< Binary left shift
>> Binary right shift

BIT MANIPULATION:
left shift:     right shift:
    N<<i            N>>i

getBIt
setBit
clearBit
updateBit

ASSIGNMENT OPERATORS:
=
+=
-=
*=
/=

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

---------------------------------------------------------------------------
## ORDER OF EXECUTION
---------------------------------------------------------------------------

Static block ->Initialization block in order of appearance in program -> Instance initialization block when class is initialized before constructor is invoked ->

---------------------------------------------------------------------------
## DATA STRUCTURES
---------------------------------------------------------------------------
---------------------------------------------------------------------------
## ARRAYS
---------------------------------------------------------------------------

Array is a linear data structure.
    - A data structure is an arrangement of data to optimise the space and time utilization.
Why we need arrays?
    If we have to store 10,20,100 values, we will have to create as many variables. This poses a few problems:
        - Random access is not possible since you need to be specific about the name you gave to the variable.
        - Large data sets will require large number of variable initializations
        - Every variable will be accessed with its exact name. 
    But if we have a data structure that needs only one name, can hold multiple values of the same type, and can be accessed randomly, that would solve the above mentioned problem. Hence, Arrays.
Properties of the Array Data Structure:
    - it can hold the same type of data. For ints and strings, two different arrays will have to be initialized.
    - static in size: Arrays at the time of initialization require size. Once specified, it cannot be changed. Eg., if an array of 10 is created but two more values need to be added to it, it cannot be done. 
    - arrays are 0 index based. Count starts from 0. So an array of 10 elements will count positions in the array starting from one and going to 9.
    - allows random access because of index. I can simply say a[5] in an array of 10 values and I will get that value.
Syntax:
    datatype name[]; (declaration)
    datatype name[] = new datatype[] (assignment of memory) (the new keyword allocates memory in the heap area.)
    datatype name[] = {10,20,30,20,14,55,24,29,12,86};
Linear Array Memory Representation
    - Memory Allocation takes place in heap
    - homogenous
    - contiguous(in contact with each other, next to each other) memory allocation

        
---------------------------------------------------------------------------
## DYNAMIC ARRAYS
---------------------------------------------------------------------------
Arrays with no restriction in size. It is an illusion. Arrays are static in size but we can create new arrays or overwrite values. Find out how:

Size vs Capacity:
Size -> Size is the actual allocation.
Capacity -> The available space.
size can be less and equal to capacity but not more.

A dynamic array is simply an array which has a capacity of more than the current size requirement, and can be added to when the size is increased, as long as the size is less than the capacity.

Algorithm for increasing size:
    - If size is equal to capacity
        - Create a temp array with twice the size(greater than the previous array)
        - copy all the elements from the previous array to this temp
        - update the new capacity
    - Add element
    - Increment the size

Deleting array value:
    - if index of the element to be deleted is out of range
        - then return -1
    - Store the element to be deleted in a variable
    - Shift all the elements left side by 1 position from index of element to be deleted + 1;
    - Size is decremented

public class DynamicArrayDemo {
    int arr[];
    int size;
    int capacity;
}

OPERATIONS IN ARRAY:

    - Traversal
        - Traversal is a way to display all the elements in an array.
    - Insertion
        - Add an element to the array. It can be added anywhere in the array using the Dynamic Array concept.
    - Deletion
    - Search
        - iterate/traverse through the whole array
    - Sort
        - Bubble Sort
        for(int i =0;i<size;i++){
            for(int j =0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

---------------------------------------------------------------------------
## STRINGS
---------------------------------------------------------------------------
Strings in java are immutable. Once a string is created in memory, it cannot be modified. 
Taking input of a string:

    Scanner input = new Scanner(System.in);
    String name = input.nextline(); //Nextline will take the whole string and store it in the variable name.
    String name = input.next(); //next will only store the first element in the input string.

Finding the length of a string:
    name.length();
Printing the character at a particular postion in the string:
    name.charAt(i);
Comparing two strings:
    name.compareTo(name2); //If the strings are the same, the return value is 0; If strings are not the same, then the return value is a positive or negative number. An if else statement resolves the problem of comparison. 
Finding a substring in a string:
    name.substring(starting index, ending index) //If ending index value is not given, the substring will be the remaining. 

Convert a String to an integer:
    String num = "12345";
	int toNum = Integer.parseInt(num);
Get the type of variable:
	System.out.println(num.getClass().getSimpleName()); //This works only for objects and not for primitive types. 
	System.out.println(((Object)toNum).getClass().getSimpleName());//So we need to convert primitive data type like integer to an object. 
To convert an integer to a string:
    int num = 12345;
    String str = Integer.toString(num);

---------------------------------------------------------------------------
## STRING BUILDER
---------------------------------------------------------------------------
Doing operations on a string variable can be time consuming, especially as the data set keep getting bigger and bigger. 
If we want to create a string "hello" and we start off with String name = "h", we will have to do name += 'e' then name+='l' and so one. Everytime a new character is being added, a new memory is allocated and the previous is done away with. This process is redundant.
This is where string builder comes ones.

StringBuilder sb = new StringBuilder("Hello");

charAt works the same way with stringBuilder.

Switch characters at an index. 
sb.setCharAt(index, replacing char);
Insert:
sb.insert(index, char to add);
delete:
sb.delete(start index, end index)
append:
sb.append("string to add to the end of the string.")
length: 
sb.length();

---------------------------------------------------------------------------
## RECURSION
---------------------------------------------------------------------------
Prequisites:
    - Loops/Iteration
    - Functions
Recursion is another way to implement iteration.
A Recursive function is a function that calls itself.

Note:
    - Outer functions takes steps
    - Assumes that the inner function will do the rest of the work.
Example: Recursion.Java

---------------------------------------------------------------------------
## ARRAYLIST
---------------------------------------------------------------------------
Arrays require:
    - Contiguous space in memory
    - Fixed Size
    - Can store primitive types
ARRAYLIST:
    - Does not require contiguous memory
    - Size is variable
    - Stores only Objects
OPERATIONS IN ARRAYLIST
    - Addition
    - Get
    - Modify(Add in between or change a value)
    - Delete/remove
    - Iterate

---------------------------------------------------------------------------
## COLLECTIONS
---------------------------------------------------------------------------
When creating an application dealing with data, we need to have the following features:
    - Better Storage
    - Optimized search
    - Perform CRUD operations
Why do we need Collections:
    - Optimized Storage
    - Lower time complexity in calculations
To achieve these effects, we would need the correct data storage for the right situation. For eg.:
    - Index based access/ Maintain order of insertion : Arrays or linked List
    - First in First Out (FIFO) : Queues
    - Last In First Out (LIFO) : Stack
    - Key Value pair : Map
    - Heirarchical: Tree
Collection Framework has pre implemented data structures. They do not need to be created from scratch.
Features:
    - Reduced Programming effort
    - Increased Performance.
    - Interoperbility
    - Promotes Reuse
    - Uniform APIs
Collection Frameworks:
    Definition:
        - combination of classes and interfaces which define the different data structures for stroing the collection of elements. 
        - it provides a standardized set of data structures. 
Interfaces in collections:
    - Iterables
        - Collections
            - List
            - Queue
            - Set
Methods on Collections:
    - Add
    - Size
    - Remove
    - Iterate
    - addAll
    - removeAll
    - clear
Interface #1:
    - List Interface
        An ordered collection
        Random access possible
        Index based
        Allow Duplicates
            - ArrayList -> Concrete Implementation class
            - LinkedList
            - Vector -> Stack
    - Queue Interface (FIFO)

            - PriorityQueue
            - LinkedList
            - Deque -> ArrayDeque
    - Set Interface
            - HashSet
            - LinkedHashSet
            - SortedSet -> TreeSet
    - Map (Key-Value)
            - HashMap
            - LinkedHashMap
            - SortedMap -> TreeMap
            - Hashtable
COLLECTION FRAMEWORK HEIRARCHY:
    - Iterable(Top) - Interface
        - Collection Interface
            - List Interface                - Queue Interface                       - Set Interface -> hashSet(class)
                                                - Priority Queue(class)                        -> LinkedHashSet(class)
                                                                                        - Sorted Set
            -Implementations
                - ArrayList(class)                         - Deque Interface                       - Tree Set(class)
                - LinkedList(class)                            - Array Deque(class)
                - Vectors(class)
                    - Stack(class)
    
---------------------------------------------------------------------------
## ITERABLE
---------------------------------------------------------------------------
It only has one method
    - Iterator()
All classes of collection framework implement iterable
    - forEach
---------------------------------------------------------------------------
## LINKED LIST
---------------------------------------------------------------------------
List of elements(nodes) that are linked.
Properties:
    - Variable Size
    - Non Contiguous Memory
    - Insert BigO is O(1)
    - Search BigO is O(n)

        ArrayList   vs  LinkedList

Insert      O(n)            O(1)    
Search      O(1)            O(n)

In cases where manipulation needs to be done, LinkedList is preferred. 
In cases where search has to be done, ArrayList is preferred.

Structure of a linkedList:
    - Every element in a linkedList is called a Node. The last element is called the null/empty node.
    - every node has two sub-elements.
        - The information/data
        - next value - The address of the next node in the LinkedList.
    - The first node is called the Head and we only need the address of this node.

Types of LinkedList:
    - Singlular (one way traffic)
    - Double (Two way traffic)
    - Circular (No null node in the end)

REFER TO LL.java TO SEE HOW A LINKED LIST IS CREATED.