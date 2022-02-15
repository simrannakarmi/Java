public class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 * i=1 j=4 k=1
 ** i=2 j=3 k=2
 *** i=3 j=2 k=3
 **** i=4 j=1 k=4
 ***** i=5 k=5
 */