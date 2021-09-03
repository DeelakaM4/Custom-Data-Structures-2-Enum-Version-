// Java Mixed Array Class

public class MixedArray
{
    private AnyType[] mixedArray;

    @Deprecated
    public MixedArray()
    {
        // Default Constructor

        /**
         * @deprecated
         * This constructor declares the array length as 1.
         * Therefore, it is not suitable for common java practice.
         * Please refrain from using this default constructor.
         **/

        this.mixedArray = new AnyType[1];
    }

    public MixedArray(int size)
    {
        // Parameterized Constructor

        this.mixedArray = new AnyType[size];
    }

    private int nullCheck(AnyType[] methodArray)
    {
        int nullSpace = -1;

        for (int i = 0; i < methodArray.length; i++)
        {
            if (methodArray[i] == null)
            {
                nullSpace = i;
                break;
            }
        }

        return nullSpace;
    }

    public void add(int value)
    {
        int freeSpace = nullCheck(this.mixedArray);
        AnyType anyTypeValue;

        if (freeSpace >= 0)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[freeSpace] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array length is not sufficient to store the item <" + value + ">");
            System.exit(1);
        }
    }

    public void add(double value)
    {
        int freeSpace = nullCheck(this.mixedArray);
        AnyType anyTypeValue;

        if (freeSpace >= 0)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[freeSpace] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array length is not sufficient to store the item <" + value + ">");
            System.exit(1);
        }
    }

    public void add(char value)
    {
        int freeSpace = nullCheck(this.mixedArray);
        AnyType anyTypeValue;

        if (freeSpace >= 0)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[freeSpace] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array length is not sufficient to store the item <" + value + ">");
            System.exit(1);
        }
    }

    public void add(String value)
    {
        int freeSpace = nullCheck(this.mixedArray);
        AnyType anyTypeValue;

        if (freeSpace >= 0)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[freeSpace] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array length is not sufficient to store the item <" + value + ">");
            System.exit(1);
        }
    }

    public void add(int value, int index)
    {
        AnyType anyTypeValue;

        if (index < this.mixedArray.length)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[index] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }
    }

    public void add(double value, int index)
    {
        AnyType anyTypeValue;

        if (index < this.mixedArray.length)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[index] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }
    }

    public void add(char value, int index)
    {
        AnyType anyTypeValue;

        if (index < this.mixedArray.length)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[index] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }
    }

    public void add(String value, int index)
    {
        AnyType anyTypeValue;

        if (index < this.mixedArray.length)
        {
            anyTypeValue = new AnyType(value);
            this.mixedArray[index] = anyTypeValue;
        }
        else
        {
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }
    }

    public int getInteger(int index)
    {
        int value;
        DataType type;

        if (index < this.mixedArray.length)
        {
            if (this.mixedArray[index] != null)
            {
                AnyType anyTypeValue = this.mixedArray[index];
                type = anyTypeValue.getType();

                if (type == DataType.INTEGER)
                {
                    value = anyTypeValue.getInteger();
                }
                else
                {
                    value = 0;
                    System.out.println("Java MixedArray Class Object - Method 'getInteger()' is incompatible with " + type + " type");
                    System.exit(1);
                }
            }
            else
            {
                value = 0;
                System.out.println("Java MixedArray Class Object - The index <" + index + "> points to a null value");
                System.exit(1);
            }
        }
        else
        {
            value = 0;
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }

        return value;
    }

    public double getDouble(int index)
    {
        double value;
        DataType type;

        if (index < this.mixedArray.length)
        {
            if (this.mixedArray[index] != null)
            {
                AnyType anyTypeValue = this.mixedArray[index];
                type = anyTypeValue.getType();

                if (type == DataType.DOUBLE)
                {
                    value = anyTypeValue.getDouble();
                }
                else
                {
                    value = 0;
                    System.out.println("Java MixedArray Class Object - Method 'getDouble()' is incompatible with " + type + " type");
                    System.exit(1);
                }
            }
            else
            {
                value = 0;
                System.out.println("Java MixedArray Class Object - The index <" + index + "> points to a null value");
                System.exit(1);
            }
        }
        else
        {
            value = 0;
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }

        return value;
    }

    public char getCharacter(int index)
    {
        char value;
        DataType type;

        if (index < this.mixedArray.length)
        {
            if (this.mixedArray[index] != null)
            {
                AnyType anyTypeValue = this.mixedArray[index];
                type = anyTypeValue.getType();

                if (type == DataType.CHARACTER)
                {
                    value = anyTypeValue.getCharacter();
                }
                else
                {
                    value = ' ';
                    System.out.println("Java MixedArray Class Object - Method 'getCharacter()' is incompatible with " + type + " type");
                    System.exit(1);
                }
            }
            else
            {
                value = ' ';
                System.out.println("Java MixedArray Class Object - The index <" + index + "> points to a null value");
                System.exit(1);
            }
        }
        else
        {
            value = ' ';
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }

        return value;
    }

    public String getString(int index)
    {
        String value;
        DataType type;

        if (index < this.mixedArray.length)
        {
            if (this.mixedArray[index] != null)
            {
                AnyType anyTypeValue = this.mixedArray[index];
                type = anyTypeValue.getType();

                if (type == DataType.STRING)
                {
                    value = anyTypeValue.getString();
                }
                else
                {
                    value = "";
                    System.out.println("Java MixedArray Class Object - Method 'getString()' is incompatible with " + type + " type");
                    System.exit(1);
                }
            }
            else
            {
                value = "";
                System.out.println("Java MixedArray Class Object - The index <" + index + "> points to a null value");
                System.exit(1);
            }
        }
        else
        {
            value = "";
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }

        return value;
    }

    public int getLength()
    {
        return this.mixedArray.length;
    }

    public DataType getType(int index)
    {
        AnyType anyTypeValue;
        DataType type;

        if (index < this.mixedArray.length)
        {
            anyTypeValue = this.mixedArray[index];
            type = anyTypeValue.getType();
        }
        else
        {
            type = DataType.NONE;
            System.out.println("Java MixedArray Class Object - Array index <"+ index +"> is not valid");
            System.exit(1);
        }

        return type;
    }
}
