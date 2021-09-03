// Java Dictionary Class

import java.util.LinkedList;

public class Dictionary
{
    private final DataType TYPE;
    private LinkedList <String> keyList;
    private LinkedList <Integer> integerValueList;
    private LinkedList <Double> doubleValueList;
    private LinkedList <Character> characterValueList;
    private LinkedList <String> stringValueList;

    public Dictionary()
    {
        // Default Constructor

        this.TYPE = DataType.STRING;

        this.keyList = new LinkedList<>();
        this.stringValueList = new LinkedList<>();
    }

    public Dictionary(DataType type)
    {
        // Parameterized Constructor

        this.TYPE = type;

        if (this.TYPE == DataType.INTEGER)
        {
            this.keyList = new LinkedList<>();
            this.integerValueList = new LinkedList<>();
        }
        else if (this.TYPE == DataType.DOUBLE)
        {
            this.keyList = new LinkedList<>();
            this.doubleValueList = new LinkedList<>();
        }
        else if (this.TYPE == DataType.CHARACTER)
        {
            this.keyList = new LinkedList<>();
            this.characterValueList = new LinkedList<>();
        }
        else if (this.TYPE == DataType.STRING)
        {
            this.keyList = new LinkedList<>();
            this.stringValueList = new LinkedList<>();
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary type '" + type + "' is invalid");
            System.exit(1);
        }
    }

