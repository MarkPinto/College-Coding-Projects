//Mark Pinto
//Lab 4-3
//CSC 236-62
public class LinkedStackClass implements StackADT
{
    //node inner class
    private class StackNode
    {
        public Character info;
        public StackNode link;

        public StackNode()
        {
            info = null;
            link = null;
        }

        public StackNode(Character elem,StackNode ptr)
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

    //used
    public void push(String newElement)
    {
        //for loop that pushes each character onto the stack
        //string goes in with the end of the string on top
        for(int i = 0;i < newElement.length();i++)
        {
            StackNode newNode;

            newNode = new StackNode(newElement.charAt(i), stackTop);

            stackTop = newNode;
        }

        //call to method that creates a clone
        createClone(newElement);
    }

    //creates second Stack to compare with original
    public void createClone(String newElement)
    {
        StackADT clone = new LinkedStackClass();
        clone.fillClone(newElement);
        compare(clone,newElement);//added String parameter get rid of if program doesnt work
    }

    //fills clone stack
    public void fillClone(String newElement)
    {
        //for loop that pushes each character onto the stack
        //string goes in with the beginning of the string on top
        for(int i = newElement.length()-1;i > -1;i--)
        {
            StackNode newNode;

            newNode = new StackNode(newElement.charAt(i), stackTop);

            stackTop = newNode;
        }

    }

    //checks if palindrome or not
    //update added String parameter get rid of if program not working
    public void compare(StackADT o, String newElement)
    {
        int count = 0;
        int total = total(newElement);

        while(!isEmptyStack())
        {
            check(o);
            if(peek() == o.peek() || peek()+32 == o.peek() || peek()-32 == o.peek())
            {
                count += 1;
            }
            pop();
            o.pop();
        }
        if(count == total)
        {
            System.out.println("\"" + newElement + "\" is a palindrome\n");
        }
        else
        {
            System.out.println("\"" + newElement + "\" is not a palindrome\n");
        }
    }

    //determines total
    public int total(String newElement)
    {
        int total = 0;
        for(int i = 0;i < newElement.length();i++)
        {
            if(newElement.charAt(i) >= 'A' && newElement.charAt(i) <= 'z')
            {
                total += 1;
            }
        }
        return total;
    }

    //all the characters to check for
    public void check(StackADT o)
    {

        while(peek() < 'A' || peek() > 'z')
        {
            pop();
        }

        while(o.peek() < 'A' || o.peek() > 'z')
        {
            o.pop();
        }
    }

    public Character peek() throws StackUnderflowException
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
