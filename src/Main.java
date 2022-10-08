import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner

        System.out.print("Input the total bill: $");
        double totalBillBeforeTip = scanner.nextDouble(); // collect user input for the total bill

        System.out.print("Input the tip percentage as a whole number (without % symbol): ");
        double tipPercentage = scanner.nextDouble(); // collect user input for the tip percentage

        System.out.print("Input the number of people: ");
        int numberOfPeople = scanner.nextInt(); // collect user input for the number of people

        System.out.println("-----------------------------------");

        TipCalculator tipCalc = new TipCalculator(numberOfPeople, tipPercentage, totalBillBeforeTip);

        System.out.println("After a tip of $" + String.format("%.2f", tipCalc.tipAmount()) + // print the tip
                ", the total bill is $" + String.format("%.2f", tipCalc.totalBill()) + // print the total bill after tip
                "\nDivided among the " + tipCalc.getNumPeople() + " people, each person will pay $" + String.format("%.2f", tipCalc.perPersonTotalCost())); // print the cost per person

        scanner.close(); // close scanner
    }
}