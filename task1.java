import java.util.Scanner;

class ReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter Login ID: ");
        String user = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful");

            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Train Number: ");
            int trainNo = sc.nextInt();
            System.out.print("Enter Source: ");
            String source = sc.next();
            System.out.print("Enter Destination: ");
            String dest = sc.next();

            System.out.println("Reservation Successful!");
            System.out.println("PNR: 123456");
        } else {
            System.out.println("Invalid Login");
        }
        sc.close();
    }
}
