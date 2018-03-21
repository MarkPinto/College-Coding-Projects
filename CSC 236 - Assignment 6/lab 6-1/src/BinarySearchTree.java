//Mark Pinto
//Lab 6-1
//CSC 236-62
public class BinarySearchTree implements BSTADT
{
	private TreeNode root;
	private int e = 0;
	private Object list[] = new Object[50];
	private boolean flag = false;
	
	public BinarySearchTree()
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
	
	public void insert(Integer item)
	{
		if(getRoot() == null)
		{
			setRoot(new TreeNode(item));
		}
		else
		{
			TreeNode p = null;
			TreeNode q = getRoot();
			while(q != null)
			{
				p = q;
				if(item.compareTo(p.getValue()) < 0)
				{
					q = p.getLeft();
				}
				else
				{
					q = p.getRight();
				}
			}
		
		
			if(item.compareTo(p.getValue()) < 0)
			{
				p.setLeft(new TreeNode(item));
			}
			else
			{
				p.setRight(new TreeNode(item));
			}
		}
	}
	
	public TreeNode find(Integer key) 
	{
		TreeNode p = getRoot();
		while(p != null && key.compareTo(p.getValue()) != 0)
		{
			if(key.compareTo(p.getValue()) < 0)
				p = p.getLeft();
			else
				p = p.getRight();
		}	
		
		return p;
	}
	
