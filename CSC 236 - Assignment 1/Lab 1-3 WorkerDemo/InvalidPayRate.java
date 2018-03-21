//Mark Pinto
//Lab 1-3
//CSC 236-62
public class InvalidPayRate extends Exception
{

    public InvalidPayRate()
    {
        super("\nError: invalid pay rate, must be a positive number");
    }

    public InvalidPayRate(double pR)
    {
        super("\nError: invalid pay rate, must be a positive number"
              + "\npay rate entered: "
              + pR);
    }
}