//Mark Pinto
//Lab 7-1
//CSC 236-62
public class Node 
{
	private Integer value;
	private Node next;
	
	public Node(Integer v, Node n)
	{
		value = v;
		next = n;
	}
	
	public Integer getValue()
	{
		return value;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setValue(Integer newValue)
	{
		value = newValue;
	}
	
	public void setNext(Node newNext)
	{
		next = newNext;
	}
}
