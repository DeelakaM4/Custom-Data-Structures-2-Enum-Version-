public class AnyType
{
    private final DataType TYPE;
    private int integerValue;
    private double doubleValue;
    private char characterValue;
    private String stringValue;

    public AnyType()
    {
        // Default Constructor
        this.TYPE = DataType.NONE;
    }

    public AnyType(int integerValue)
    {
        this.TYPE = DataType.INTEGER;
        this.integerValue = integerValue;
    }

    public AnyType(double doubleValue)
    {
        this.TYPE = DataType.DOUBLE;
        this.doubleValue = doubleValue;
    }

    public AnyType(char characterValue)
    {
        this.TYPE = DataType.CHARACTER;
        this.characterValue = characterValue;
    }

    public AnyType(String stringValue)
    {
        this.TYPE = DataType.STRING;
        this.stringValue = stringValue;
    }

    public int getInteger()
    {
        if (this.TYPE == DataType.INTEGER)
        {
            return this.integerValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getInteger()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return 0;
        }
    }

    public double getDouble()
    {
        if (this.TYPE == DataType.DOUBLE)
        {
            return this.doubleValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getDouble()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return 0.0;
        }
    }

    public char getCharacter()
    {
        if (this.TYPE == DataType.CHARACTER)
        {
            return this.characterValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getCharacter()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return ' ';
        }
    }

    public String getString()
    {
        if (this.TYPE == DataType.STRING)
        {
            return this.stringValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getString()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return "";
        }
    }

    public DataType getType()
    {
        return this.TYPE;
    }
}