    public void setPair(String key, int value)
    {
        if (!(this.keyList.contains(key)))
        {
            if (this.TYPE == DataType.INTEGER)
            {
                this.keyList.addLast(key);
                this.integerValueList.addLast(value);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'setPair()' has incompatible argument '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    public void setPair(String key, double value)
    {
        if (!(this.keyList.contains(key)))
        {
            if (this.TYPE == DataType.DOUBLE)
            {
                this.keyList.addLast(key);
                this.doubleValueList.addLast(value);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'setPair()' has incompatible argument '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    public  void setPair(String key, char value)
    {
        if (!(this.keyList.contains(key)))
        {
            if (this.TYPE == DataType.CHARACTER)
            {
                this.keyList.addLast(key);
                this.characterValueList.addLast(value);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'setPair()' has incompatible argument '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    public void setPair(String key, String value)
    {
        if (!(this.keyList.contains(key)))
        {
            if (this.TYPE == DataType.STRING)
            {
                this.keyList.addLast(key);
                this.stringValueList.addLast(value);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'setPair()' has incompatible argument '" + value + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    public int getIntegerOf(String key)
    {
        int index;
        int value;

        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.INTEGER)
            {
                index = this.keyList.indexOf(key);
                value = this.integerValueList.get(index);
            }
            else
            {
                value = 0;
                System.out.println("Java Dictionary Class Object - Dictionary method 'getIntegerOf()' is incompatible with " + this.TYPE + " type");
                System.exit(1);
            }
        }
        else
        {
            value = 0;
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return value;
    }

    public double getDoubleOf(String key)
    {
        int index;
        double value;

        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.DOUBLE)
            {
                index = this.keyList.indexOf(key);
                value = this.doubleValueList.get(index);
            }
            else
            {
                value = 0.0;
                System.out.println("Java Dictionary Class Object - Dictionary method 'getDoubleOf()' is incompatible with " + this.TYPE + " type");
                System.exit(1);
            }
        }
        else
        {
            value = 0.0;
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return value;
    }

    public char getCharacterOf(String key)
    {
        int index;
        char value;

        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.CHARACTER)
            {
                index = this.keyList.indexOf(key);
                value = this.characterValueList.get(index);
            }
            else
            {
                value = ' ';
                System.out.println("Java Dictionary Class Object - Dictionary method 'getCharacterOf()' is incompatible with " + this.TYPE + " type");
                System.exit(1);
            }
        }
        else
        {
            value = ' ';
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return value;
    }

    public String getStringOf(String key)
    {
        int index;
        String value;

        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.STRING)
            {
                index = this.keyList.indexOf(key);
                value = this.stringValueList.get(index);
            }
            else
            {
                value = "";
                System.out.println("Java Dictionary Class Object - Dictionary method 'getStringOf()' is incompatible with " + this.TYPE + " type");
                System.exit(1);
            }
        }
        else
        {
            value = "";
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return value;
    }

    public boolean presenceOf(String key)
    {
        boolean present = false;

        for (String listKey : this.keyList) 
        {
            if (key.equals(listKey)) 
            {
                present = true;
                break;
            }
        }

        return present;
    }

    public void changeValueOf(String key, int newValue)
    {
        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.INTEGER)
            {
                int index = this.keyList.indexOf(key);
                this.integerValueList.set(index, newValue);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'changeValueOf()' has incompatible argument '" + newValue + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    public void changeValueOf(String key, double newValue)
    {
        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.DOUBLE)
            {
                int index = this.keyList.indexOf(key);
                this.doubleValueList.set(index, newValue);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'changeValueOf()' has incompatible argument '" + newValue + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    public void changeValueOf(String key, char newValue)
    {
        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.CHARACTER)
            {
                int index = this.keyList.indexOf(key);
                this.characterValueList.set(index, newValue);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'changeValueOf()' has incompatible argument '" + newValue + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    public void changeValueOf(String key, String newValue)
    {
        if (this.keyList.contains(key))
        {
            if (this.TYPE == DataType.STRING)
            {
                int index = this.keyList.indexOf(key);
                this.stringValueList.set(index, newValue);
            }
            else
            {
                System.out.println("Java Dictionary Class Object - Dictionary method 'changeValueOf()' has incompatible argument '" + newValue + "'");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    public void printDictionary()
    {
        if (!(this.keyList.isEmpty()))
        {
            if (this.TYPE == DataType.INTEGER)
            {
                for (int i = 0; i < this.keyList.size(); i++)
                {
                    System.out.println(this.keyList.get(i) + " : " + this.integerValueList.get(i));
                }
            }
            else if (this.TYPE == DataType.DOUBLE)
            {
                for (int i = 0; i < this.keyList.size(); i++)
                {
                    System.out.println(this.keyList.get(i) + " : " + this.doubleValueList.get(i));
                }
            }
            else if (this.TYPE == DataType.CHARACTER)
            {
                for (int i = 0; i < this.keyList.size(); i++)
                {
                    System.out.println(this.keyList.get(i) + " : " + this.characterValueList.get(i));
                }
            }
            else
            {
                for (int i = 0; i < this.keyList.size(); i++)
                {
                    System.out.println(this.keyList.get(i) + " : " + this.stringValueList.get(i));
                }
            }
        }
        else
        {
            System.out.println("");
        }
    }

    public void delete(String key)
    {
        if (this.keyList.contains(key))
        {
            int index = this.keyList.indexOf(key);

            if (this.TYPE == DataType.INTEGER)
            {
                this.integerValueList.remove(index);
                this.keyList.remove(index);
            }
            else if (this.TYPE == DataType.DOUBLE)
            {
                this.doubleValueList.remove(index);
                this.keyList.remove(index);
            }
            else if (this.TYPE == DataType.CHARACTER)
            {
                this.characterValueList.remove(index);
                this.keyList.remove(index);
            }
            else
            {
                this.stringValueList.remove(index);
                this.keyList.remove(index);
            }
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    public void deleteAll()
    {
        if (this.TYPE == DataType.INTEGER)
        {
            this.integerValueList.clear();
            this.keyList.clear();
        }
        else if (this.TYPE == DataType.DOUBLE)
        {
            this.doubleValueList.clear();
            this.keyList.clear();
        }
        else if (this.TYPE == DataType.CHARACTER)
        {
            this.characterValueList.clear();
            this.keyList.clear();
        }
        else
        {
            this.stringValueList.clear();
            this.keyList.clear();
        }
    }

    public int getSize()
    {
        return this.keyList.size();
    }
}
