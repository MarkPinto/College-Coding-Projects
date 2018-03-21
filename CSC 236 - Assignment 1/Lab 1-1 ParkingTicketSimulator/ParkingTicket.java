//Mark Pinto
//Lab 1-1
//CSC 236-62
import java.text.DecimalFormat;
public class ParkingTicket
{
    DecimalFormat round = new DecimalFormat("#,##0.00");
    private int fine;
    private ParkedCar car;
    private PoliceOfficer officer;

    public ParkingTicket(int f, ParkedCar c, PoliceOfficer o)
    {
        fine = f;
        car = c;
        officer = o;
    }

    public ParkingTicket(ParkingTicket c)
    {
        fine = c.fine;
        car = c.car;
        officer = c.officer;
    }

    public void calculateFine(int f)
    {
        int t = f;
        if(t/60 > 0)
        {
            f = ((t/60)-1)*10;
        }

        if(t%60 > 0)
        {
            f += 10;
        }

        f += 25;
        fine = f;
    }

    public void setCar(ParkedCar c)
    {
        car = c;
    }

    public void setOfficer(PoliceOfficer o)
    {
        officer = o;
    }

    public ParkedCar getCar()
    {
        return car;
    }

    public int getFine()
    {
        return fine;
    }

    public PoliceOfficer getOfficer()
    {
        return officer;
    }

    public String toString()
    {
        String str = "\nParking Ticket Information:"
                    + "\nMinutes Illegally Parked: "
                    + car.getMinutesParked()
                    + "\nFine: $"
                    + round.format(fine);
        return str;
    }
}