class A {
    private int value;

    public int getMethod(){
        return value;
    }
    public void setMethod (int x) {
        value = x; 
        System.out.println(value + " from setMethod");
    }
}

public class EncapsulationEg{
    public static void main(String a[]){
        A obj = new A();
        obj.getMethod();
        obj.setMethod(200);
        obj.getMethod();
    }
}