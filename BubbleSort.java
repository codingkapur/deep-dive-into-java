public class BubbleSort {
    public static void main(String a[]) {
        int arr[] = { 10, 3, 8, 12, 4, 21 ,2,1,34,52,43,19 };
        System.out.println("The array before sort is: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < 12; i++) {
            for (int j = i +1; j < 12; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("The array after sort is: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}