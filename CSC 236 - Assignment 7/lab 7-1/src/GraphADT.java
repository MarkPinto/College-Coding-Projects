//Mark Pinto
//Lab 7-1
//CSC 236-62
public interface GraphADT 
{
	public boolean isEmpty();
	
	public void createGraph();
	
	public void clearGraph();
	
	public void printGraph();
	
	public void depthFirstTraversal();
	
	public void dftAtVertex(int index, boolean[] visited);
	
	public void breadthFirstTraversal();
}