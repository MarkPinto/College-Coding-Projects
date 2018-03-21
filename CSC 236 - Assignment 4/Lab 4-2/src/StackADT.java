//Mark Pinto
//Lab 4-2
//CSC 236-62
public interface StackADT
{
    public void initializeStack();

    public boolean isEmptyStack();

    public boolean isFullStack();

    public void push(Object object);

    public void convert(int num,int base);

    public int getStackTop();
    
    public StackADT moveToClone();

    public Object peek() throws StackUnderflowException;

    public void pop() throws StackUnderflowException;
}
