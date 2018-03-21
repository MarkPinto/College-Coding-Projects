//Mark Pinto
//Lab 7-1
//CSC 236-62
import java.util.NoSuchElementException;
public class UnorderedLinkedList implements UnorderedLinkedListADT
{
	private Node firstNode;
	
	public UnorderedLinkedList()
	{
		firstNode = null;
	}
	
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	
	public Node getFirstNode()
	{
		return firstNode;
	}
	
	public void setFirstNode(Node node)
	{
		firstNode = node;
	}
	
	public void addFirst(Integer c, Integer e)
	{
		if(isEmpty())
			firstNode = new Node(c,null);
		else
			firstNode = new Node(c,firstNode);
	}
	
	public void addLast(Integer c)
	{
		if(isEmpty())
			firstNode = new Node(c,null);
		else
		{
			Node current = firstNode;
			while(current.getNext() != null)
				current = current.getNext();
			
			current.setNext(new Node(c,null));
		}
	}
	
	public Integer removeFirst()
	{
		if(isEmpty())
			throw new NoSuchElementException("Empty");
		Integer item = firstNode.getValue();
		firstNode = firstNode.getNext();
		return item;	
	}

	public Integer removeLast()
	{
		if(isEmpty())
			throw new NoSuchElementException("Empty");
		Node current = firstNode;
		Node follow = null;
		while(current.getNext() != null)
		{
			follow = current;
			current = current.getNext();
		}
		
		if(follow == null)
		{
			firstNode = null;
		}
		else
		{
			follow.setNext(null);
		}
		return current.getValue();
	}
	
	//Reads a LL
	public String toString()
	{
		String[] city = {"Sydney","Brisbane","Canberra","Darwin","Melbourne","Hobart","Adelaide","Perth","BlackStump"};
		if(isEmpty())
			return "Empty";
		else
		{
			String s = " ";
			Node current = firstNode;
			
			
			while(current != null)
			{
			   	System.out.print(city[current.getValue()]+" ");
				current = current.getNext();
			}
				return s;
			}
	}
	
	//doesn't return firstNode but returns firstNodes value
	public int getFirstValue()
	{	
		return firstNode.getValue();
	}
}