	//test
	//this method relies on the level order traversal method
	//startLevelTraversal();
	public void buildTreeDiagram()//took out Integer list[]
	{
		System.out.println("\n");
		//relies on level order 
		Object tree[][] = new Object[32][32];//size subject to change
		int Lcheck = 0;
		int Rcheck = 0;
		if(flag == false)
		{		
			for(int element = 0;list[element] != null;element++)
			{
				//starting point
				int row = 0;
				int col = tree.length/2-1;
				if(tree[row][col] == null)
				{
					//root inserted
					tree[row][col] = list[element];
				}
				else if((Integer)list[element] < (Integer)tree[row][col])
				{
					if(Lcheck == 0)
					{
						row+=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						row+=1;
						col-=1;
						tree[row][col] = "/";
						row+=1;
						col-=1;
						tree[row][col] = list[element];
					
						Lcheck = 1;
					}
					else
					{
						//back to position of first element to left of root
						row += 3;
						col -= 7;
						//System.out.println(tree[row][col]);
						while(tree[row][col] != null)
						{
							if((Integer)list[element] < (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								row+=1;
								col-=1;
								tree[row][col] = "/";
								row+=1;
								col-=1;
							}
							else if((Integer)list[element] > (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								row+=1;
								col+=1;
								tree[row][col] = "\\";
								row+=1;
								col+=1;
							}
						}
						//insert element into area that is null
						tree[row][col] = list[element];
					}
				}
				else if((Integer)list[element] > (Integer)tree[row][col])
				{
					if(Rcheck == 0)
					{
						row+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						row+=1;
						col+=1;
						tree[row][col] = "\\";
						row+=1;
						col+=1;
						tree[row][col] = list[element];
					
						Rcheck = 1;
					}
					else
					{
						//back to position of first element to left of root
						row += 3;
						col += 7;
					
						while(tree[row][col] != null)
						{
							if((Integer)list[element] < (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								row+=1;
								col-=1;
								tree[row][col] = "/";
								row+=1;
								col-=1;
							}
							else if((Integer)list[element] > (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								row+=1;
								col+=1;
								tree[row][col] = "\\";
								row+=1;
								col+=1;
							}
						}
						//insert element into area that is null
						tree[row][col] = list[element];
					}
				}
			}
			flag = true;
		}
		else //when flag equals true
			 //still must be tested 
		{
			for(int element = 0;list[element] != null;element++)
			{
				//starting point
				int row = 0;
				int col = tree.length/2-1;
			
				if(tree[row][col] == null)
				{
					//root inserted
					tree[row][col] = list[element];
				}
				else if((Integer)list[element] > (Integer)tree[row][col])
				{
					if(Lcheck == 0)
					{
						row+=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						col-=1;
						tree[row][col] = "-";
						row+=1;
						col-=1;
						tree[row][col] = "/";
						row+=1;
						col-=1;
						tree[row][col] = list[element];
					
						Lcheck = 1;
					}
					else
					{
						//back to position of first element to left of root
						row += 3;
						col -= 7;
						//System.out.println(tree[row][col]);
						while(tree[row][col] != null)
						{
							if((Integer)list[element] > (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								row+=1;
								col-=1;
								tree[row][col] = "/";
								row+=1;
								col-=1;
							}
							else if((Integer)list[element] < (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								row+=1;
								col+=1;
								tree[row][col] = "\\";
								row+=1;
								col+=1;
							}
						}
						//insert element into area that is null
						tree[row][col] = list[element];
					}
				}
				else if((Integer)list[element] < (Integer)tree[row][col])
				{
					if(Rcheck == 0)
					{
						row+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						col+=1;
						tree[row][col] = "-";
						row+=1;
						col+=1;
						tree[row][col] = "\\";
						row+=1;
						col+=1;
						tree[row][col] = list[element];
					
						Rcheck = 1;
					}
					else
					{
						//back to position of first element to left of root
						row += 3;
						col += 7;
					
						while(tree[row][col] != null)
						{
							if((Integer)list[element] > (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								col-=1;
								tree[row][col] = "-";
								row+=1;
								col-=1;
								tree[row][col] = "/";
								row+=1;
								col-=1;
							}
							else if((Integer)list[element] < (Integer)tree[row][col])
							{
								row+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								col+=1;
								tree[row][col] = "-";
								row+=1;
								col+=1;
								tree[row][col] = "\\";
								row+=1;
								col+=1;
							}
						}
						//insert element into area that is null
						tree[row][col] = list[element];
					}
				}
			}
		}
		printTree(tree);
	}
	 
	//print tree
	public void printTree(Object tree[][])
	{
		//fills in null spaces
		for(int i = 0; i < tree.length; i++)
		{
		    for(int j = 0; j < tree[i].length; j++)
		    {
		        if(tree[i][j]==null)
		        {
		        	tree[i][j] = " ";
		        }
		    }
		}
		//prints tree
		for(int i = 0; i < tree.length; i++)
		{
		    for(int j = 0; j < tree[i].length; j++)
		    {
		        System.out.print(tree[i][j]);
		        if(j < tree[i].length - 1) System.out.print(" ");
		    }
		    System.out.println();
		}
	}
	
	//helps start the level traversal, needs some modifications
	public void startLevelTraversal()
	{
		TreeNode root = getRoot();
		System.out.print("Level Order:");
		int height = height(root);
	  
		for(int i=1; i<=height; i++)
		{
			printLevelOrder(root, i);
		}
	}     
	 
	//prints level order
	public void printLevelOrder(TreeNode root, int level)
	{
	  if(root == null)
	  {
		  return;
	  }
	  if(level == 1)
	  { 	
		  int value = root.getValue();
		  //stores values from level order
		  //as it progresses into an array
		  //for use in printing
		  list[e] = value;
		  e++;
		  System.out.print(" " + value);
	  }
	  else if (level > 1)
	  {
		  printLevelOrder(root.getLeft(), level-1);
		  printLevelOrder(root.getRight(), level-1);
	  }
	}
	 
	//calculates height, needed for level order traversal
	public int height(TreeNode node)
	{
	   if (node==null)
	       return 0;
	   else
	   {
		    int leftH = height(node.getLeft());
	     	int rightH = height(node.getRight());
	 
	     	if (leftH > rightH)
	     	{
	         	return(leftH+1);
	     	}
	     	else
	     	{ 
	    	 	return(rightH+1);
	     	}
	    }
	} 
	
	//supposed to swap trees, still test code
	//needed to stop recursion from messing up
	//with swap
	public void startSwap()
	{
		TreeNode swap = getRoot();
		swapSubtrees(swap);
	}
	
	//does actual swapping
	public TreeNode swapSubtrees(TreeNode swap)
	{
	    //this line of code fixed a infinite loop, still test code
		e = 0;//resets array to 0 to store new level order for later
	    
		if(swap == null)
		{
	        return null;
		}
		
	    swapSubtrees(swap.getLeft());
	    swapSubtrees(swap.getRight());
	    TreeNode temp = swap.getLeft();
	    swap.setLeft(swap.getRight());
	    swap.setRight(temp);
	 
	    return swap;
	}

	
}
