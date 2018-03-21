//Mark Pinto
//Lab 6-1
//CSC 236-62
public class SwapTree 
{
	public static void main(String[] args)
	{
		BSTADT one = new BinarySearchTree();
		one.insert(14);
		one.insert(4);
		one.insert(15);
		one.insert(3);
		one.insert(9);
		one.insert(18);
		one.insert(7);
		one.insert(16);
		one.insert(20);
		one.insert(5);
		one.insert(17);
		one.startLevelTraversal();
		one.buildTreeDiagram();
		one.startSwap();
	    one.startLevelTraversal();
	    one.buildTreeDiagram();
	    
	    BSTADT two = new BinarySearchTree();
	    two.insert(4);
	    two.insert(2);
	    two.insert(6);
	    two.insert(1);
	    two.insert(3);
	    two.insert(5);
	    two.startLevelTraversal();
	    two.buildTreeDiagram();
	    two.startSwap();
	    two.startLevelTraversal();
	    two.buildTreeDiagram();
	    
	}
}
