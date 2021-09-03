// Java Mixed Dictionary Class

import java.util.LinkedList;

public class MixedDictionary extends Dictionary
{
    private LinkedList <String> keyList;
    private LinkedList <AnyType> valueList;

    public MixedDictionary()
    {
        this.keyList = new LinkedList<>();
        this.valueList = new LinkedList<>();
    }

    @Override
    public void setPair(String key, int value)
    {
        if (!(this.keyList.contains(key)))
        {
            AnyType anyTypeValue = new AnyType(value);

            this.keyList.addLast(key);
            this.valueList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    @Override
    public void setPair(String key, double value)
    {
        if (!(this.keyList.contains(key)))
        {
            AnyType anyTypeValue = new AnyType(value);

            this.keyList.addLast(key);
            this.valueList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    @Override
    public void setPair(String key, char value)
    {
        if (!(this.keyList.contains(key)))
        {
            AnyType anyTypeValue = new AnyType(value);

            this.keyList.addLast(key);
            this.valueList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    @Override
    public void setPair(String key, String value)
    {
        if (!(this.keyList.contains(key)))
        {
            AnyType anyTypeValue = new AnyType(value);

            this.keyList.addLast(key);
            this.valueList.addLast(anyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' already exists");
            System.exit(1);
        }
    }

    @Override
    public int getIntegerOf(String key)
    {
        int index;
        AnyType anyTypeValue;
        DataType type;
        int finalValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);
            anyTypeValue = this.valueList.get(index);
            type = anyTypeValue.getType();

            if (type == DataType.INTEGER)
            {
                finalValue = anyTypeValue.getInteger();
            }
            else
            {
                finalValue = 0;
                System.out.println("Java Dictionary Class Object - Dictionary method 'getIntegerOf()' is incompatible with " + type + " type");
                System.exit(1);
            }
        }
        else
        {
            finalValue = 0;
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return finalValue;
    }

    @Override
    public double getDoubleOf(String key)
    {
        int index;
        AnyType anyTypeValue;
        DataType type;
        double finalValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);
            anyTypeValue = this.valueList.get(index);
            type = anyTypeValue.getType();

            if (type == DataType.DOUBLE)
            {
                finalValue = anyTypeValue.getDouble();
            }
            else
            {
                finalValue = 0.0;
                System.out.println("Java MixedDictionary Class Object - Dictionary method 'getDoubleOf()' is incompatible with " + type + " type");
                System.exit(1);
            }
        }
        else
        {
            finalValue = 0.0;
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return finalValue;
    }

    @Override
    public char getCharacterOf(String key)
    {
        int index;
        AnyType anyTypeValue;
        DataType type;
        char finalValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);
            anyTypeValue = this.valueList.get(index);
            type = anyTypeValue.getType();

            if (type == DataType.CHARACTER)
            {
                finalValue = anyTypeValue.getCharacter();
            }
            else
            {
                finalValue = ' ';
                System.out.println("Java MixedDictionary Class Object - Dictionary method 'getCharacterOf()' is incompatible with " + type + " type");
                System.exit(1);
            }
        }
        else
        {
            finalValue = ' ';
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return finalValue;
    }

    @Override
    public String getStringOf(String key)
    {
        int index;
        AnyType anyTypeValue;
        DataType type;
        String finalValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);
            anyTypeValue = this.valueList.get(index);
            type = anyTypeValue.getType();

            if (type == DataType.STRING)
            {
                finalValue = anyTypeValue.getString();
            }
            else
            {
                finalValue = "";
                System.out.println("Java MixedDictionary Class Object - Dictionary method 'getStringOf()' is incompatible with " + type + " type");
                System.exit(1);
            }
        }
        else
        {
            finalValue = "";
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return  finalValue;
    }

    @Override
    public void changeValueOf(String key, int newValue)
    {
        int index;
        AnyType newAnyTypeValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);

            newAnyTypeValue = new AnyType(newValue);
            this.valueList.set(index, newAnyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    @Override
    public void changeValueOf(String key, double newValue)
    {
        int index;
        AnyType newAnyTypeValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);

            newAnyTypeValue = new AnyType(newValue);
            this.valueList.set(index, newAnyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    @Override
    public void changeValueOf(String key, char newValue)
    {
        int index;
        AnyType newAnyTypeValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);

            newAnyTypeValue = new AnyType(newValue);
            this.valueList.set(index, newAnyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    @Override
    public void changeValueOf(String key, String newValue)
    {
        int index;
        AnyType newAnyTypeValue;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);

            newAnyTypeValue = new AnyType(newValue);
            this.valueList.set(index, newAnyTypeValue);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    @Override
    public void printDictionary()
    {
        AnyType anyTypeValue;
        DataType type;

        if (!(this.keyList.isEmpty()))
        {
            for (int i = 0; i < this.keyList.size(); i++)
            {
                anyTypeValue = this.valueList.get(i);
                type = anyTypeValue.getType();

                if (type == DataType.INTEGER)
                {
                    System.out.println(this.keyList.get(i) + " : " + anyTypeValue.getInteger());
                }
                else if (type == DataType.DOUBLE)
                {
                    System.out.println(this.keyList.get(i) + " : " + anyTypeValue.getDouble());
                }
                else if (type == DataType.CHARACTER)
                {
                    System.out.println(this.keyList.get(i) + " : " + anyTypeValue.getCharacter());
                }
                else if (type == DataType.STRING)
                {
                    System.out.println(this.keyList.get(i)+ " : " + anyTypeValue.getString());
                }
                else
                {
                    System.out.println("");
                }
            }
        }
        else
        {
            System.out.println("");
        }
    }

    @Override
    public void delete(String key)
    {
        if (this.keyList.contains(key))
        {
            int index = this.keyList.indexOf(key);
            this.valueList.remove(index);
            this.keyList.remove(index);
        }
        else
        {
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }
    }

    @Override
    public void deleteAll()
    {
        this.keyList.clear();
        this.valueList.clear();
    }

    @Override
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

    @Override
    public int getSize()
    {
        return this.keyList.size();
    }

    public DataType valueTypeOf(String key)
    {
        int index;
        AnyType anyTypeValue;
        DataType type;

        if (this.keyList.contains(key))
        {
            index = this.keyList.indexOf(key);
            anyTypeValue = this.valueList.get(index);
            type = anyTypeValue.getType();
        }
        else
        {
            type = DataType.NONE;
            System.out.println("Java Dictionary Class Object - Dictionary key '" + key + "' is non existent");
            System.exit(1);
        }

        return type;
    }
}
