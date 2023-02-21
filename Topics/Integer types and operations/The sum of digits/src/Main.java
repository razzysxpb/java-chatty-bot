import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number_input = scanner.nextInt();

        int first_digit = (number_input / 100); // 476 / 100 = 4
        int second_digit = (number_input % 100) / 10; // 476 % 100 = 76; 76 / 10 = 7
        int third_digit = (number_input % 10); // 476 % 10 = 6

        int result = (first_digit + second_digit + third_digit);
        System.out.println(result);
    }
}