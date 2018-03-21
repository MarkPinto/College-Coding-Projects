//Mark Pinto
//Lab 1-1
//CSC 236-62
public class PoliceOfficer
{
    private String name;
    private int badgeNumber;

    public PoliceOfficer(String n, int bN)
    {
        name = n;
        badgeNumber = bN;
    }

    public PoliceOfficer(PoliceOfficer c)
    {
        name = c.name;
        badgeNumber = c.badgeNumber;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setBadgeNumber(int bN)
    {
        badgeNumber = bN;
    }

    public String getName()
    {
        return name;
    }

    public int getBadgeNumber()
    {
        return badgeNumber;
    }

    public void patrol(ParkedCar o, ParkingMeter t, PoliceOfficer th)
    {
        if(o.getMinutesParked() > t.getMinutesPurchased())
        {
            int temp = o.getMinutesParked();
            ParkingTicket four = new ParkingTicket(25,o,th);
            four.calculateFine(o.getMinutesParked() - t.getMinutesPurchased());
            //sets minutes parked to illegal minutes parked temporarily
            o.setMinutesParked(o.getMinutesParked() - t.getMinutesPurchased());
            System.out.println(four);
            //sets minutes parked back to original
            o.setMinutesParked(temp);
        }
        else
            System.out.println("\nNo crimes committed.");
    }

    public String toString()
    {
        String str = "\nPolice Officer Data:\nName: "
                    + name
                    + "\nBadge Number: "
                    + badgeNumber;
        return str;
    }
}