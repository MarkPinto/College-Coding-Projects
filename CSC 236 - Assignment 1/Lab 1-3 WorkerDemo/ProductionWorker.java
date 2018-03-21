//Mark Pinto
//Lab 1-3
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

    public ProductionWorker(String n, int eN, String hD, String s, double pR)
    {
        super(n, eN, hD);
        shift = s;
        payRate = pR;
    }

    public void setShift(String s) throws InvalidShift
    {
        shift = s;

        if(!shift.equals("day") && !shift.equals("night"))
        {
            throw new InvalidShift();
        }
    }

    public void setPayRate(double pR) throws InvalidPayRate
    {
        payRate = pR;

        if(payRate < 0)
        {
            throw new InvalidPayRate();
        }
    }

    public String getShift() throws InvalidShift
    {
    	if(!shift.equals("day") && !shift.equals("night"))
        {
            throw new InvalidShift();
        }

        return shift;
    }

    public double getPayRate() throws InvalidPayRate
    {
        if(payRate < 0)
        {
            throw new InvalidPayRate();
        }
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