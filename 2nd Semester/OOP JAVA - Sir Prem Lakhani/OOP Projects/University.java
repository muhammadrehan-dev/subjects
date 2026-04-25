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
        System.out.println("University Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University("DUET", "NED");
        University u3 = new University("KU", "UET", 1986);

        u1.displayInfo();
        u2.displayInfo();
        u3.displayInfo();
    }
}
