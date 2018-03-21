//Mark Pinto
//Lab 6-1
//CSC 236-62
public interface BSTADT
{	
	public TreeNode getRoot();
	
	public void setRoot(TreeNode theNewNode);
	
	public boolean isEmpty();
	
	public void insert(Integer item);
	
	public TreeNode find(Integer key);
	
	public void buildTreeDiagram();
					
	public void printTree(Object tree[][]);
	
	public void startLevelTraversal();
	 
	public void printLevelOrder(TreeNode root, int level);
	 
	public int height(TreeNode node);
	
	public void startSwap();
	
	public TreeNode swapSubtrees(TreeNode swap);
}
