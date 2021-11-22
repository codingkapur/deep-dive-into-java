// PRINT NUMBERS IN DESCENDING ORDER

// public class Recursion {
//     public static void PrintNum(int a) {
//         // Implement the purpose of this function.
//         System.out.println("The number is " + a);
//         // Modify the value
//         a--;
//         // Check for base case.
//         if (a == 0) {
//             return;
//         }
//         // If condition not met, function calls itself. }
//         PrintNum(a);
//     }

//     public static void main(String a[]) {
//         int n = 5;
//         PrintNum(n);
//     }
// }

// PRINT SUM OF N NATURAL NUMBERS

// public class Recursion {
//     public static int calcSum(int a, int total){
//         //Check for base case.
//         if(a==-1){
//             return total;
//         }
//         total +=a;
//         a--;
//         return calcSum(a, total);
//     }

//     public static void main(String a[]) {
//         int n = 10;
//         int sum = 0;
//         System.out.println(calcSum(n, sum));

//     }
// }

// PRINT FACTORIAL OF N
// public class Recursion{
//     public static int calcFactorial(int i , int n, int factorial){
//         if(i==n){
//             return factorial;
//         }
//         factorial += (factorial*i);
//         return calcFactorial(i-1,n,factorial);
//     }

//     public static void main(String a[]){
//         int n =5;
//         int i=1;
//         int factorial=1;
//         System.out.println(calcFactorial(i,n,factorial));
//     }
// }

// PRINT FIBONACCI SEQUENCE TILL N

// public class Recursion {
//     public static void printFibonacci(int n, int i,int j, int count, int temp) {
//         if (count == n) {
//             return;
//         }
//         System.out.print(j + " ");

//         temp = j;
//         j = i+j;
//         i = temp;
//         count++;
//         printFibonacci(n, i, j, count, temp);
//     }

//     public static void main(String a[]) {
//         int n = 10;
//         int i = 0;
//         int j =1;
//         int temp = j;
//         int count =1;
//         System.out.print(i + " ");
//         printFibonacci(n, i,j, count, temp);
//     }
// }

// PRINT FIBONACCI SEQUENCE TILL N - REFACTOR

public class Recursion {
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFibonacci(b, c, --n);
    }

    public static void main(String a[]) {
        int x = 0;
        int y = 1;
        int n = 10;
        System.out.print(x + " " + y + " ");
        printFibonacci(x, y, n - 2);
    }
}