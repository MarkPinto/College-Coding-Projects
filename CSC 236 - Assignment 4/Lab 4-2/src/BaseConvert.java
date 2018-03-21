//Mark Pinto
//Lab 4-2
//CSC 236-62
import java.util.Scanner;
public class BaseConvert
{
    public static void main(String[]args)
    {
        Scanner key = new Scanner(System.in);
        int num;
        int base;

        System.out.print("Enter a number in base 10: ");
        num = key.nextInt();
        System.out.print("Enter a base: ");
        base = key.nextInt();
        StackADT one = new StackClass();
        one.convert(num, base);

        System.out.println();
        System.out.print("Enter a number in base 10: ");
        num = key.nextInt();
        System.out.print("Enter a base: ");
        base = key.nextInt();
        StackADT two = new StackClass();
        two.convert(num, base);

        System.out.println();
        System.out.print("Enter a number in base 10: ");
        num = key.nextInt();
        System.out.print("Enter a base: ");
        base = key.nextInt();
        StackADT three = new StackClass();
        three.convert(3553, 8);
    }
}
