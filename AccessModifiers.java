class B {
    public int data = 1974;

    public void letsPrint() {
        System.out.println(data);
        System.out.println("Hello World.");
        System.out.println(data);
    }
    
}

public class AccessModifiers {
    public static void main(String a[]) {
        B object = new B();
        System.out.println(object.data);
        object.letsPrint();
        System.out.println(object.data);

    }
}