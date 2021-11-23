//Objective:	1. Build a program that takes input for the length of an array, then asks you to insert the elements. 
//			Create Functionality:
//			2. for inserting new elements at the end of the array and in between.
//				- create a growArray function to insert elements when the array is full.
//			3. for deleting new elements at the end of the array and in between.
//			4. for displaying the elements of the array.
import java.util.Scanner;

public class DynamicArrayExercise {
	Scanner input = new Scanner(System.in);
	
	int size;
	int capacity;
	int arr[];
	
	//Constructor
	DynamicArrayExercise(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		size=capacity;
		System.out.println("Let's add the elements in the array");
		for(int i = 0;i < size;i++) {
			arr[i] = input.nextInt();
		}
	}
	//Insert Element in the array:
	void InsertElements() {
		System.out.println("Let's insert an element: ");
		int element = input.nextInt();
		if(size==capacity) {
			growArray();
		}
		arr[size++] = element;
	}
	void growArray() {
		int temp[] = new int[size*2];
		for(int i =0;i<size;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		capacity = size*2;
	}
	//Inserting elements at index. Example of method overloading.
	void InsertElements(int index, int element) {
		System.out.println("We are going to insert element " + element + " at index "+index);
		if(size==capacity) {
			growArray();
		}
		for(int i = size-1;i>=index;i--) {
			arr[i+1] = arr[i];
		}
		arr[index]= element;
		size++;
	}
	//Display the elements of the array:
	void Display() {
		System.out.println("Let's print the elements of the array: ");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i] + "|");
		}
		System.out.println();
	}	
	void PrintTotalCapacity() {
		System.out.println("Let's print the total capacity of the array!");
		for(int i =0;i<capacity;i++) {
			System.out.print(arr[i] + "|");
		}
		System.out.println();
	}
	void DeleteElement() {
		System.out.println("Deleting the last element of the array!");
		arr[size-1] = 0;
		size--;
	}
	void DeleteElement(int index) {
		System.out.println("Deleting element at index "+ index);
		if(index>=size) {
			System.out.println("Index is out of bounds, slim...");
		}
		int deletedElement = arr[index];
		for(int i=index;i<size;i++) {
			arr[i] = arr[i+1];
		}
		size--;
		System.out.println("The deleted element is "+ deletedElement);
	}
	void Sort() {
		System.out.println("We will now sort the array");
		for(int i =0;i<size;i++) {
			for(int j =i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String a[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many elements would you like to add in the array? ");
		int capacity = input.nextInt();
		DynamicArrayExercise obj = new DynamicArrayExercise(capacity);
		System.out.println("Array Created");
		
		
		obj.Display();
//		obj.InsertElements();
		obj.InsertElements(2, 9);
		obj.Display();
		obj.PrintTotalCapacity();
		obj.InsertElements();
		obj.Display();
		obj.PrintTotalCapacity();
		obj.DeleteElement();
		obj.Display();
		obj.PrintTotalCapacity();
		obj.DeleteElement(2);
		obj.Display();
		obj.PrintTotalCapacity();
		obj.Sort();
		obj.Display();
	}
}
