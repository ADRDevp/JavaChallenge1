import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Giorgio Armani";
        String accountType = "Normal";
        Double balance = 1599.99;
        int option = 0;

        System.out.println("*****************************************");
        System.out.println("\nClient Name is: " + name);
        System.out.println("Account Type is: " + accountType);
        System.out.println("Available Balance is: " + balance + "$");
        System.out.println("\n*****************************************");

        String menu = """
                *** Write the option you want to use ***
                1 - Available Balance
                2 - Withdraw
                3 - Deposit
                9 - Exit
                """;
        Scanner sc = new Scanner(System.in);
        while(option != 9){
            System.out.println(menu);
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Your current balance is: " + balance + "$");
                    break;
                case 2:
                    System.out.println("How much money do you want to withdraw?");
                    double withdrawValue = sc.nextDouble();
                    if (withdrawValue > balance){
                        System.out.println("Not enough balance.");
                    } else {
                        balance -= withdrawValue;
                        System.out.println("New balance is: " + balance);
                        break;
                    }
                case 3:
                    System.out.println("How much money do you want to deposit?");
                    double depositValue = sc.nextDouble();
                    balance += depositValue;
                    System.out.println("New balance is: " + balance);
                    break;
                case 9:
                    System.out.println("Goodbye and Thanks for using our services.");
                    break;
                default:
                    System.out.println("Choose a valid option.");
            }
        }
    }
}