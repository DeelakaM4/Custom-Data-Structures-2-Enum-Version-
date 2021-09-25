// Java NumberLineList Class

import java.util.LinkedList;

public class NumberLineList
{
    private final DataType TYPE;
    private LinkedList <Integer> integerListP;
    private LinkedList <Integer> integerListN;
    private LinkedList <Double> doubleListP;
    private LinkedList <Double> doubleListN;
    private LinkedList <Character> characterListP;
    private LinkedList <Character> characterListN;
    private LinkedList <String> stringListP;
    private LinkedList <String> stringListN;

    public NumberLineList()
    {
        // Default Constructor

        this.TYPE = DataType.STRING;

        this.stringListP = new LinkedList<>();
        this.stringListN = new LinkedList<>();
    }

    public NumberLineList(DataType type)
    {
        // Parameterized Constructor

        this.TYPE = type;

        if (this.TYPE == DataType.INTEGER)
        {
            this.integerListP = new LinkedList<>();
            this.integerListN = new LinkedList<>();
        }
        else if (this.TYPE == DataType.DOUBLE)
        {
            this.doubleListP = new LinkedList<>();
            this.doubleListN = new LinkedList<>();
        }
        else if (this.TYPE == DataType.CHARACTER)
        {
            this.characterListP = new LinkedList<>();
            this.characterListN = new LinkedList<>();
        }
        else if (this.TYPE == DataType.STRING)
        {
            this.stringListP = new LinkedList<>();
            this.stringListN = new LinkedList<>();
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList type '" + type + "' is invalid");
            System.exit(1);
        }
    }

    final int toPositive(int num)
    {
        int positiveNum;

        if (num <= -1)
        {
            String signedStringNum = Integer.toString(num);
            int lastIndex = signedStringNum.length();
            String unsignedStringNum = signedStringNum.substring(1, lastIndex);
            positiveNum = Integer.parseInt(unsignedStringNum);
        }
        else
        {
            positiveNum = num;
        }

        return positiveNum;
    }

    final int toNegative(int num)
    {
        int negativeNum;

        if (num >= 1)
        {
            String unsignedStringNum = Integer.toString(num);
            String signedStringNum = ("-" + unsignedStringNum);
            negativeNum = Integer.parseInt(signedStringNum);
        }
        else
        {
            negativeNum = num;
        }

        return negativeNum;
    }

