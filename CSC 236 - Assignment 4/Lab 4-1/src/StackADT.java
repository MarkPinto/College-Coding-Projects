//Mark Pinto
//Lab 4-1
//CSC 236-62
public interface StackADT
{
    public void initializeStack();

    public boolean isEmptyStack();

    public boolean isFullStack();

    public void push(String newElement);

    public void primeFactor(int num);

    public Integer findPrime(Integer div);

    public String peek() throws StackUnderflowException;

    public void pop() throws StackUnderflowException;
}
