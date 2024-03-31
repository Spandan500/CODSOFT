import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 1000;
        int withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 to withdraw");
            System.out.println("Choose 2 to deposit");
            System.out.println("Choose 3 to check balance");
            System.out.println("Choose 4 to exit");
            System.out.println("Choose an option:");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter an amount to withdraw:");
                    withdraw = sc.nextInt();
                    if (balance>= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash");
                    } else {
                        System.out.println("Sorry,insufficient balance!");
                    }
                    break;

                case 2:
                    System.out.println("Enter an amount to deposit:");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been deposited successfully");
                    break;

                case 3:
                    System.out.println("Your balance: " + balance);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}