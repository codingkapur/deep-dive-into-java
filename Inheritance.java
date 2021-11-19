// Write an algorithm to create classes InheritanceA, InheritanceB and InheritanceC to find the area of circleArea,
// rectangleArea and triangleArea respectively. 
// Use multi level inheritance and execute all methods using the object of class InheritanceC.

// Note: create methods circleArea, rectangleArea and triangleArea in the classes InheritanceA, InheritanceB and InheritanceC respectively.

// Area of circle : pi*r^2
// Area of rectangle : l*b
// Area of triangle : (b*h)/2

class InheritanceA {
    final float pi = 3.14f;
    public float circleArea(float r){
        return pi*r*r;
    }
}
class InheritanceB extends InheritanceA{
    public float rectangleArea(float a, float b){
        return a*b;
    }
}

public class Inheritance extends InheritanceB{
    public float triangleArea(float a, float b){
        return (a*b)/2;
    }

    public static void main(String a[]){
        Inheritance obj = new Inheritance();
        System.out.println(obj.circleArea(10.8f));
        System.out.println(obj.rectangleArea(10.24f, 20.11f));
        System.out.println(obj.triangleArea(10.12f, 21.87f));
    }
}