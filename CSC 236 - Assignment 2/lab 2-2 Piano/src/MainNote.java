//Mark Pinto
//Lab 2-2
//CSC 236-62
import java.util.Scanner;
public class MainNote
{
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args)
    {
        int choice = 0;
        double length;
        double value;
        Note one = new MyNote();

            System.out.println("Enter a number to make a choice");
            System.out.println("1. Print all information about the note");
            System.out.println("2. Set the length of the note");
            System.out.println("3. Get the length of the note");
            System.out.println("4. Set the value of the note");
            System.out.println("5. Get the value of the note");
            System.out.println("6. Find out the letter of the note");
            System.out.println("7. Find out if the key is natural or sharp");
            System.out.println("8. Find out the frequency of a note");
            System.out.print("9. Exit");
        while(choice != 9)
        {
            System.out.print("\n\nEnter your choice: ");
            choice = key.nextInt();

            if(choice == 1)
            {
                System.out.println("Note information: ");
                System.out.println(one.getLength());
                System.out.print("The note's value is ");
                System.out.println(one.getValue());
                System.out.println(one.noteLetter(one.getValue()));
                System.out.println(one.keyColor(one.getValue()));
                System.out.print(one.frequency(one.getValue()));
                System.out.print(" Hz");
            }
            else if(choice == 2)
            {
                System.out.print("Enter the note's length: ");
                length = key.nextDouble();
                one.setLength(length);
            }
            else if(choice == 3)
            {
                System.out.println(one.getLength());
            }
            else if(choice == 4)
            {
                System.out.print("Enter the note's value: ");
                value = key.nextDouble();
                one.setValue(value);
            }
            else if(choice == 5)
            {
                System.out.print("The note's value is ");
                System.out.println(one.getValue());
            }
            else if(choice == 6)
            {
                System.out.println(one.noteLetter(one.getValue()));
            }
            else if(choice == 7)
            {
                System.out.println(one.keyColor(one.getValue()));
            }
            else if(choice == 8)
            {
                System.out.print(one.frequency(one.getValue()));
                System.out.print(" Hz");
            }
            else if(choice != 9)
            {
                System.out.println("Invalid number");
            }
        }
    }
}