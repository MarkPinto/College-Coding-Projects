//Mark Pinto
//Lab 2-1
//CSC 236-62
public class MyLock implements Lock
{
    private int one;
    private int two;
    private int three;
    private boolean lockOpen;
    private int oneA;
    private int twoA;
    private int threeA;

    public MyLock()
    {
        one = 0;
        two = 0;
        three = 0;
        lockOpen = false;
        oneA = 0;
        twoA = 0;
        threeA = 0;
    }

    public MyLock(int one,int two,int three,
                  boolean lockOpen,int oneA,
                  int twoA,int threeA)
    {
        this.one = one;
        this.two = two;
        this.three = three;
        this.lockOpen = lockOpen;
        this.oneA = oneA;
        this.twoA = twoA;
        this.threeA = threeA;
    }

    public int alter(int one, int two, int three,int currentNum)
    {
        this.one = one;
        currentNum = turn(one,1,currentNum);
        this.two = two;
        currentNum = turn(two,2,currentNum);
        this.three = three;
        currentNum = turn(three,3,currentNum);

        System.out.print("\nLock combo changed to "
                           + one
                           + ","
                           + two
                           + ","
                           + three);
        return currentNum;
    }

    public int turn(int specifiedNum, int comboNum,int currentNum)
    {
        int newLine = 0;
        if(comboNum == 1)
        {
            System.out.println("Turning knob clockwise");
            int temp = currentNum - 1;
            if(temp == -1)
                temp = 39;
            //will go through one clockwise revolution
            //will print out all numbers as spinning lock
            for(int check = 0;check != 1;currentNum++)
            {
                if(currentNum > 39)
                {
                    currentNum = 0;
                }
                //used to see if one revolution has finished
                if(currentNum == temp)
                {
                    currentNum--;
                    check = 1;
                }
                else
                    System.out.print(currentNum+" ");
                    newLine++;
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
            }
            //will stop at 1st number specified in combo
            while(currentNum != specifiedNum)
            {
                System.out.print(currentNum+" ");
                newLine++;
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
                currentNum++;
                if(currentNum > 39)
                {
                    currentNum = 0;
                }
            }
                System.out.print(currentNum);
        }
        else if(comboNum == 2)
        {
            System.out.println("\nTurning knob counterclockwise");
            //will go through one counterclockwise revolution
            //will print out all numbers as spinning lock
            for(int circleTurn=0;circleTurn != 1;circleTurn++)
            {
                int temp = currentNum + 1;
                if(temp == 40)
                    temp = 0;
                for(int check = 0;check != 1;currentNum--)
                {
                    //used to see if lock is out of bounds
                    if(currentNum == -1)
                    {
                        currentNum = 39;
                        System.out.print(currentNum+" ");
                        newLine++;
                    }
                    else
                    {
                        System.out.print(currentNum+" ");
                        newLine++;
                    }
                    if(currentNum == temp)
                        check = 1;
                    //creates new line so numbers fit
                    if(newLine == 10)
                    {
                        System.out.println();
                        newLine = 0;
                    }
                }
            }
            //will stop at 2nd number specified in combo
            while(currentNum != specifiedNum)
            {
                if(currentNum == -1)
                {
                    currentNum = 39;
                    System.out.print(currentNum+" ");
                    currentNum--;
                    newLine++;
                }
                else
                {
                    System.out.print(currentNum+" ");
                    currentNum--;
                    newLine++;
                }
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
            }
            System.out.print(currentNum+" ");
        }
        else if(comboNum == 3)
        {
            System.out.println("\nTurning knob clockwise");
            while(currentNum != specifiedNum)
            {
                if(currentNum == 40)
                {
                    currentNum = 0;
                    System.out.print(currentNum+" ");
                    currentNum++;
                    newLine++;
                }
                else
                {
                    System.out.print(currentNum+" ");
                    currentNum++;
                    newLine++;
                }
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
            }
            System.out.print(currentNum+" ");
        }
        return currentNum;
    }

    public void close()
    {
        if(lockOpen == false)
        {
            System.out.print("The lock is already closed");
        }
        else if(lockOpen == true)
        {
            lockOpen = false;
            System.out.println("The lock has been closed");
        }
    }

    public int attempt(int specifiedNum, int comboNum,int currentNum)
    {
        int newLine = 0;
        if(comboNum == 1)
        {
            System.out.println("Turning knob clockwise");
            oneA = specifiedNum;
            int temp = currentNum - 1;
            if(temp == -1)
                temp = 39;
            //will go through one clockwise revolution
            //will print out all numbers as spinning lock
            for(int check = 0;check != 1;currentNum++)
            {
                if(currentNum > 39)
                {
                    currentNum = 0;
                }
                //used to see if one revolution has finished
                if(currentNum == temp)
                {
                    currentNum--;
                    check = 1;
                }
                else
                    System.out.print(currentNum+" ");
                    newLine++;
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
            }
            //will stop at 1st number specified in combo
            while(currentNum != specifiedNum)
            {
                System.out.print(currentNum+" ");
                newLine++;
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
                currentNum++;
                if(currentNum > 39)
                {
                    currentNum = 0;
                }
            }
                System.out.print(currentNum);
        }
        else if(comboNum == 2)
        {
            System.out.println("Turning knob counterclockwise");
            twoA = specifiedNum;
            //will go through one counterclockwise revolution
            //will print out all numbers as spinning lock
            for(int circleTurn=0;circleTurn != 1;circleTurn++)
            {
                int temp = currentNum + 1;
                if(temp == 40)
                    temp = 0;
                for(int check = 0;check != 1;currentNum--)
                {
                    //used to see if lock is out of bounds
                    if(currentNum == -1)
                    {
                        currentNum = 39;
                        System.out.print(currentNum+" ");
                        newLine++;
                    }
                    else
                    {
                        System.out.print(currentNum+" ");
                        newLine++;
                    }
                    if(currentNum == temp)
                        check = 1;
                    //creates new line so numbers fit
                    if(newLine == 10)
                    {
                        System.out.println();
                        newLine = 0;
                    }
                }
            }
            //will stop at 2nd number specified in combo
            while(currentNum != specifiedNum)
            {
                if(currentNum == -1)
                {
                    currentNum = 39;
                    System.out.print(currentNum+" ");
                    currentNum--;
                    newLine++;
                }
                else
                {
                    System.out.print(currentNum+" ");
                    currentNum--;
                    newLine++;
                }
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
            }
            System.out.print(currentNum+" ");
        }
        else if(comboNum == 3)
        {
            System.out.println("Turning knob clockwise");
            threeA = specifiedNum;
            while(currentNum != specifiedNum)
            {
                if(currentNum == 40)
                {
                    currentNum = 0;
                    System.out.print(currentNum+" ");
                    currentNum++;
                    newLine++;
                }
                else
                {
                    System.out.print(currentNum+" ");
                    currentNum++;
                    newLine++;
                }
                //creates new line so numbers fit
                if(newLine == 10)
                {
                    System.out.println();
                    newLine = 0;
                }
            }
            System.out.print(currentNum+" ");
        }

        if(oneA == one && twoA == two && threeA == three)
        {
            System.out.print("\nLock has been unlocked");
            lockOpen = true;
        }
        else if(comboNum == 3)
        {
            System.out.print("\nAttempt to unlock failed");
        }
        return currentNum;
    }

    public boolean inquire()
    {
        System.out.print("The lock is unlocked: ");
        if(lockOpen == true)
        {
            return true;
        }
        else
            return false;
    }

    public int currently(int currentNum)
    {
        System.out.print("The number currently at the top is ");
        return currentNum;
    }

}
