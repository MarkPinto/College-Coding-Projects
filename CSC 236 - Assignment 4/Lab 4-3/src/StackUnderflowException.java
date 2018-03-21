//Mark Pinto
//Lab 4-3
//CSC 236-62
public class StackUnderflowException extends StackException
{
    public StackUnderflowException()
    {
        super("Stack Underflow");
    }

    public StackUnderflowException(String msg)
    {
        super(msg);
    }
}
