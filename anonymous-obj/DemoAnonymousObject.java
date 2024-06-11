class A
{
    public A()
    {
        System.out.println("object A created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}

public class DemoAnonymousObject
{
    public static void main(String[] args)
    {
        new A().show(); // anonymous object
    }
}