//Mark Pinto
//Lab 4-2
//CSC 236-62
public class StackOverflowException extends StackException
{
    public StackOverflowException()
    {
        super("Stack Overflow");
    }

    public StackOverflowException(String msg)
    {
        super(msg);
    }
}
