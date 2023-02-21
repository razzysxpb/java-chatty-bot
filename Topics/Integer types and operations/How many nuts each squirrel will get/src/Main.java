import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int no_of_squirrels = scanner.nextInt();
        int no_of_nuts = scanner.nextInt();

        int result = (no_of_nuts / no_of_squirrels);
        System.out.println(result);
    }
}