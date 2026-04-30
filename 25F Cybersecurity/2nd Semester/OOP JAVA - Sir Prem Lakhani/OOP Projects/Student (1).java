public class Student {
    private String name;
    private int rollNumber;
    private double cgpa;

    // Default constructor
    public Student() {
        this.name = "";
        this.rollNumber = 0;
        this.cgpa = 0.0;
    }

    // Parameterized constructor (3 params)
    public Student(String name, int rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }

    // Overloaded constructor (2 params) - cgpa defaults to 0.0
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = 0.0;
    }

    public void displayStudentInfo() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Default constructor
        Student s1 = new Student();

        // 3-param constructor
        Student s2 = new Student("Ayesha Tariq", 2301, 3.9);

        // 2-param constructor (cgpa defaults to 0.0)
        Student s3 = new Student("Fatima Malik", 2302);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}
