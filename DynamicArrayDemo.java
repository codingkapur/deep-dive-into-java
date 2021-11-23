class A {
    int arr[];
    int size;
    int capacity;

    A(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    void insert(int element) {
        if (size == capacity) {
            growArray();
        }
        arr[size++] = element;
    }

    void growArray() {
        // Create a temporary Array of double the current size;
        int tempArr[] = new int[size * 2];
        // Copy values from original array to temp array
        for (int i = 0; i < size; i++) {
            tempArr[i] = arr[i];
        }
        // Reference arr to temp array;
        arr = tempArr;
        // increase the capacity of the array;
        capacity = size * 2;
    }

    void deleteElement(int index) {
        // Delete an element but replace it with 0;
        // if (index >= size) {
        // System.out.println("Index does not exist");
        // return;
        // }
        // int tempArr[] = new int[capacity];
        // for (int i = 0; i < capacity; i++) {
        // if (i == index) {
        // continue;
        // }
        // tempArr[i] = arr[i];
        // // size--;
        // }
        // arr = tempArr;
        if (index >= size) {
            System.out.println("Index is out of bounds buddy");
        }
        int deletedElement = arr[index];
        arr[index] = 0;
        for (int i = index + 1; i < capacity; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        System.out.println("Deleted element is " + deletedElement);
    }

    void Display() {
        System.out.println("\nArray with size");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray with capacity");
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class DynamicArrayDemo {
    public static void main(String a[]) {
        A obj = new A(3);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        obj.deleteElement(2);
        obj.insert(8);
        // obj.insert(9);
        // obj.insert(10);
        // obj.insert(11);
        // obj.insert(12);
        // obj.insert(13);
        // obj.insert(14);
        // obj.insert(15);
        obj.Display();

    }

}