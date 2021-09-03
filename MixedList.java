// Java Mixed List Class

import java.util.LinkedList;

public class MixedList
{
    private LinkedList <AnyType> mixedList;

    public MixedList()
    {
        this.mixedList = new LinkedList<>();
    }

    public void add(int value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.addLast(anyTypeValue);
    }

    public void add(double value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.addLast(anyTypeValue);
    }

    public void add(char value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.addLast(anyTypeValue);
    }

    public void add(String value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.addLast(anyTypeValue);
    }

    public void addAt(int index, int value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.add(index, anyTypeValue);
    }

    public void addAt(int index, double value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.add(index, anyTypeValue);
    }

    public void addAt(int index, char value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.add(index, anyTypeValue);
    }

    public void addAt(int index, String value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.add(index, anyTypeValue);
    }

    public void reset(int index, int value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.set(index, anyTypeValue);
    }

    public void reset(int index, double value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.set(index, anyTypeValue);
    }

    public void reset(int index, char value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.set(index, anyTypeValue);
    }

    public void reset(int index, String value)
    {
        AnyType anyTypeValue = new AnyType(value);
        this.mixedList.set(index, anyTypeValue);
    }

    public void delete(int index)
    {
        this.mixedList.remove(index);
    }

    public void deleteAll()
    {
        this.mixedList.clear();
    }

    public int getInteger(int index)
    {
        AnyType anyTypeValue = this.mixedList.get(index);
        DataType type = anyTypeValue.getType();
        int value;

        if (type == DataType.INTEGER)
        {
            value = anyTypeValue.getInteger();
        }
        else
        {
            value = 0;
            System.out.println("Java MixedList Class Object - The method 'getInteger()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    public double getDouble(int index)
    {
        AnyType anyTypeValue = this.mixedList.get(index);
        DataType type = anyTypeValue.getType();
        double value;

        if (type == DataType.DOUBLE)
        {
            value = anyTypeValue.getDouble();
        }
        else
        {
            value = 0.0;
            System.out.println("Java MixedList Class Object - The method 'getDouble()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    public char getCharacter(int index)
    {
        AnyType anyTypeValue = this.mixedList.get(index);
        DataType type = anyTypeValue.getType();
        char value;

        if (type == DataType.CHARACTER)
        {
            value = anyTypeValue.getCharacter();
        }
        else
        {
            value = ' ';
            System.out.println("Java MixedList Class Object - The method 'getCharacter()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    public String getString(int index)
    {
        AnyType anyTypeValue = this.mixedList.get(index);
        DataType type = anyTypeValue.getType();
        String value;

        if (type == DataType.STRING)
        {
            value = anyTypeValue.getString();
        }
        else
        {
            value = "";
            System.out.println("Java MixedList Class Object - The method 'getString()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    public int position(int value)
    {
        int index = -1;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.INTEGER)
            {
                if ((anyTypeValue.getInteger()) == value)
                {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }

    public int position(double value)
    {
        int index = -1;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.DOUBLE)
            {
                if ((anyTypeValue.getDouble()) == value)
                {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }

    public int position(char value)
    {
        int index = -1;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.CHARACTER)
            {
                if ((anyTypeValue.getCharacter()) == value)
                {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }

    public int position(String value)
    {
        int index = -1;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.STRING)
            {
                if ((anyTypeValue.getString()).equals(value))
                {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }

    public boolean presence(int value)
    {
        boolean present = false;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.INTEGER)
            {
                if ((anyTypeValue.getInteger()) == value)
                {
                    present = true;
                    break;
                }
            }
        }

        return present;
    }

    public boolean presence(double value)
    {
        boolean present = false;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.DOUBLE)
            {
                if ((anyTypeValue.getDouble()) == value)
                {
                    present = true;
                    break;
                }
            }
        }

        return present;
    }

    public boolean presence(char value)
    {
        boolean present = false;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.CHARACTER)
            {
                if ((anyTypeValue.getCharacter()) == value)
                {
                    present = true;
                    break;
                }
            }
        }

        return present;
    }

    public boolean presence(String value)
    {
        boolean present = false;
        AnyType anyTypeValue;

        for (int i = 0; i < this.mixedList.size(); i++)
        {
            anyTypeValue = this.mixedList.get(i);

            if ((anyTypeValue.getType()) == DataType.STRING)
            {
                if ((anyTypeValue.getString()).equals(value))
                {
                    present = true;
                    break;
                }
            }
        }

        return present;
    }
	
	public int getSize()
    {
        return this.mixedList.size();
    }

    public DataType getType(int index)
    {
        AnyType anyTypeValue = this.mixedList.get(index);
        return anyTypeValue.getType();
    }
}
