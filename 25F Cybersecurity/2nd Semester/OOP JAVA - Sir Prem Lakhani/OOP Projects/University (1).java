public class University {
    private String name;
    private String location;
    private int establishedYear;

    // Default constructor
    public University() {
        this.name = "";
        this.location = "";
        this.establishedYear = 0;
    }

    // Parameterized constructor (2 params)
    public University(String name, String location) {
        this.name = name;
        this.location = location;
        this.establishedYear = 0;
    }

    // Parameterized constructor (3 params)
    public University(String name, String location, int establishedYear) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
    }

    public void displayInfo() {
        System.out.println("University Name  : " + name);
        System.out.println("Location         : " + location);
        System.out.println("Established Year : " + establishedYear);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Default constructor
        University u1 = new University();

        // 2-param constructor
        University u2 = new University("University of the Punjab", "Lahore");

        // 3-param constructor
        University u3 = new University("Quaid-i-Azam University", "Islamabad", 1967);

        // Extra Pakistani universities
        University u4 = new University("University of Karachi", "Karachi", 1951);
        University u5 = new University("NUST", "Islamabad", 1991);

        u1.displayInfo();
        u2.displayInfo();
        u3.displayInfo();
        u4.displayInfo();
        u5.displayInfo();
    }
}
