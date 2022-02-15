import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length, breadth;
        int area;
        System.out.println("Enter length of a rectangle: ");
        length = scan.nextInt();
        System.out.println("Enter breadth of a rectangle: ");
        breadth = scan.nextInt();
        area = length * breadth;
        System.out.println("Area of rectangle = " + area);
    }
}
