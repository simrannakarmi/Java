
/*Write a Java Program that take input from user and print fizz 
if the user input number is divisible by 3,print buzz if the number is 
divisible by 5,and print fizzbuzz if the number is divisible by 3 and 5 
simultaneously.*/
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (n % 3 == 0) {
            System.out.println("fizz");
        } else if (n % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println("The number is not divisible by 3 and 5.");
        }
    }
}
