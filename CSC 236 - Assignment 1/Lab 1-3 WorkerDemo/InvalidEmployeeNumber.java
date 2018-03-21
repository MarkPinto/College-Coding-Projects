//Mark Pinto
//Lab 1-3
//CSC 236-62

public class InvalidEmployeeNumber extends Exception
{

    public InvalidEmployeeNumber()
    {
        super("\nError: invalid employee number, "
              + "number must be between 0 and 9999");
    }

    public InvalidEmployeeNumber(String eM)
    {
        super("\nError: invalid employee number, "
              + "number must be between 0 and 9999"
              + "\n number entered: "
              + eM);
    }
}