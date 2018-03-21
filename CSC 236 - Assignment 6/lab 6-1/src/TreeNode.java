//Mark Pinto
//Lab 6-1
//CSC 236-62
public class TreeNode 
{
	private Integer value;
	private TreeNode left,right;
	
	public TreeNode(Integer initValue)
	{
		value = initValue;
		left = null;
		right = null;
	}
	
	public TreeNode(Integer initValue, TreeNode initLeft, TreeNode initRight)
	{
		value = initValue;
		left = initLeft;
		right = initRight;
	}
	
	public Integer getValue()
	{
		return value;
	}
	
	public TreeNode getLeft()
	{
		return left;
	}
	
	public TreeNode getRight()
	{
		return right;
	}
	
	public void setValue(Integer theNewValue)
	{
		value = theNewValue;
	}
	
	public void setLeft(TreeNode theNewLeft)
	{
		left = theNewLeft;
	}
	
	public void setRight(TreeNode theNewRight)
	{
		right = theNewRight;
	}
	
}
