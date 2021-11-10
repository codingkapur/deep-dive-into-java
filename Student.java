class StudentBlueprint {
    // V1: Data members of the class
    int id;
    String name;

    // V3: Initializing through methods
    void insertRecord(int r, String n) {
        id = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
}

public class Student {
    // Main Function. This runs first.
    public static void main(String a[]) {
        // V1: Instantiating an Object from the class.
        StudentBlueprint s1 = new StudentBlueprint();
        s1.id = 710;
        s1.name = "Raghav";
        System.out.println("The student id is " + s1.id + " and student name is " + s1.name);
        // V2: Multiple objects
        StudentBlueprint s2 = new StudentBlueprint();
        s2.id = 712;
        s2.name = "KP";
        System.out.println("The student id is " + s2.id + " and student name is " + s2.name);

        // V3: Initialization through methods
        StudentBlueprint s3 = new StudentBlueprint();
        StudentBlueprint s4 = new StudentBlueprint();

        s3.insertRecord(602, "SP");
        s4.insertRecord(007, "DS");
        s3.displayInformation();
        s4.displayInformation();

    }
}