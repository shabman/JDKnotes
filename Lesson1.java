package malik.java; // Prevent namespace collisions

/**
 *
 * @author mma1i
 */
public class Lesson1 
{
    public void hey()
    {
        System.out.println("Hey!");
    }
    public static void hello()
    {
        System.out.println("Hello!");
    }
    public static void main(String[] args)
    {
        Test object = new Test();
        object.getSomething();
        Hey obj = new Hey();
        obj.fuckyou();
    }
}

class Test
{
    public void getSomething()
    {
        Lesson1 object = new Lesson1();
        object.hey();
        Lesson1.hello();
    }
}

abstract class YesYou
{
    public abstract void yesyou();
}

class Hey extends YesYou
{
    // Override (implement) the abstract method which will implement the class
    public void yesyou()
    {
        System.out.println("ok");
    }
}

/*
Default - visible in package only
Protected visible to package and subclasses
Private, only visible to the class
Public - can be accessed from anywhere

Static - A method that can be accessed without an object being created.
Final - When a class, method or variable uses final, it's value cannot be changed. Good for constants.
Abstract - An abstract superclass would have an implemented value from its subclass(es)
Basically an abstract class hides a specific data and only shows what's important to the user.
When you have an abstract method, the class becomes abstract.
You don't have the implementation of an abstract class, so the subclass will implement it.
Same for methods, they do not have implementation and require subclasses to implement them.

Synchronized - Mainly to do with threading
meaning at a certain point only one thread will get control
Yet they are parallel excecution
Only 1 thread will get access and the other threads have to wait

Volatile - Mainly for memory visibility
We don't store this method in cache, but in direct memory.
We can get the most recent value assinged to a variable.
Volatile is not needed when using synchronized
*/


/*
Information on variables
Variable data is stored in memory and can be accessed through a variable.

Local:
If defined in a scope, it cannot be accessed anywhere else.
Once a control has left a method with a local variable
the garbage collector would kick in and clean out the variable
or make it ready for use again.

Instances:
Variables created using objects, it's at object level.
Can be changed per object.

Static variables are at class levels and are made with the class. 
*/
