//Mark Pinto
//Lab 7-1
//CSC 236-62
public class Queue implements QueueADT
{
	private class Node
	{
		private Integer item;
		private Node link;
		
		public Node()
		{
			item = null;
			link = null;
		}
		
		public Node(Integer newItem, Node linkValue)
		{
			item = newItem;
			link = linkValue;
		}
	}
	
	private Node front;
	private Node back;
	
	public Queue()
	{
		front = null;
		back = null;
	}
	
	public boolean isEmpty()
	{
		return(front == null);
	}
	
	public Integer peek()
	{
		if(front == null)
			return null;
		else
			return front.item;
	}
	
	public boolean dequeue()
	{
		if(front != null)
		{
			front = front.link;
			return true;
		}
		else
			return false;
	}
	
	public void enqueue(Integer itemName)
	{
		Node newEntry = new Node(itemName,null);
		if(front == null)
		{
			back = newEntry;
			front = back;
		}
		else
		{
			back.link = newEntry;
			back = back.link;
		}
	}
}
