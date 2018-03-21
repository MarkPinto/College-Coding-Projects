//Mark Pinto
//Lab 7-1
//CSC 236-62
public class BFTDFT
{
	public static void main(String[] args)
	{
		/*
			text file key
			a key when looking at the file "graph.txt"
			to understand each number represents
			0 = Sydney
			1 = Brisbane
			2 = Canberra
			3 = Darwin
			4 = Melbourne
			5 = Hobart
			6 = Adelaide
			7 = Perth
			8 = BlackStump
		*/

		//uses text file to make graph
		//just using graph for DFT
		GraphADT one = new Graph();
		one.createGraph();
		one.printGraph();
		System.out.println();
		one.depthFirstTraversal();
		System.out.println("\n");

		//uses the same text file as above
		//to make same graph just for BFT
		GraphADT two = new Graph();
		two.createGraph();
		two.printGraph();
		two.breadthFirstTraversal();
		System.out.println();
	}
}
