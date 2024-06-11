# Anonymous Object

## What is anonymous object?

### Anonymous Object

- an object with no name
- can be used only once
- has no reference variable

### Digging deeper

Using class A below as an example,

```
class A
{
    void show()
    {
        System.out.println("in A show()");
    }
}
```

The code below shows a reference variable `obj` is created for class A.
The next line uses the `new` keyword to create object of A and assign it to `obj`

```
A obj;
obj = new A();
```

Behind the scene, the reference variable, `obj` is kept in stack memory as shown in table below.

| Reference Variable | Address |
|--------------------|---------|
|                    |         |
|                    |         |
| obj                | 101     |

Likewise, the actual object of A is kept in the heap memory as shown in figure below

	![alt text](anonymous-obj/stack-n-heap.png)

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
	![alt text](https://github.com/LeonardoDeLeon/cr-jv-rskll/tree/main/anonymous-obj/anonymous-obj/stack-n-heap.jpg?raw=true)

