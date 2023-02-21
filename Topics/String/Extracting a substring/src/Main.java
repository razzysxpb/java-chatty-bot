import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String message = scanner.nextLine();
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        String result = message.substring(no1, no2 + 1);
        System.out.println(result);
    }
}