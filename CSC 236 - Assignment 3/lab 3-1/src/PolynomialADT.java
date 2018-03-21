//Mark Pinto
//Lab 3-1
//CSC 236-62
public interface PolynomialADT 
{
	public boolean isEmpty();
	
	public PolyNode getFirstNode();
	
	public void setFirstNode(PolyNode node);
	
	public void addFirst(Integer c, Integer e);
	
	public void addLast(Integer c,Integer e);
	
	public Integer removeFirst();

	public Integer removeLast();
	
	public void addPoly(PolynomialADT o, PolynomialADT t,PolynomialADT th);

	public String toString();
}
