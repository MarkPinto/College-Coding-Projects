//Mark Pinto
//Lab 3-2
//CSC 236-62
import java.util.Scanner;
public class ListMain
{
	static Scanner key = new Scanner(System.in);
	public static void main(String[]args)
	{
		int choice = 0;
		int i = 0;
        String id;
        String course;
        String section;
        String credit;
        ClassListADT[] list = null;
        ClassListADT one = new ClassList();

        System.out.println("Enter a number to make a choice");
        System.out.println("1. Enter student's ID");
        System.out.println("2. Add a class");
        System.out.println("3. Drop a class");
        System.out.println("4. Next student");
        System.out.println("5. Print Schedules");
        System.out.print("6. Exit");
        list = one.createArray();
        while(choice != 6)
        {
        	System.out.print("\n\nEnter your choice: ");
        	choice = key.nextInt();
        	key.nextLine();


        	if(choice == 1)
        	{
        		System.out.print("What is the student's ID? ");
        		id = key.nextLine();

        		list[i].addStudent(id);
        	}
        	else if(choice == 2)
        	{
        		System.out.print("What is the student's course? ");
        		course = key.nextLine();
        		System.out.print("What is course's section? ");
        		section = key.nextLine();
        		System.out.print("How many credits for the course? ");
        		credit = key.nextLine();
        		list[i].addCourse(course,section,credit);
            }
        	else if(choice == 3)
        	{
        		System.out.print("What class do you want to drop? ");
        		String c;
        		c = key.nextLine();
        		list[i].dropCourse(c);
            }
        	else if(choice == 4)
        	{
        		System.out.println("Ready to register next sudent");
        		i++;
            }
        	else if(choice == 5)
        	{
        		for(int j = 0;j<list.length;j++)
    			{
    				one = list[j];
    				System.out.println(one);
    			}
            }
        	else if(choice != 6)
        	{
        		System.out.println("Invalid number");
        	}
        }
	}
}
