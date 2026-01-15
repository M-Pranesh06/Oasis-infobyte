import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice;

        do {
            System.out.println("\n1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    int w = sc.nextInt();
                    balance -= w;
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    int d = sc.nextInt();
                    balance += d;
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
