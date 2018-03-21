//Mark Pinto
//Lab 1-3
//CSC 236-62
public class InvalidShift extends Exception
{

    public InvalidShift()
    {
        super("\nError: invalid shift, Shift must be"
              + " day or night");
    }

    public InvalidShift(int s)
    {
        super("\nError: invalid shift, shift must be"
              + " day or night, shift entered: "
              + s);
    }
}