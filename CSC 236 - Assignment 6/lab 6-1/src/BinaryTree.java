
public abstract class BinaryTree 
{
	private TreeNode root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public TreeNode getRoot()
	{
		return root;
	}
	
	public void setRoot(TreeNode theNewNode)
	{
		root = theNewNode;
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public abstract void insert(Integer item);
	public abstract TreeNode find(Integer key);
	public abstract void first();
	public abstract void printTree(TreeNode root);
	public abstract void insertNoBST(Integer item);
}
