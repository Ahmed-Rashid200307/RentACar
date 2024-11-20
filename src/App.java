import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        boolean statusRunning = true;
        boolean adminAcces = false;
        Admin admin = new Admin();
        Utils utils = new Utils();
        Scanner input = new Scanner(System.in);
        Map<String, Object> allCars = new HashMap<>();

        // Economy car1 = new Economy("Tesla", "X", 2019, 70000, "White", "WBC890", true, 40, 3.8, 4, "200km/L", false, "Auto", "Electric", "Karachi", 3500, "None", "9/11/2024", "Electric");

        // car1.displayDetails();
        // car1.SetRenterDetails("Asif", "123456789", "XXXXXXXXXXXXXX", "123 Main St", "Islamabad", 123, 10);
        // car1.displayRentalDetails();

        // car1.setter("year", 2017);
        // car1.displayDetails();

        System.out.println("--------------------------------");
        System.out.println("Welcome to ABC Car Rental System");
        System.out.println("\t | ADMIN LOGIN |");
        int option;

        while(!adminAcces){
            System.out.println("Enter Username: ");
            String username = input.nextLine();
            System.out.println("Enter Password: ");
            String password = input.nextLine();
            adminAcces = admin.login(username, password);
            if (!adminAcces) {
                System.out.println("Invalid Username or Password. Try again");
            }else {
                System.out.println("Login Successful");
            }
        }
        
        utils.start(allCars);
        System.out.println(allCars);
    }        
}
