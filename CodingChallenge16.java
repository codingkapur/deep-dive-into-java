class Arithmetic {
    int a=20;
    int b=30;
    public void add(){
        System.out.println(a+b);
    }
}
public class CodingChallenge16 extends Arithmetic{
    int a=50;
    int b= 40;
    public void add(){
        System.out.println(a+b);
    }
    public static void main(String a[]){
        Arithmetic A = (Arithmetic) new CodingChallenge16();
        A.add();
    }
}