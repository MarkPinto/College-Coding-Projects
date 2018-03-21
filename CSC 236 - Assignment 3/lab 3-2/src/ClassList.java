//Mark Pinto
//Lab 3-2
//CSC 236-62
import java.util.NoSuchElementException;
public class ClassList implements ClassListADT
{
    private Node firstNode;
    private ClassListADT[] list;

    public ClassList()
    {
        firstNode = null;
    }

    public boolean isEmpty()
    {
        return firstNode == null;
    }

    public Node getFirstNode()
    {
        return firstNode;
    }

    public void setFirstNode(Node node)
    {
        firstNode = node;
    }

    //creates array
    public ClassListADT[] createArray()
    {
        //list = new ClassList[10];
        int count = 3;
        list = new ClassList[count];

        for(int i = 0; i < count ; i++)
        {
            list[i] = new ClassList();
        }
        return list;
    }

    //Adds student's ID to schedule
    public void addStudent(String i)
    {
        if(isEmpty())
            firstNode = new Node(i,null);
        else
            firstNode = new Node(i,firstNode);
    }

    //Adds a class to the student's schedule
    public void addCourse(String c,String s,String cr)
    {
        if(isEmpty())
            firstNode = new Node(c,s,cr,null);
        else
        {
            Node current = firstNode;
            while(current.getNext() != null)
                current = current.getNext();

            current.setNext(new Node(c,s,cr,null));
        }
    }

    //Drops a class from the student's schedule
    public void dropCourse(String c)
    {
        if(isEmpty())
            throw new NoSuchElementException("Empty Schedule");

        Node current = firstNode;
        Node follow = firstNode;
        follow = follow.getNext();
        current = current.getNext();
        while(!current.getClasses().equals(c) && current != null)
        {
            follow = current.getNext();
            current.setNext(follow.getNext());
            follow = null;
        }
        if(current.getClasses().equals(c))
        {
            follow.setNext(current);
            System.out.println("Class removed");
        }
        else
        {
            System.out.println("You're not registered for that class");
        }
    }

    //Reads schedule
    public String toString()
    {
        if(isEmpty())
            return " ";
        else
        {
            String s = " ";
            Node current = firstNode;
            System.out.print("ID:");
            System.out.print(current.getId());
            current = current.getNext();
            while(current != null)
            {
                s = s + "Class:"
                      + current.getClasses()
                      + " Section:"
                      + current.getSection()
                      + " Credits:"
                      + current.getCredit()
                      + " ";
                current = current.getNext();
            }
            return s;

        }
    }
}
