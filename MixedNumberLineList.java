// Java MixedNumberLineList Class

import java.util.LinkedList;

public class MixedNumberLineList extends NumberLineList
{
    private LinkedList <AnyType> positiveList;
    private LinkedList <AnyType> negativeList;

    public MixedNumberLineList()
    {
        this.positiveList = new LinkedList<>();
        this.negativeList = new LinkedList<>();
    }

    @Override
    public void add(int value, char end)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (end == '-')
        {
            this.negativeList.addLast(anyTypeValue);
        }
        else if (end == '+')
        {
            this.positiveList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
            System.exit(1);
        }
    }

    @Override
    public void add(double value, char end)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (end == '-')
        {
            this.negativeList.addLast(anyTypeValue);
        }
        else if (end == '+')
        {
            this.positiveList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
            System.exit(1);
        }
    }

    @Override
    public void add(char value, char end)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (end == '-')
        {
            this.negativeList.addLast(anyTypeValue);
        }
        else if (end == '+')
        {
            this.positiveList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
            System.exit(1);
        }
    }

    @Override
    public void add(String value, char end)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (end == '-')
        {
            this.negativeList.addLast(anyTypeValue);
        }
        else if (end == '+')
        {
            this.positiveList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
            System.exit(1);
        }
    }

    @Override
    public void addAt(int index, int value)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.add(actualIndex, anyTypeValue);
        }
        else
        {
            this.positiveList.add(index, anyTypeValue);
        }
    }

    @Override
    public void addAt(int index, double value)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.add(actualIndex, anyTypeValue);
        }
        else
        {
            this.positiveList.add(index, anyTypeValue);
        }
    }

    @Override
    public void addAt(int index, char value)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.add(actualIndex, anyTypeValue);
        }
        else
        {
            this.positiveList.add(index, anyTypeValue);
        }
    }

    @Override
    public void addAt(int index, String value)
    {
        AnyType anyTypeValue = new AnyType(value);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.add(actualIndex, anyTypeValue);
        }
        else
        {
            this.positiveList.add(index, anyTypeValue);
        }
    }

    @Override
    public void reset(int index, int newValue)
    {
        AnyType newAnyTypeValue = new AnyType(newValue);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.set(actualIndex, newAnyTypeValue);
        }
        else
        {
            this.positiveList.set(index, newAnyTypeValue);
        }
    }

    @Override
    public void reset(int index, double newValue)
    {
        AnyType newAnyTypeValue = new AnyType(newValue);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.set(actualIndex, newAnyTypeValue);
        }
        else
        {
            this.positiveList.set(index, newAnyTypeValue);
        }
    }

    @Override
    public void reset(int index, char newValue)
    {
        AnyType newAnyTypeValue = new AnyType(newValue);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.set(actualIndex, newAnyTypeValue);
        }
        else
        {
            this.positiveList.set(index, newAnyTypeValue);
        }
    }

    @Override
    public void reset(int index, String newValue)
    {
        AnyType newAnyTypeValue = new AnyType(newValue);

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.set(actualIndex, newAnyTypeValue);
        }
        else
        {
            this.positiveList.set(index, newAnyTypeValue);
        }
    }

    @Override
    public void delete(int index)
    {
        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            this.negativeList.remove(actualIndex);
        }
        else
        {
            this.positiveList.remove(index);
        }
    }

    @Override
    public void deleteAll()
    {
        this.negativeList.clear();
        this.positiveList.clear();
    }

    @Override
    public int getInteger(int index)
    {
        int value;
        AnyType anyTypeValue;
        DataType type;

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            anyTypeValue = this.negativeList.get(actualIndex);
        }
        else
        {
            anyTypeValue = this.positiveList.get(index);
        }

        type = anyTypeValue.getType();

        if (type == DataType.INTEGER)
        {
            value = anyTypeValue.getInteger();
        }
        else
        {
            value = 0;
            System.out.println("Java MixedNumberLineList Class Object - The method 'getInteger()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    @Override
    public double getDouble(int index)
    {
        double value;
        AnyType anyTypeValue;
        DataType type;

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            anyTypeValue = this.negativeList.get(actualIndex);
        }
        else
        {
            anyTypeValue = this.positiveList.get(index);
        }

        type = anyTypeValue.getType();

        if (type == DataType.DOUBLE)
        {
            value = anyTypeValue.getDouble();
        }
        else
        {
            value = 0.0;
            System.out.println("Java MixedNumberLineList Class Object - The method 'getDouble()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    @Override
    public char getCharacter(int index)
    {
        char value;
        AnyType anyTypeValue;
        DataType type;

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            anyTypeValue = this.negativeList.get(actualIndex);
        }
        else
        {
            anyTypeValue = this.positiveList.get(index);
        }

        type = anyTypeValue.getType();

        if (type == DataType.CHARACTER)
        {
            value = anyTypeValue.getCharacter();
        }
        else
        {
            value = ' ';
            System.out.println("Java MixedNumberLineList Class Object - The method 'getCharacter()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    @Override
    public String getString(int index)
    {
        String value;
        AnyType anyTypeValue;
        DataType type;

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            anyTypeValue = this.negativeList.get(actualIndex);
        }
        else
        {
            anyTypeValue = this.positiveList.get(index);
        }

        type = anyTypeValue.getType();

        if (type == DataType.STRING)
        {
            value = anyTypeValue.getString();
        }
        else
        {
            value = "";
            System.out.println("Java MixedNumberLineList Class Object - The method 'getString()' is incompatible with " + type + " type");
            System.exit(1);
        }

        return value;
    }

    @Override
    public int position(int value)
    {
        boolean presence = false;
        int logicalIndex = 0;
        AnyType anyTypeValue;

        for (int i = 0; i < this.negativeList.size(); i++)
        {
            anyTypeValue = this.negativeList.get(i);

            if (anyTypeValue.getType() == DataType.INTEGER)
            {
                if (anyTypeValue.getInteger() == value)
                {
                    logicalIndex = toNegative((i + 1));
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (int i = 0; i < this.positiveList.size(); i++)
            {
                anyTypeValue = this.positiveList.get(i);

                if (anyTypeValue.getType() == DataType.INTEGER)
                {
                    if (anyTypeValue.getInteger() == value)
                    {
                        logicalIndex = i;
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
            System.exit(1);
        }

        return logicalIndex;
    }

    @Override
    public int position(double value)
    {
        boolean presence = false;
        int logicalIndex = 0;
        AnyType anyTypeValue;

        for (int i = 0; i < this.negativeList.size(); i++)
        {
            anyTypeValue = this.negativeList.get(i);

            if (anyTypeValue.getType() == DataType.DOUBLE)
            {
                if (anyTypeValue.getDouble() == value)
                {
                    logicalIndex = toNegative((i + 1));
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (int i = 0; i < this.positiveList.size(); i++)
            {
                anyTypeValue = this.positiveList.get(i);

                if (anyTypeValue.getType() == DataType.DOUBLE)
                {
                    if (anyTypeValue.getDouble() == value)
                    {
                        logicalIndex = i;
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
            System.exit(1);
        }

        return logicalIndex;
    }

    @Override
    public int position(char value)
    {
        boolean presence = false;
        int logicalIndex = 0;
        AnyType anyTypeValue;

        for (int i = 0; i < this.negativeList.size(); i++)
        {
            anyTypeValue = this.negativeList.get(i);

            if (anyTypeValue.getType() == DataType.CHARACTER)
            {
                if (anyTypeValue.getCharacter() == value)
                {
                    logicalIndex = toNegative((i + 1));
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (int i = 0; i < this.positiveList.size(); i++)
            {
                anyTypeValue = this.positiveList.get(i);

                if (anyTypeValue.getType() == DataType.CHARACTER)
                {
                    if (anyTypeValue.getCharacter() == value)
                    {
                        logicalIndex = i;
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
            System.exit(1);
        }

        return logicalIndex;
    }

    @Override
    public int position(String value)
    {
        boolean presence = false;
        int logicalIndex = 0;
        AnyType anyTypeValue;

        for (int i = 0; i < this.negativeList.size(); i++)
        {
            anyTypeValue = this.negativeList.get(i);

            if (anyTypeValue.getType() == DataType.STRING)
            {
                if ((anyTypeValue.getString()).equals(value))
                {
                    logicalIndex = toNegative((i + 1));
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (int i = 0; i < this.positiveList.size(); i++)
            {
                anyTypeValue = this.positiveList.get(i);

                if (anyTypeValue.getType() == DataType.STRING)
                {
                    if ((anyTypeValue.getString()).equals(value))
                    {
                        logicalIndex = i;
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
            System.exit(1);
        }

        return logicalIndex;
    }

    @Override
    public boolean presence(int value)
    {
        boolean presence = false;
        AnyType anyTypeValue;

        for (AnyType anyType : this.negativeList)
        {
            anyTypeValue = anyType;

            if (anyTypeValue.getType() == DataType.INTEGER)
            {
                if (anyTypeValue.getInteger() == value)
                {
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (AnyType anyType : this.positiveList)
            {
                anyTypeValue = anyType;

                if (anyTypeValue.getType() == DataType.INTEGER)
                {
                    if (anyTypeValue.getInteger() == value)
                    {
                        presence = true;
                        break;
                    }
                }
            }
        }

        return presence;
    }

    @Override
    public boolean presence(double value)
    {
        boolean presence = false;
        AnyType anyTypeValue;

        for (AnyType anyType : this.negativeList)
        {
            anyTypeValue = anyType;

            if (anyTypeValue.getType() == DataType.DOUBLE)
            {
                if (anyTypeValue.getDouble() == value)
                {
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (AnyType anyType : this.positiveList)
            {
                anyTypeValue = anyType;

                if (anyTypeValue.getType() == DataType.DOUBLE)
                {
                    if (anyTypeValue.getDouble() == value)
                    {
                        presence = true;
                        break;
                    }
                }
            }
        }

        return presence;
    }

    @Override
    public boolean presence(char value)
    {
        boolean presence = false;
        AnyType anyTypeValue;

        for (AnyType anyType : this.negativeList)
        {
            anyTypeValue = anyType;

            if (anyTypeValue.getType() == DataType.CHARACTER)
            {
                if (anyTypeValue.getCharacter() == value)
                {
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (AnyType anyType : this.positiveList)
            {
                anyTypeValue = anyType;

                if (anyTypeValue.getType() == DataType.CHARACTER)
                {
                    if (anyTypeValue.getCharacter() == value)
                    {
                        presence = true;
                        break;
                    }
                }
            }
        }

        return presence;
    }

    @Override
    public boolean presence(String value)
    {
        boolean presence = false;
        AnyType anyTypeValue;

        for (AnyType anyType : this.negativeList)
        {
            anyTypeValue = anyType;

            if (anyTypeValue.getType() == DataType.STRING)
            {
                if ((anyTypeValue.getString()).equals(value))
                {
                    presence = true;
                    break;
                }
            }
        }

        if (!presence)
        {
            for (AnyType anyType : this.positiveList)
            {
                anyTypeValue = anyType;

                if (anyTypeValue.getType() == DataType.STRING)
                {
                    if ((anyTypeValue.getString()).equals(value))
                    {
                        presence = true;
                        break;
                    }
                }
            }
        }

        return presence;
    }

    @Override
    public int getSize()
    {
        return (this.negativeList.size() + this.positiveList.size());
    }

    public DataType getType(int index)
    {
        AnyType anyTypeValue;

        if (index <= -1)
        {
            int actualIndex = (toPositive(index) - 1);
            anyTypeValue = this.negativeList.get(actualIndex);
        }
        else
        {
            anyTypeValue = this.positiveList.get(index);
        }

        return anyTypeValue.getType();
    }
}
