//Mark Pinto
//Lab 2-2
//CSC 236-62
public class MyNote implements Note
{
    private double length;
    private double value;

    public MyNote()
    {
        length = 0.25;
        value = -9;
    }

    public MyNote(double length,int value)
    {
        this.length = length;
        this.value = value;
    }

    public void setLength(double length)
    {
        if(length == 0.0625||length == 0.125
           ||length == 0.25 ||length == 0.5 ||length == 1)
        {
            this.length = length;
            System.out.println("Note length has been set to "
                               + this.length);
        }
        else
            System.out.println("Invalid note length");
    }

    public double getLength()
    {
        System.out.print("The note's length is ");
        return length;
    }

    public void setValue(double value)
    {
        if(value == 2||value == 1||value == 0 ||value == -1
           ||value == -2||value == -3||value == -4||value == -5
           ||value == -6||value == -7||value == -8||value == -9)
        {
            this.value = value;
            System.out.println("Note value has been set to "
                               + this.value);
        }
        else
            System.out.println("Inalid note value");
    }

    public double getValue()
    {
        return value;
    }

    public String noteLetter(double value)
    {
        String note = " ";

        if(value == 2)
        {
            note = "A#";
        }
        else if(value == 1)
        {
            note = "B";
        }
        else if(value == 0)
        {
            note = "A";
        }
        else if(value == -1)
        {
            note = "G#";
        }
        else if(value == -2)
        {
            note = "G";
        }
        else if(value == -3)
        {
            note = "F#";
        }
        else if(value == -4)
        {
            note = "B";
        }
        else if(value == -5)
        {
            note = "E";
        }
        else if(value == -6)
        {
            note = "D#";
        }
        else if(value == -7)
        {
            note = "D";
        }
        else if(value == -8)
        {
            note = "C#";
        }
        else if(value == -9)
        {
            note = "C";
        }
        System.out.print("The note's letter is ");
        return note;
    }

    public String keyColor(double value)
    {
        System.out.print("The key is ");
        String color = " ";
        if(value==-9||value==-7||value==-5||
           value==-4||value==-2||value==0||value==2)
        {
            color = "natural (white key)";
        }
        else if(value==-8||value==-6||value==-3
                ||value==-1||value==1)
        {
            color = "sharp (black key)";
        }
        return color;
    }

    public double frequency(double value)
    {
        value = 440*Math.pow(2, value/12);
        System.out.print("The note's frequency is ");
        return value;
    }

}
