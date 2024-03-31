import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter loan amount:");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate (%):");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter loan term (years):");
        int loanTermYears = scanner.nextInt();

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Calculate number of payments
        int numberOfPayments = loanTermYears * 12;

        // Calculate mortgage payment
        double mortgagePayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.printf("Your monthly mortgage payment is: $%.2f%n", mortgagePayment);

        scanner.close();
    }
}
