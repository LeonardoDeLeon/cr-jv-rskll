# Anonymous Object

## What is anonymous object?
Anonymous Object
: an object without a name

- use only once
- has no reference variable

### Example of anonymous object
```
class A 
{
    public A()
    {
        System.out.println("object A created");
    }
    public void show()
    {
        System.out.prntln("in A show");
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        new A().show(); // Anonymous object
    }
}
```

