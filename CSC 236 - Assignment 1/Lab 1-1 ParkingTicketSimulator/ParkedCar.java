//Mark Pinto
//Lab 1-1
//CSC 236-62
public class ParkedCar
{
    private String make;
    private int model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String mak, int mod, String col, String ln,int mP)
    {
        make = mak;
        model = mod;
        color = col;
        licenseNumber = ln;
        minutesParked = mP;
    }

    public ParkedCar(ParkedCar c)
    {
        make = c.make;
        model = c.model;
        color = c.color;
        licenseNumber = c.licenseNumber;
        minutesParked = c.minutesParked;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String m)
    {
        make = m;
    }

    public int getModel()
    {
        return model;
    }

    public void setModel(int m)
    {
        model = m;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String c)
    {
        color = c;
    }

    public String getLicenseNumber()
    {
        return licenseNumber;
    }

    public void setLicenseNumber(String l)
    {
        licenseNumber = l;
    }

    public int getMinutesParked()
    {
        return minutesParked;
    }

    public void setMinutesParked(int p)
    {
        minutesParked = p;
    }

    public String toString()
    {
        String str = "\nParked Car Data:\nMaker: "
                    + make
                    + "\nModel: "
                    + model
                    + "\nColor: "
                    + color
                    + "\nLicense No.: "
                    + licenseNumber
                    + "\nMinutes Parked: "
                    + minutesParked;
        return str;
    }
}