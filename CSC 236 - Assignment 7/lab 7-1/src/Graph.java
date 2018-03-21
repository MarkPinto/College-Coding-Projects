//Mark Pinto
//Lab 7-1
//CSC 236-62
import java.util.*;
import java.io.*;
public class Graph  implements GraphADT
{
	protected int maxSize;
	protected int gSize;
	protected UnorderedLinkedListADT[] graph;

	public Graph()
    {
		maxSize = 100;
        gSize = 0;
        graph = new UnorderedLinkedListADT[maxSize];

        for (int i = 0; i < maxSize; i++)
        {
        	graph[i] = new UnorderedLinkedList();
        }
    }

    public Graph(int size)
    {
        maxSize = size;
        gSize = 0;
        graph  = new UnorderedLinkedList[maxSize];

        for (int i = 0; i < maxSize; i++)
        {
        	graph[i] = new UnorderedLinkedList();
        }
    }

	public boolean isEmpty()
	{
		return (gSize == 0);
	}

	public void createGraph()
	{
	    if (gSize != 0)
	    {
	    	clearGraph();
	    }
	    Scanner infile = null;

	    try
	    {
	        infile = new Scanner(new FileReader("C:\\java\\lab 7-1\\src\\graph.txt"));
	    }
	    catch (FileNotFoundException fnfe)
	    {
	    	System.out.println(fnfe.toString());
	        System.exit(0);
	    }

	    gSize = infile.nextInt();

	    for (int index = 0; index < gSize; index++)
	    {
	    	int vertex = infile.nextInt();
	        int adjacentVertex = infile.nextInt();

	        while (adjacentVertex != -999)
	        {
	        	graph[vertex].addLast(adjacentVertex);
	            adjacentVertex = infile.nextInt();
	        }
	    }
	}

	public void clearGraph()
	{
		for (int index = 0; index < gSize; index++)
		{
			graph[index] = null;
		}
	    gSize = 0;
	}

	public void printGraph()
	{
		//used to convert numbers in graphs to the actual cities
		String[] city = {"Sydney","Brisbane","Canberra","Darwin","Melbourne","Hobart","Adelaide","Perth","BlackStump"};
		System.out.println("Printing graph from file graph.txt:\n");
		for (int index = 0; index < gSize; index++)
	    {
			System.out.print(city[index] + " ");
			graph[index].toString();//used to print
	        System.out.println();
	    }

		System.out.println();
	}

	public void depthFirstTraversal()
	{
		System.out.print("Depth First Traversal: ");
		boolean[] visited = new boolean[gSize];

	    //setting all values to false
	    for (int index = 0; index < gSize; index++)
	    {
	    	visited[index] = false;
	    }

	    //checks which index wasn't visited yet
	    for (int index = 0; index < gSize; index++)
	    {
	    	if (!visited[index])
	        {
	    		dftAtVertex(index, visited);
	        }
	    }
	}

	public void dftAtVertex(int index, boolean[] visited)
	{
	    int i = graph[index].getFirstValue();

	    visited[index] = true;

	    //used to convert numbers in graphs to the actual cities
	    String[] city = {"Sydney","Brisbane","Canberra","Darwin","Melbourne","Hobart","Adelaide","Perth","BlackStump"};

	    //prints out depth first traversal
	    System.out.print(city[index] + " ");

	    //test code
	    while(!graph[index].isEmpty())
	    {
	        i = graph[index].getFirstValue();//test add
	    	if (visited[i] == false)
	        {
	        	dftAtVertex(i, visited);
	        }
	        else
	        {
	        	graph[index].removeFirst();
	        }
	    }
	}

	public void breadthFirstTraversal()
	{
		//used to convert numbers in graphs to the actual cities
	    String[] city = {"Sydney","Brisbane","Canberra","Darwin","Melbourne","Hobart","Adelaide","Perth","BlackStump"};

		System.out.print("\nBreadth First Traversal: ");

		boolean[] visited = new boolean[gSize];
		QueueADT queue = new Queue();

		//setting all values to false
	    for (int index = 0; index < gSize; index++)
	    {
	    	visited[index] = false;
	    }

	    for (int index = 0; index < gSize; index++)
	    {
	    	//if index isn't visited
	    	if(visited[index] == false)
	    	{
	    		//add index to the queue
	    		queue.enqueue(index);
	    		//mark index as visited
	    		visited[index] = true;
	    		System.out.print(city[index] + " ");//test to print out breadth first traversal

	    		while (!queue.isEmpty())
	            {
	    			int value = queue.peek();
	    			queue.dequeue();

	    			while(!graph[value].isEmpty())
	    			{
	    				index = graph[value].getFirstValue();//test add
	    		    	if(visited[index] == false)
	    		        {
	    		    		//add index to the queue
	    		    		queue.enqueue(index);
	    		    		visited[index] = true;

	    		    		System.out.print(city[index] + " ");//test to print out breadth first traversal
	    		    		graph[value].removeFirst();//test to stop infinite loop
	    		        }
	    		    	else
	    		    	{
	    		    		graph[value].removeFirst();//test to stop infinite loop
	    		    	}
	    			}
	            }
	    	}
	    }

	}
}