    public void add(int value, char end)
    {
        if (this.TYPE == DataType.INTEGER)
        {
            if (end == '-')
            {
                this.integerListN.addLast(value);
            }
            else if (end == '+')
            {
                this.integerListP.addLast(value);
            }
            else
            {
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void add(double value, char end)
    {
        if (this.TYPE == DataType.DOUBLE)
        {
            if (end == '-')
            {
                this.doubleListN.addLast(value);
            }
            else if (end == '+')
            {
                this.doubleListP.addLast(value);
            }
            else
            {
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void add(char value, char end)
    {
        if (this.TYPE == DataType.CHARACTER)
        {
            if (end == '-')
            {
                this.characterListN.addLast(value);
            }
            else if (end == '+')
            {
                this.characterListP.addLast(value);
            }
            else
            {
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void add(String value, char end)
    {
        if (this.TYPE == DataType.STRING)
        {
            if (end == '-')
            {
                this.stringListN.addLast(value);
            }
            else if (end == '+')
            {
                this.stringListP.addLast(value);
            }
            else
            {
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + end + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'add()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void addAt(int index, int value)
    {
        if (this.TYPE == DataType.INTEGER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.integerListN.add(actualIndex, value);
            }
            else
            {
                this.integerListP.add(index, value);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'addAt()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void addAt(int index, double value)
    {
        if (this.TYPE == DataType.DOUBLE)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.doubleListN.add(actualIndex, value);
            }
            else
            {
                this.doubleListP.add(index, value);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'addAt()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void addAt(int index, char value)
    {
        if (this.TYPE == DataType.CHARACTER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.characterListN.add(actualIndex, value);
            }
            else
            {
                this.characterListP.add(index, value);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'addAt()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void addAt(int index, String value)
    {
        if (this.TYPE == DataType.STRING)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.stringListN.add(actualIndex, value);
            }
            else
            {
                this.stringListP.add(index, value);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'addAt()' has incompatible argument '" + value + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void reset(int index, int newValue)
    {
        if (this.TYPE == DataType.INTEGER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.integerListN.set(actualIndex, newValue);
            }
            else
            {
                this.integerListP.set(index, newValue);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'reset()' has incompatible argument '" + newValue + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void reset(int index, double newValue)
    {
        if (this.TYPE == DataType.DOUBLE)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.doubleListN.set(actualIndex, newValue);
            }
            else
            {
                this.doubleListP.set(index, newValue);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'reset()' has incompatible argument '" + newValue + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void reset(int index, char newValue)
    {
        if (this.TYPE == DataType.CHARACTER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.characterListN.set(actualIndex, newValue);
            }
            else
            {
                this.characterListP.set(index, newValue);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'reset()' has incompatible argument '" + newValue + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void reset(int index, String newValue)
    {
        if (this.TYPE == DataType.STRING)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.stringListN.set(actualIndex, newValue);
            }
            else
            {
                this.stringListP.set(index, newValue);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'reset()' has incompatible argument '" + newValue + "'");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void delete(int index)
    {
        if (this.TYPE == DataType.INTEGER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.integerListN.remove(actualIndex);
            }
            else
            {
                this.integerListP.remove(index);
            }
        }
        else if (this.TYPE == DataType.DOUBLE)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.doubleListN.remove(actualIndex);
            }
            else
            {
                this.doubleListP.remove(index);
            }
        }
        else if (this.TYPE == DataType.CHARACTER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.characterListN.remove(actualIndex);
            }
            else
            {
                this.characterListP.remove(index);
            }
        }
        else if (this.TYPE == DataType.STRING)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                this.stringListN.remove(actualIndex);
            }
            else
            {
                this.stringListP.remove(index);
            }
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'delete()' has incompatible datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public void deleteAll()
    {
        if (this.TYPE == DataType.INTEGER)
        {
            this.integerListN.clear();
            this.integerListP.clear();
        }
        else if (this.TYPE == DataType.DOUBLE)
        {
            this.doubleListN.clear();
            this.doubleListP.clear();
        }
        else if (this.TYPE == DataType.CHARACTER)
        {
            this.characterListN.clear();
            this.characterListP.clear();
        }
        else if (this.TYPE == DataType.STRING)
        {
            this.stringListN.clear();
            this.stringListP.clear();
        }
        else
        {
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'deleteAll()' has incompatible datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }
    }

    public int getInteger(int index)
    {
        int value;

        if (this.TYPE == DataType.INTEGER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                value = this.integerListN.get(actualIndex);
            }
            else
            {
                value = this.integerListP.get(index);
            }
        }
        else
        {
            value = 0;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'getInteger()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return value;
    }

    public double getDouble(int index)
    {
        double value;

        if (this.TYPE == DataType.DOUBLE)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                value = this.doubleListN.get(actualIndex);
            }
            else
            {
                value = this.doubleListP.get(index);
            }
        }
        else
        {
            value = 0.0;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'getDouble()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return value;
    }

    public char getCharacter(int index)
    {
        char value;

        if (this.TYPE == DataType.CHARACTER)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                value = this.characterListN.get(actualIndex);
            }
            else
            {
                value = this.characterListP.get(index);
            }
        }
        else
        {
            value = ' ';
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'getCharacter()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return value;
    }

    public String getString(int index)
    {
        String value;

        if (this.TYPE == DataType.STRING)
        {
            if (index <= -1)
            {
                int actualIndex = (toPositive(index) - 1);
                value = this.stringListN.get(actualIndex);
            }
            else
            {
                value = this.stringListP.get(index);
            }
        }
        else
        {
            value = "";
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'getString()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return value;
    }

    public int position(int value)
    {
        int logicalIndex;

        if (this.TYPE == DataType.INTEGER)
        {
            if (this.integerListN.contains(value))
            {
                int actualIndex = this.integerListN.indexOf(value);
                logicalIndex = toNegative((actualIndex + 1));
            }
            else if (this.integerListP.contains(value))
            {
                logicalIndex = this.integerListP.indexOf(value);
            }
            else
            {
                logicalIndex = 0;
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            logicalIndex = 0;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'positive()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return logicalIndex;
    }

    public int position(double value)
    {
        int logicalIndex;

        if (this.TYPE == DataType.DOUBLE)
        {
            if (this.doubleListN.contains(value))
            {
                int actualIndex = this.doubleListN.indexOf(value);
                logicalIndex = toNegative((actualIndex + 1));
            }
            else if (this.doubleListP.contains(value))
            {
                logicalIndex = this.doubleListP.indexOf(value);
            }
            else
            {
                logicalIndex = 0;
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            logicalIndex = 0;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'positive()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return logicalIndex;
    }

    public int position(char value)
    {
        int logicalIndex;

        if (this.TYPE == DataType.CHARACTER)
        {
            if (this.characterListN.contains(value))
            {
                int actualIndex = this.characterListN.indexOf(value);
                logicalIndex = toNegative((actualIndex + 1));
            }
            else if (this.characterListP.contains(value))
            {
                logicalIndex = this.characterListP.indexOf(value);
            }
            else
            {
                logicalIndex = 0;
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            logicalIndex = 0;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'positive()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return logicalIndex;
    }

    public int position(String value)
    {
        int logicalIndex;

        if (this.TYPE == DataType.STRING)
        {
            if (this.stringListN.contains(value))
            {
                int actualIndex = this.stringListN.indexOf(value);
                logicalIndex = toNegative((actualIndex + 1));
            }
            else if (this.stringListP.contains(value))
            {
                logicalIndex = this.stringListP.indexOf(value);
            }
            else
            {
                logicalIndex = 0;
                System.out.println("Java NumberLineList Class Object - NumberLineList method 'position()' has no value equivalent to '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            logicalIndex = 0;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'positive()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return logicalIndex;
    }

    public boolean presence(int value)
    {
        boolean presence;

        if (this.TYPE == DataType.INTEGER)
        {
            if (this.integerListN.contains(value))
            {
                presence = true;
            }
            else if (this.integerListP.contains(value))
            {
                presence = true;
            }
            else
            {
                presence = false;
            }
        }
        else
        {
            presence = false;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'presence()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return presence;
    }

    public boolean presence(double value)
    {
        boolean presence;

        if (this.TYPE == DataType.DOUBLE)
        {
            if (this.doubleListN.contains(value))
            {
                presence = true;
            }
            else if (this.doubleListP.contains(value))
            {
                presence = true;
            }
            else
            {
                presence = false;
            }
        }
        else
        {
            presence = false;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'presence()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return presence;
    }

    public boolean presence(char value)
    {
        boolean presence;

        if (this.TYPE == DataType.CHARACTER)
        {
            if (this.characterListN.contains(value))
            {
                presence = true;
            }
            else if (this.characterListP.contains(value))
            {
                presence = true;
            }
            else
            {
                presence = false;
            }
        }
        else
        {
            presence = false;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'presence()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return presence;
    }

    public boolean presence(String value)
    {
        boolean presence;

        if (this.TYPE == DataType.STRING)
        {
            if (this.stringListN.contains(value))
            {
                presence = true;
            }
            else if (this.stringListP.contains(value))
            {
                presence = true;
            }
            else
            {
                presence = false;
            }
        }
        else
        {
            presence = false;
            System.out.println("Java NumberLineList Class Object - NumberLineList method 'presence()' is incompatible with the list datatype");
            System.out.println("                                 - NumberLineList type: " + this.TYPE);
            System.exit(1);
        }

        return presence;
    }

    public int getSize()
    {
        int size;

        if (this.TYPE == DataType.INTEGER)
        {
            size = (this.integerListN.size() + this.integerListP.size());
        }
        else if (this.TYPE == DataType.DOUBLE)
        {
            size = (this.doubleListN.size() + this.doubleListP.size());
        }
        else if (this.TYPE == DataType.CHARACTER)
        {
            size = (this.characterListN.size() + this.characterListP.size());
        }
        else if (this.TYPE == DataType.STRING)
        {
            size = (this.stringListN.size() + this.stringListP.size());
        }
        else
        {
            size = 0;
        }

        return size;
    }
}
