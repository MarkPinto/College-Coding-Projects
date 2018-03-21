//Mark Pinto
//Lab 3-2
//CSC 236-62
public interface ClassListADT 
{
	public boolean isEmpty();
	
	public Node getFirstNode();
	
	public void setFirstNode(Node node);

	public ClassListADT[] createArray();
	
	public void addStudent(String i);
	
	public void addCourse(String c,String s,String cr);
	
	public void dropCourse(String c);
	
	public String toString();
}
