//commnad line args
//this 
//garbage collection
//static
//stack and heap

class one
{
    int a;
    int b;
    
    /*STATIC VAR
Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution.
-It is a variable which belongs to the class and not to object(instance)
-Static variables are initialized only once, at the start of the execution. These variables will be initialized first, before the initialization of any instance variables
-A single copy to be shared by all instances of the class
-A static variable can be accessed directly by the class name and doesn’t need any object
    */
 

/*STATIC METHOD
Static method in Java is a method which belongs to the class and not to the object. A static method can access only static data.

-It is a method which belongs to the class and not to the object(instance)
-A static method can access only static data. It can not access non-static data (instance variables)
-A static method can call only other static methods and can not call a non-static method from it.
-A static method can be accessed directly by the class name and doesn’t need any object
-A static method cannot refer to "this" or "super" keywords in anyway
*/ 
    void setData(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    
    void showData()
    {
        System.out.println("value of a = " + this.a);
        System.out.println("value of b = " + this.b);
    }
}

class two
{
    public static void main(String arg[])
    {
        //CLA
        System.out.println("first CLA : " + arg[0]);
        System.out.println("second CLA : " + arg[1]);
        
        //this keyword
        one obj = new one();
        obj.setData(34,23);
        obj.showData();
        
    }
}