//Mark Pinto
//Lab 3-1
//CSC 236-62
import java.util.NoSuchElementException;
public class Polynomial implements PolynomialADT
{
	private PolyNode firstNode;
	
	//creates polynomial
	public Polynomial()
	{
		firstNode = null;
	}
	
	//checks if polynomial is empty
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	
	//gets first node from polynomial
	public PolyNode getFirstNode()
	{
		return firstNode;
	}
	
	//Not used in program
	public void setFirstNode(PolyNode node)
	{
		firstNode = node;
	}
	
	//Not used in program
	public void addFirst(Integer c, Integer e)
	{
		if(isEmpty())
			firstNode = new PolyNode(c,e,null);
		else
			firstNode = new PolyNode(c,e,firstNode);
	}
	
	//Writes to a polynomial
	public void addLast(Integer c,Integer e)
	{
		if(isEmpty())
			firstNode = new PolyNode(c,e,null);
		else
		{
			PolyNode current = firstNode;
			while(current.getNext() != null)
				current = current.getNext();
			
			current.setNext(new PolyNode(c,e,null));
		}
	}
	
	//Not used in program
	public Integer removeFirst()
	{
		if(isEmpty())
			throw new NoSuchElementException("Empty Polynomial");
		Integer item = firstNode.getCofficient();
		firstNode = firstNode.getNext();
		return item;	
	}

	//Not used in program
	public Integer removeLast()
	{
		if(isEmpty())
			throw new NoSuchElementException("Empty Polynomial");
		PolyNode current = firstNode;
		PolyNode follow = null;
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
		return current.getCofficient();
	}
	
	//Adds a pair of polynomials
	public void addPoly(PolynomialADT o, PolynomialADT t,PolynomialADT th)
	{
		PolyNode one = o.getFirstNode();
		PolyNode two = t.getFirstNode();
		
		while(one != null && two != null)
		{
			if(one.getExponent() == two.getExponent())
			{
				int coff = one.getCofficient() + two.getCofficient();
				th.addLast(coff, one.getExponent());
				one = one.getNext();
				two = two.getNext();
			}
			else if(one.getExponent() > two.getExponent())
			{
				int coff = one.getCofficient();
				th.addLast(coff, one.getExponent());
				one = one.getNext();
			}
			else
			{
				int coff = two.getCofficient();
				th.addLast(coff, two.getExponent());
				two = two.getNext();
			}
		}
		while(one != null)
		{
			int coff = one.getCofficient();
			th.addLast(coff, one.getExponent());
			one = one.getNext();
		}
		while(two != null)
		{
			int coff = two.getCofficient();
			th.addLast(coff, two.getExponent());
			two = two.getNext();
		}		
	} 
	
	//Reads a polynomial
	public String toString()
	{
		if(isEmpty())
			return "Empty polynomial";
		else
		{
			String s = " ";
			PolyNode current = firstNode;
			int i = 0;
			
			
			while(current != null)
			{
			    if(i == 0)
				{
			    	if(current.getExponent() == 0)
					{
						s = s + current.getCofficient();
						i++;
					}
			    	else
			    	{
			    		s = s + current.getCofficient() 
				        	  + "x^"
				        	  + current.getExponent();
			    	    i++;
			    	}	
				}
			    else if(current.getCofficient() < 0)
				{
					if(current.getExponent() == 0)
					{
						s = s + current.getCofficient();
					}
					else
					{
						s = s + current.getCofficient() 
							  + "x^"
							  + current.getExponent();
					}	
				}
				else
				{
					if(current.getExponent() == 0)
					{
						s = s + "+"
						      + current.getCofficient();
					}
					else
					{
						s = s + "+"
							  + current.getCofficient() 
							  + "x^"
							  + current.getExponent();
					}
				}
					current = current.getNext();
				}
				return s;
			}
	}
}
