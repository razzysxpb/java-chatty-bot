import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String candidate_name = scanner.nextLine();
        int years_of_experience = scanner.nextInt();
        String cuisine_preference = scanner.next();

        System.out.println("The form for " + candidate_name + " is completed. We will contact you if we need a chef who cooks " + cuisine_preference + " dishes and has " + years_of_experience + " years of experience.");

    }
}