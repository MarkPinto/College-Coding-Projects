//Mark Pinto
//Lab 7-1
//CSC 236-62
public interface UnorderedLinkedListADT 
{	
	public boolean isEmpty();
	
	public Node getFirstNode();
	
	public void setFirstNode(Node node);
	
	public void addFirst(Integer c, Integer e);
	
	public void addLast(Integer c);
	
	public Integer removeFirst();

	public Integer removeLast();
	
	public String toString();

	public int getFirstValue();
}
