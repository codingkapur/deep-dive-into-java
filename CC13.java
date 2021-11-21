class A {
    public void findArea(int a, int b){
        System.out.println(a*b);
    }
}
class B extends A{
    public void findArea(int a, int b, int c){
        System.out.println(a*b*c);
    }
}

public class CC13 {
    public static void main(String a[]){
        B obj = new B();
        obj.findArea(10,20);
        obj.findArea(10, 20, 30);
    }
}