//Mark Pinto
//Lab 2-1
//CSC 236-62
import java.util.Scanner;
public class MainLockClass
{
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args)
    {
        int choice = 0;
        int cNum = 0;
        int specNum = 0;
        int i = 0;
        Lock one = new MyLock();

            System.out.println("Enter a number to make a choice");
            System.out.println("1. Alter the locks combination");
            System.out.println("2. Turn the knob");
            System.out.println("3. Close the lock");
            System.out.println("4. Attempt to open the lock");
            System.out.println("5. Inquire about the status of the lock");
            System.out.println("6. See what number is currently at the top");
            System.out.print("7. Exit");
        while(choice != 7)
        {
            System.out.print("\n\nEnter your choice: ");
            choice = key.nextInt();


            if(choice == 1)
            {
                System.out.print("Enter 1st new number: ");
                int oneN = key.nextInt();
                System.out.print("Enter 2nd new number: ");
                int twoN = key.nextInt();
                System.out.print("Enter 3rd new number: ");
                int threeN = key.nextInt();
                cNum = one.alter(oneN,twoN,threeN,cNum);
            }
            else if(choice == 2)
            {
                i+=1;
                System.out.print("What number do you want to turn to? ");
                specNum = key.nextInt();
                if(i == 1)
                {
                    cNum = one.turn(specNum, 1, cNum);
                }
                else if(i == 2)
                {
                    cNum = one.turn(specNum,2,cNum);
                }
                else if(i == 3)
                {
                    cNum = one.turn(specNum,3,cNum);
                }
                else if(i == 4)
                {
                    i = 1;
                    cNum = one.turn(specNum,4,cNum);
                }
            }
            else if(choice == 3)
            {
                one.close();
            }
            else if(choice == 4)
            {
                System.out.print("What number do you want to turn to? ");
                specNum = key.nextInt();
                cNum = one.attempt(specNum, 1, cNum);
                System.out.print("\nWhat number do you want to turn to? ");
                specNum = key.nextInt();
                cNum = one.attempt(specNum,2,cNum);
                System.out.print("\nWhat number do you want to turn to? ");
                specNum = key.nextInt();
                cNum = one.attempt(specNum,3,cNum);
            }
            else if(choice == 5)
            {
                System.out.print(one.inquire());
            }
            else if(choice == 6)
            {
                System.out.print(one.currently(cNum));
            }
            else if(choice != 7)
            {
                System.out.println("Invalid number");
            }
        }
    }
}
