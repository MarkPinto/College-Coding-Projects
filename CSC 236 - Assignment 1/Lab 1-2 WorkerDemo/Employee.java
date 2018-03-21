//Mark Pinto
//Lab 1-2
//CSC 236-62
public class Employee
{
    private String name;
    private String employeeNumber;
    private String hireDate;

    public Employee()
    {
        name = null;
        employeeNumber = null;
        hireDate = null;
    }

    public Employee(String n, String eN, String hD)
    {
        name = n;
        employeeNumber = eN;
        hireDate = hD;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setEmployeeNumber(String eN)
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

    public String getEmployeeNumber()
    {
        return employeeNumber;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    public boolean isValidEmpNum(String eN)
    {
        int checker = 0;

        while(checker < 3)
        {
            if(eN.charAt(checker) >= '0' && eN.charAt(checker) <= '9')
                checker++;
            else
                checker = 6;
        }
        if(eN.charAt(3) == '-')
            checker++;
        if(eN.charAt(4) >= 'A' && eN.charAt(4) <= 'M')
            checker++;

        if(checker == 5)
        return true;
        else
        return false;
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