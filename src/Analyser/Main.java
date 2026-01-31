package PasswordAnalyser.src.Analyser;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordAnalyser analyser = new PasswordAnalyser();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Password Analyser ===");
            System.out.println("1. Analyse a password");
            System.out.println("2. Exit");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch(choice) {
                case "1":
                    System.out.print("\nEnter the password to analyse: ");
                    String password = scanner.nextLine();
                    
                    PasswordScore result = analyser.analyse(password);

                    System.out.println("\n--- Results ---");
                    System.out.println("Password Score: " + result.getScore() + "/100");
                    System.out.println("Rating: " + result.getRating());

                    if (!result.getSuggestions().isEmpty()) {
                        System.out.println("\nSuggestions:");
                        for (String s : result.getSuggestions()) {
                            System.out.println("- " + s);
                        }
                    } else {
                        System.out.println("Your password is strong!");
                    }
                    break;
                    
                case "2":
                    System.out.println("Exiting Password Analyser. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    } 
}