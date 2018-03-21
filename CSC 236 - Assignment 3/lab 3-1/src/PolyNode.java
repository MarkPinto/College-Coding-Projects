//Mark Pinto
//Lab 3-1
//CSC 236-62
public class PolyNode 
{
	private Integer coefficient;
	private Integer exponent;
	private PolyNode next;
	
	public PolyNode(Integer c,Integer e,PolyNode n)
	{
		coefficient = c;
		exponent = e;
		next = n;
	}
	
	public Integer getCofficient()
	{
		return coefficient;
	}
	
	public Integer getExponent()
	{
		return exponent;
	}
	
	public PolyNode getNext()
	{
		return next;
	}
	
	public void setCoefficient(Integer newCoefficient)
	{
		coefficient = newCoefficient;
	}
	
	public void setExponent(Integer newExponent)
	{
		exponent = newExponent;
	}
	
	public void setNext(PolyNode newNext)
	{
		next = newNext;
	}
}
