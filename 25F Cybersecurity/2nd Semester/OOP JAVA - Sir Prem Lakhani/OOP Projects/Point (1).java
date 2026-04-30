public class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void displayInfo() {
        System.out.println("Point Coordinates -> X: " + x + ", Y: " + y);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.displayInfo();
    }
}
