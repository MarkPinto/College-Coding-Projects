//Mark Pinto
//Lab 1-3
//CSC 236-62
import java.util.Scanner;
public class WorkerDemo
{
    public static void main(String[] args)
    {
        String name;
        int employeeNumber;
        String hireDate;
        String shift;
        double payRate;

        Scanner key = new Scanner(System.in);

        //creation of ProductionWorker
        System.out.println("Enter the employees info: ");

        System.out.print("\nEnter the employee's name: ");
        name = key.nextLine();

        System.out.print("\nEnter the employee's employee number: ");
        employeeNumber = key.nextInt();
        key.nextLine();

        System.out.print("\nEnter the employee's hire date: ");
        hireDate = key.nextLine();

        System.out.print("\nEnter the employee's shift("
                         + "day or night): ");
        shift = key.nextLine();

        System.out.print("\nEnter the employee's pay rate: $");
        payRate = key.nextDouble();
        key.nextLine();

        createWorker(name,employeeNumber,hireDate,shift,payRate);
	}

    public static void createWorker(String n,int eN,
    								String hD,String s
    								,double pR)
    {
		ProductionWorker one = new ProductionWorker(n,
													eN
													,hD
													,s
													,pR);

		try
		{
		    one.isValidEmpNum(eN);
		}
		catch(InvalidEmployeeNumber e)
		{
		    System.out.println(e.getMessage());
		}

		try
		{
		    one.getShift();
		}
		catch(InvalidShift e)
		{
		    System.out.println(e.getMessage());
		}

		try
		{
		    one.getPayRate();
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("\nProduction worker info:");
        System.out.println(one);
	}
}