//Mark Pinto
//Lab 4-3
//CSC 236-62
public interface StackADT
{
    public void initializeStack();

    public boolean isEmptyStack();

    public boolean isFullStack();

    public void push(String newElement);

    public void createClone(String newElement);

    public void fillClone(String newElement);

    public void compare(StackADT o, String newElement);

    public int total(String newElement);

    public void check(StackADT o);

    public Character peek() throws StackUnderflowException;

    public void pop() throws StackUnderflowException;
}
