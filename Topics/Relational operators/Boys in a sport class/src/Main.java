import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean ascending = (h1 <= h2) && (h2 <= h3);
        boolean descending = (h1 >= h2) && (h2 >= h3);
        boolean same = (h1 == h2) && (h2 == h3);


        if (ascending || descending || same) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}