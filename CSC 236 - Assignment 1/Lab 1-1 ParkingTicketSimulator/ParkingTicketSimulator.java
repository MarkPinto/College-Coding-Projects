//Mark Pinto
//Lab 1-1
//CSC 236-62
import java.util.Scanner;
public class ParkingTicketSimulator
{
    public static void main(String[] args)
    {
        String make;
        int model;
        String color;
        String licenseNumber;
        int minParked;

        int minPurchased;

        String officerName;
        int badgeNumber;

        Scanner key = new Scanner(System.in);

        System.out.print("Enter the car's maker: ");
        make = key.nextLine();

        System.out.print("Enter the car's model year: ");
        model = key.nextInt();
        key.nextLine();

        System.out.print("Enter the car's color: ");
        color = key.nextLine();

        System.out.print("Enter the car's license number: ");
        licenseNumber = key.nextLine();

        System.out.print("Enter the amount of minutes parked: ");
        minParked = key.nextInt();
        key.nextLine();

        System.out.print("Enter the amount of minutes purchased: ");
        minPurchased = key.nextInt();
        key.nextLine();

        System.out.print("Enter the name of the officer: ");
        officerName = key.nextLine();

        System.out.print("Enter the badge number of the officer: ");
        badgeNumber = key.nextInt();
        key.nextLine();

        ParkedCar one = new ParkedCar(make,model,color,licenseNumber
        							  ,minParked);
        ParkingMeter two = new ParkingMeter(minPurchased);
        PoliceOfficer three = new PoliceOfficer(officerName,badgeNumber);

        System.out.print(one);
        System.out.println("\nMinutes Purchased: "
                           + two.getMinutesPurchased());
        System.out.println(three);
        three.patrol(one,two,three);
    }
}