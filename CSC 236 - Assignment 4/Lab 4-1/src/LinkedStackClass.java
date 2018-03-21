//Mark Pinto
//Lab 4-1
//CSC 236-62
public class LinkedStackClass implements StackADT
{
    //node inner class
    private class StackNode
    {
        public String info;
        public StackNode link;

        public StackNode()
        {
            info = null;
            link = null;
        }

        public StackNode(String elem,StackNode ptr)
        {
            info = elem;
            link = ptr;
        }

        public String toString()
        {
            return info.toString();
        }
    }

    private StackNode stackTop;

    public LinkedStackClass()
    {
        stackTop = null;
    }

    public void initializeStack()
    {
        stackTop = null;
    }

    public boolean isEmptyStack()
    {
        return (stackTop == null);
    }

    public boolean isFullStack()
    {
        return false;
    }

    public void push(String newElement)
    {
        StackNode newNode;

        newNode = new StackNode(newElement, stackTop);

        stackTop = newNode;
    }

    //used to print and find prime factors
    public void primeFactor(int num)
    {
        Integer divide = 2;
        int originalClone = num;//used for answer
        while(num !=1)
        {
            while(num % divide != 0)
            {
                divide = findPrime(divide);
            }
            String s = divide.toString();
            String m = "*";
            push(s);//pushes prime factor onto stack
            push(m);//pushes * onto stack
            num = num/divide;
        }
        pop();//gets rid of extra * on stack
        System.out.println("Number: " + originalClone);
        System.out.print("Prime factors: ");
        while(!isEmptyStack())
        {
            System.out.print(peek() + " ");
            pop();
        }
        System.out.println();
    }

    //used to find the next prime number of number
    public Integer findPrime(Integer div)
    {
        int check = 0;
        div += 1;
        while(check == 0)
        {
            for(int i=2;i<div;i++)
            {
                if(div%i==0)
                    div+=1;
                else
                {
                    check = 1;
                }
            }
        }

        return div;
    }

    public String peek() throws StackUnderflowException
    {
        if(stackTop == null)
            throw new StackUnderflowException();

        return stackTop.info;
    }

    public void pop() throws StackUnderflowException
    {
        if(stackTop == null)
            throw new StackUnderflowException();

        stackTop = stackTop.link;
    }

}
