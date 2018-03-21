//Mark Pinto
//Lab 1-3
//CSC 236-62
public class Employee
{
    private String name;
    private int employeeNumber;
    private String hireDate;

    public Employee()
    {
        name = null;
        employeeNumber = 0;
        hireDate = null;
    }

    public Employee(String n, int eN, String hD)
    {
        name = n;
        employeeNumber = eN;
        hireDate = hD;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setEmployeeNumber(int eN)
    {
        employeeNumber = eN;
    }

    public void setHireDate(String hD)
    {
        hireDate = hD;
    }

    public String getName()
    {
        return name;
    }

    public int getEmployeeNumber()
    {
        return employeeNumber;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    public boolean isValidEmpNum(int eN) throws InvalidEmployeeNumber
    {
        if(eN >= 0 && eN <= 9999)
        {
            return true;
        }
        else
        throw new InvalidEmployeeNumber();
    }

    public String toString()
    {
        String str = "Name: "
                    + name
                    +"\nEmpolyee Number: "
                    + employeeNumber
                    +"\nHire Date: "
                    + hireDate;
        return str;
    }
}