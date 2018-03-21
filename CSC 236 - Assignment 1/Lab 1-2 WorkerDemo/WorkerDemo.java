//Mark Pinto
//Lab 1-2
//CSC 236-62
import java.util.Scanner;
public class WorkerDemo
{
    public static void main(String[] args)
    {
        String name;
        String employeeNumber;
        String hireDate;
        String shift;
        double payRate;

        Scanner key = new Scanner(System.in);

        //creation of 1st ProductionWorker
        System.out.println("Enter the 1st employees info: ");

        System.out.print("\nEnter the employee's name: ");
        name = key.nextLine();

        System.out.print("\nEnter the employee's employee number: ");
        employeeNumber = key.nextLine();

        System.out.print("\nEnter the employee's hire date: ");
        hireDate = key.nextLine();

        System.out.print("\nEnter the employee's shift(day or"
        				 + " night): ");
        shift = key.nextLine();

        System.out.print("\nEnter the employee's pay rate: $");
        payRate = key.nextDouble();
        key.nextLine();

        ProductionWorker one = new ProductionWorker(name,employeeNumber
        											,hireDate,shift,
        											payRate);

        while(one.isValidEmpNum(employeeNumber) == false)
        {
            System.out.println("\nInvalid employee number, format is XXX-L,"
                               + " where X is a number from 0-9 and"
                               + " L is a letter from A-M");
            System.out.print("\nEnter the employee's employee number: ");
            employeeNumber = key.nextLine();
            one.setEmployeeNumber(employeeNumber);
        }

        //creation of 2nd ProductionWorker
        System.out.println("\n\nEnter the 2nd employees info: ");

        System.out.print("\nEnter the employee's name: ");
        name = key.nextLine();

        System.out.print("\nEnter the employee's employee number: ");
        employeeNumber = key.nextLine();

        System.out.print("\nEnter the employee's hire date: ");
        hireDate = key.nextLine();

        System.out.print("\nEnter the employee's shift(day or"
        				 + " night): ");
        shift = key.nextLine();

        System.out.print("\nEnter the employee's pay rate: $");
        payRate = key.nextDouble();
        key.nextLine();

        ProductionWorker two = new ProductionWorker();

        two.setName(name);
        two.setEmployeeNumber(employeeNumber);
        two.setHireDate(hireDate);
        two.setShift(shift);
        two.setPayRate(payRate);

        while(two.isValidEmpNum(employeeNumber) == false)
        {
            System.out.println("\nInvalid employee number, format is XXX-L,"
                               + " where X is a number from 0-9"
                               + " and L is a letter from A-M");
            System.out.print("\nEnter the employee's employee number: ");
            employeeNumber = key.nextLine();
            two.setEmployeeNumber(employeeNumber);
        }

        System.out.println("\n1st production worker info:");
        System.out.println(one);
        System.out.println("\n2nd production worker info:");
        System.out.println(two);
    }
}