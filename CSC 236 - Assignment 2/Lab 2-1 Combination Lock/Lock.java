//Mark Pinto
//Lab 2-1
//CSC 236-62
public interface Lock
{
    public int alter(int one,int two,int three,int currentNum);

    public int turn(int specifiedNum, int comboNum,int currentNum);

    public void close();

    public int attempt(int specifiedNum, int comboNum,int currentNum);

    public boolean inquire();

    public int currently(int currentNum);
}
