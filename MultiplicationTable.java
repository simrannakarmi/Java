import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        /*Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  a number: ");
        int n = s.nextInt();
        int multi;
        System.out.println("Multiplication Table of " + n + " : ");
        for (int i = 1; i <= 10; i++) {
            multi = n * i;
            System.out.println(n + " * " + i + " = " + multi);
        }
    }
}