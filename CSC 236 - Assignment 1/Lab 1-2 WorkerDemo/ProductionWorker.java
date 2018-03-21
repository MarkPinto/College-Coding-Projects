//Mark Pinto
//Lab 1-2
//CSC 236-62
import java.text.DecimalFormat;
public class ProductionWorker extends Employee
{
    DecimalFormat round = new DecimalFormat("#,##0.00");
    private String shift;
    private double payRate;

    public ProductionWorker()
    {
        super();
        shift = null;
        payRate = 0;
    }

    public ProductionWorker(String n, String eN, String hD, String s, double pR)
    {
        super(n, eN, hD);
        shift = s;
        payRate = pR;
    }

    public void setShift(String s)
    {
        shift = s;
    }

    public void setPayRate(double pR)
    {
        payRate = pR;
    }

    public String getShift()
    {
        return shift;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public String toString()
    {
        String str = "Name: "
                    + getName()
                    +"\nEmpolyee Number: "
                    + getEmployeeNumber()
                    +"\nHire Date: "
                    + getHireDate()
                    +"\nShift: "
                    + shift
                    +"\nPay Rate: $"
                    + round.format(payRate);
        return str;
    }
}