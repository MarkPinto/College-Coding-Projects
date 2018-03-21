//Mark Pinto
//Lab 3-2
//CSC 236-62
public class Node 
{
	private String id;
	private String classes;
	private String section;
	private String credit;
	private Node next;
	
	public Node(String i,Node n)
	{
		id = i;
		next = n;
	}
	
	public Node(String cl,String s,String cr,Node n)
	{
		classes = cl;
		section = s;
		credit = cr;
		next = n;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getClasses()
	{
		return classes;
	}
	
	public String getSection()
	{
		return section;
	}
	
	public String getCredit()
	{
		return credit;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public void setClasses(String classes)
	{
		this.classes=classes;
	}
	
	public void setSection(String section)
	{
		this.section = section;
	}
	
	public void setCredit(String credit)
	{
		this.credit = credit;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
}
