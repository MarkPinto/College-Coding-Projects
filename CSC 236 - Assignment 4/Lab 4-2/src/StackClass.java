//Mark Pinto
//Lab 4-2
//CSC 236-62
public class StackClass implements StackADT
{
    private int maxSize;
    private int stackTop;
    private Object [] list;

    public StackClass()
    {
        maxSize = 100;
        stackTop = 0;
        list = new Object[maxSize];
    }

    public StackClass(int size)
    {
        if(size <= 0)
        {
            System.out.println("The size is not positive, creating array of 100");
            maxSize = 100;
        }
        else
        {
            maxSize = size;
        }
        stackTop = 0;
        list = new Object[maxSize];
    }

    public void initializeStack()
    {
        for(int i = 0;i<stackTop;i++)
        {
            list[i] = null;
        }

        stackTop = 0;
    }

    public boolean isEmptyStack()
    {
        return(stackTop == 0);
    }

    public boolean isFullStack()
    {
        return(stackTop == maxSize);
    }

    public void push(Object newItem) throws StackOverflowException
    {
        if(isFullStack())
        {
            throw new StackOverflowException();
        }

        list[stackTop] = newItem;
        stackTop++;
    }

    public void convert(int num,int base)
    {
        int i = 0;
        int flag = 0;
        int check;
        int answer = num;//num used to print answer

        while(flag == 0)
        {
            check = (int)Math.pow(base, i);

            if(check > num)
            {
                i--;
                check = (int)Math.pow(base, i);
                int numClone = num;
                int amount = 0;//used for amount of time number goes into number being converted
                               //ex. n*2^5 where is amount of times 32(2^5) is in 53
                int cloneBackup = 0;//used when out of loop to restore clone >= 0
                while(numClone - check >= 0)
                {
                    amount++;
                    cloneBackup = numClone;
                    numClone -= check;
                }
                push(amount);

                num = numClone;//extra testing code
                i--;
                flag = 1;
            }
            else
            {
                i++;
            }
        }

        while(i!=-1)
        {
            int amount = 0;
            check = (int)Math.pow(base, i);
            if(check > num)
            {
                push(0);
            }
            else
            {
                while(num - check >= 0)
                {
                    amount++;
                    num -= check;
                }
                push(amount);
            }
            i--;
        }
        StackADT clone = new StackClass();
        StackADT cloneNext = new StackClass();
        clone = moveToClone();
        System.out.print(answer + " in base " + base + " is ");
        while(!clone.isEmptyStack())
        {
            System.out.print(clone.peek());
            cloneNext.push(clone.peek());
            clone.pop();
        }
        StackADT cloneNextClone = new StackClass();
        while(!cloneNext.isEmptyStack())
        {
            cloneNextClone.push(cloneNext.peek());
            cloneNext.pop();
        }
        
        System.out.print(" = ");
        while(cloneNextClone.getStackTop() != 1)
        {
        	int howMany =  cloneNextClone.getStackTop()-1;
        	System.out.print(cloneNextClone.peek() + "*" + base + "^" + howMany + "+");
        	cloneNextClone.pop();
        }
        int howMany =  cloneNextClone.getStackTop()-1;
    	System.out.print(cloneNextClone.peek() + "*" + base + "^" + howMany);
    	cloneNextClone.pop();
        System.out.println();
    }

    public int getStackTop()
    {
    	return stackTop;
    }
    
    //moves the items into another stack
    //to prevent from printing in reverse
    public StackADT moveToClone()
    {
        StackADT clone = new StackClass();
        while(!isEmptyStack())
        {
            clone.push(peek());
            pop();
        }
        return clone;
    }

    public Object peek() throws StackUnderflowException
    {
        if(isEmptyStack())
        {
            throw new StackUnderflowException();
        }

        return list[stackTop-1];
    }

    public void pop() throws StackUnderflowException
    {
        if(isEmptyStack())
            throw new StackUnderflowException();

        stackTop--;
        list[stackTop]=null;
    }

}
