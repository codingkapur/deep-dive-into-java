class A {
    public void car() {
        System.out.println("I am Method A");
    }
}

class B extends A {
    public void car() {
        System.out.println("I am Method B");
    }
}

public class CC12 {
    public static void main(String a[]) {
        A obj = new A();
        B obj1 = new B();
        A obj2 = new B();
        obj.car();
        obj1.car();
        obj2.car();
    }

}