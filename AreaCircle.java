import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        // Area of Circle
        // formula=PI*R*R

        Scanner input = new Scanner(System.in);
        int radius;
        double PI = 3.1415;
        double area;

        System.out.println("Calculation of Area of Circle:");
        System.out.println("Enter radius = ");
        radius = input.nextInt();
        area = PI * radius * radius;
        System.out.println("Area of circle = " + area);

    }
}