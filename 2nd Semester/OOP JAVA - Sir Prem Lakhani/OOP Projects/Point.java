public class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void displayInfo() {
        System.out.println("Point(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.displayInfo();
    }
}
