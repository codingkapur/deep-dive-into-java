public class Recursion {
    public static void PrintNum(int a) {
        // Modify the value
        a--;
        // Implement the purpose of this function.
        System.out.println("The number is " + a);
        // Check for base case.
        if (a == 0) {
            return;
        }
        // If condition not met, function calls itself. }
        PrintNum(a);
    }

    public static void main(String a[]) {
        int n = 5;
        PrintNum(n);
    }
}