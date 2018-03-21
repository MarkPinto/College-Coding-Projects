//Mark Pinto
//Lab 1-1
//CSC 236-62
public class ParkingMeter
{
    private int minutesPurchased;

    public ParkingMeter(int mP)
    {
        minutesPurchased = mP;
    }

    public int getMinutesPurchased()
    {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int mP)
    {
        minutesPurchased = mP;
    }
}