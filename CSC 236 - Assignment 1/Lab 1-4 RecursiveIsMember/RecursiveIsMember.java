//Mark Pinto
//Lab 1-4
//CSC 236-62
import java.util.Scanner;
public class RecursiveIsMember
{
    public static void main(String[] args)
    {
        int value = 0;
        int size;
        int arraySize;
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        size = key.nextInt();

        int[] array = new int[size];
        arraySize = array.length;

        System.out.println("Fill out the array:");

        //fills out array
        for(int i = 0;i < array.length;i++)
        {
            array[i] = key.nextInt();
        }

        System.out.println("Enter the value "
                           + "you're looking for"
                           + " or enter -999 to stop: ");

        //accepts value from user and passes it to isMember
        //along with the array as long as value is not -999
        while(value != -999)
        {

            value = key.nextInt();
            if(value != -999)
            {
                System.out.println("The value "
                                   + value
                                   + " is in the array: "
                                   + isMember(array,value,
                                     arraySize));
            }
            else
            System.out.println("Program is finished running");
        }
    }

    public static boolean isMember(int[] array,int value, int size)
    {
        if(size > 0 && value == array[size-1])
        {
            return true;
        }
        else if(size-1 != -1)
        {
            return isMember(array, value, size - 1);
        }
        else
        return false;

    }
}